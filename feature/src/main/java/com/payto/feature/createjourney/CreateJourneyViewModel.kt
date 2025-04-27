package com.payto.feature.createjourney

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.payto.data.repository.CreateJourneyRepository
import com.payto.feature.common.EventInterface
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.SideEffectEvent
import com.payto.feature.common.UiEvent
import com.payto.feature.createjourney.CreateJourneyData.JourneyDate
import com.payto.model.Country
import com.payto.model.ExchangeRateModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateJourneyViewModel @Inject constructor(
    val repository: CreateJourneyRepository
) : ViewModel(), EventInterface {

    private val _sideEffectEvent = MutableSharedFlow<SideEffectEvent>()
    override val sideEffectEvent: SharedFlow<SideEffectEvent> = _sideEffectEvent

    private val randomNameSet: MutableSet<String> = createRandomNameSet()

    val journeyData = MutableStateFlow(CreateJourneyData(people = listOf("")))

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
                // TODO
                if (journeyData.value.hasDuplicateName()) {
                    // 중복 처리
                }
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
                val people = journeyData.value.people
                val newPeople = people.toMutableList().apply {
                    this[event.index] = name
                }
                journeyData.value = journeyData.value.copy(people = newPeople.toList())
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
        journeyData.value = old.copy(people = old.people.plus(name))
        randomNameSet.remove(name)
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "CreateJourneyViewModel onCleared ${this.hashCode()}")
    }
}

