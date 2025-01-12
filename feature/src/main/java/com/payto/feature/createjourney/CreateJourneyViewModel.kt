package com.payto.feature.createjourney

import android.util.Log
import androidx.lifecycle.ViewModel
import com.payto.feature.common.EventInterface
import com.payto.feature.common.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class CreateJourneyViewModel @Inject constructor() : ViewModel(), EventInterface {

    private val randomNameSet: MutableSet<String>

    val journeyData = MutableStateFlow(CreateJourneyData(people = listOf("요정")))

    init {
        Log.e("흐흐", "CreateJourneyViewModel init ${this.hashCode()}")
        randomNameSet = createRandomNameSet()

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
                        journeyDate = CreateJourneyData.JourneyDate(
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
        }
    }

    private fun addPerson() {
        val old = journeyData.value
        val name = randomNameSet.firstOrNull() ?: return // TODO null 이면?
        journeyData.value = old.copy(people = old.people.plus(name))
        randomNameSet.remove(name)
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "CreateJourneyViewModel onCleared ${this.hashCode()}")
    }
}

