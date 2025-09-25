package com.payto.feature.journeysetting

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.data.repository.JourneySettingRepository
import com.payto.feature.common.PopBackStack
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.feature.createjourney.ClickAddPerson
import com.payto.feature.createjourney.OnExchangeRateChange
import com.payto.feature.createjourney.OnJourneyDateChange
import com.payto.feature.createjourney.OnNameChange
import com.payto.model.CreateJourneyModel
import com.payto.model.CreateJourneyModel.JourneyDate
import com.payto.model.navigate.JourneySetting
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JourneySettingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    val repository: JourneySettingRepository,
) : BaseViewModel() {

    val route = savedStateHandle.toRoute<JourneySetting>()
    val journeyData = MutableStateFlow<CreateJourneyModel?>(null)
    private val randomNameSet: MutableSet<String> = createRandomNameSet()

    init {
        fetchData()
    }

    // TODO CreateJourneyViewModel과 같은 로직 리팩토링
    private fun createRandomNameSet(): MutableSet<String> {
        val surnames = listOf("정산", "페이", "나눔", "돈", "머니", "여행")
        val names = listOf("빌런", "귀신", "도둑", "거지", "만수르", "부자", "마법사", "요정")

        return surnames.flatMap { surname ->
            names.map { name -> "$surname$name" }
        }.shuffled().toMutableSet()
    }

    private fun fetchData() {
        viewModelScope.launch {
            runCatching {
                repository.getJourneySettingData(route.journeyId)
            }.onSuccess {
                journeyData.value = it
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    override fun onEvent(event: UiEvent) {
        when (event) {
            ClickEdit -> {
                updateJourney()
            }

            ClickAddPerson -> {
                addPerson()
            }

            is OnJourneyDateChange -> {
                if (event.startTimeMill != null && event.endTimeMill != null) {
                    journeyData.value = journeyData.value?.copy(
                        journeyDate = JourneyDate(
                            startTimeMill = event.startTimeMill,
                            endTimeMill = event.endTimeMill
                        )
                    )
                }
            }

            is OnNameChange -> {
                val name = event.name
                val members = journeyData.value?.members
                val newMember = members?.toMutableList()?.apply {
                    this[event.index] = this[event.index].copy(name = name)
                }
                journeyData.value =
                    journeyData.value?.copy(members = newMember?.toList() ?: emptyList())
            }

            is OnExchangeRateChange -> {
                if (event.rate.toDoubleOrNull() == null && event.rate.isNotEmpty()) {
                    viewModelScope.launch {
                        _sideEffectEvent.emit(
                            ShowSnackbar(
                                message = "숫자만 입력해주세요.",
                                status = ShowSnackbar.Status.FAIL
                            )
                        )
                    }
                }
                journeyData.value = journeyData.value?.copy(
                    exchangeRateModel = event.exchangeRateModel.copy(exchangeRate = event.rate)
                )
            }
        }
    }

    private fun updateJourney() {
        if (checkJourneyValidation()) {
            viewModelScope.launch {
                runCatching {
                    repository.updateJourney(route.journeyId, journeyData.value)
                    _sideEffectEvent.emit(PopBackStack)
                }.onFailure {
                    showErrorMessage()
                }
            }
        }
    }

    private fun addPerson() {
        val old = journeyData.value
        val name = randomNameSet.firstOrNull() ?: return
        journeyData.value = old?.copy(members = old.members.plus(CreateJourneyModel.Member(name)))
        randomNameSet.remove(name)
    }

    private fun checkJourneyValidation(): Boolean {
        when {
            journeyData.value?.hasDuplicateName() == true -> {
                showSnackbar(message = "인원이 중복됩니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value?.hasEmptyName() == true -> {
                showSnackbar(message = "이름에 공백이 존재합니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value?.isFullyFilled()?.not() == true -> {
                showSnackbar(message = "모든 정보를 입력해주세요.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value?.over30Member() == true -> {
                showSnackbar(message = "참여 인원은 최대 30명까지 가능합니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }
        }
        return true
    }
}
