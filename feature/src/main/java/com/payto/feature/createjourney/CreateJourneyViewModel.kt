package com.payto.feature.createjourney

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.payto.model.navigate.Journey
import com.payto.data.repository.CreateJourneyRepository
import com.payto.feature.common.Navigate
import com.payto.feature.common.PopBackStack
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import com.payto.model.Country
import com.payto.model.CreateJourneyModel
import com.payto.model.CreateJourneyModel.JourneyDate
import com.payto.model.ExchangeRateModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateJourneyViewModel @Inject constructor(
    val repository: CreateJourneyRepository
) : BaseViewModel() {

    private val randomNameSet: MutableSet<String> = createRandomNameSet()

    val journeyData = MutableStateFlow(CreateJourneyModel(members = listOf("")))

    private val exchangeRateMap = MutableStateFlow<Map<String, ExchangeRateModel>>(mapOf())

    init {
        fetchExchangeRate()
    }

    private fun createRandomNameSet(): MutableSet<String> {
        val surnames = listOf("정산", "페이", "나눔", "돈", "머니", "여행")
        val names = listOf("빌런", "귀신", "도둑", "거지", "만수르", "부자", "마법사", "요정")

        return surnames.flatMap { surname ->
            names.map { name -> "$surname$name" }
        }.shuffled().toMutableSet()
    }

    override fun onEvent(event: UiEvent) {
        if (event !is CreateJourneyEvent) return

        when (event) {
            ClickAddPerson -> {
                addPerson()
            }

            is OnJourneyTitleChange -> {
                journeyData.value = journeyData.value.copy(title = event.title)
            }

            ClickCreate -> {
                createJourney()
            }

            is OnJourneyDateChange -> {
                if (event.startTimeMill != null && event.endTimeMill != null) {
                    journeyData.value = journeyData.value.copy(
                        journeyDate = JourneyDate(
                            startTimeMill = event.startTimeMill,
                            endTimeMill = event.endTimeMill
                        )
                    )
                }
            }

            is OnNameChange -> {
                val name = event.name
                val members = journeyData.value.members
                val newMember = members.toMutableList().apply {
                    this[event.index] = name
                }
                journeyData.value = journeyData.value.copy(members = newMember.toList())
            }

            is OnCountryChange -> {
                onCountryChange(selectedCountry = event.country)

            }

            is OnExchangeRateChange -> {
                if (event.rate.toDoubleOrNull() == null && event.rate.isNotEmpty()) {
                    viewModelScope.launch {
                        _sideEffectEvent.emit(
                            ShowSnackbar(
                                message = "숫자만 입력 TODO 문구",
                                status = ShowSnackbar.Status.FAIL
                            )
                        )
                    }
                }
                journeyData.value = journeyData.value.copy(
                    exchangeRateModel = event.exchangeRateModel.copy(exchangeRate = event.rate)
                )
            }
        }
    }

    private fun onCountryChange(selectedCountry: Country) {
        journeyData.value = journeyData.value.copy(
            country = selectedCountry,
            exchangeRateModel = exchangeRateMap.value[selectedCountry.currency]
                ?: ExchangeRateModel()
        )
    }

    private fun fetchExchangeRate() {
        viewModelScope.launch {
            runCatching {
                exchangeRateMap.value =
                    repository.getExchangeRate().associateBy { it.currency.toString() }
            }
        }
    }

    private fun addPerson() {
        val old = journeyData.value
        val name = randomNameSet.firstOrNull() ?: return
        journeyData.value = old.copy(members = old.members.plus(name))
        randomNameSet.remove(name)
    }

    private fun createJourney() {
        if (checkJourneyValidation()) {
            viewModelScope.launch {
                runCatching {
                    val journey = repository.createJourney(journeyData.value)
                    showSnackbar(message = "생성된 여정으로 이동합니다!", status = ShowSnackbar.Status.SUCCESS)
                    _sideEffectEvent.emit(PopBackStack)
                    _sideEffectEvent.emit(Navigate(Journey(journey.id)))
                }
            }
        }
    }

    private fun checkJourneyValidation(): Boolean {
        when {
            journeyData.value.hasDuplicateName() -> {
                showSnackbar(message = "인원이 중복됩니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value.hasEmptyName() -> {
                showSnackbar(message = "이름에 공백이 존재합니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value.isFullyFilled().not() -> {
                showSnackbar(message = "모든 정보를 입력해주세요.", status = ShowSnackbar.Status.FAIL)
                return false
            }

            journeyData.value.over30Member() -> {
                showSnackbar(message = "참여 인원은 최대 30명까지 가능합니다.", status = ShowSnackbar.Status.FAIL)
                return false
            }
        }
        return true
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "CreateJourneyViewModel onCleared ${this.hashCode()}")
    }
}
