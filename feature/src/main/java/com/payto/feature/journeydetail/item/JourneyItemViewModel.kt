package com.payto.feature.journeydetail.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.payto.common.navigate.JourneyItemDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class JourneyItemViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {
    private val data = savedStateHandle.toRoute<JourneyItemDetail>()

    val item = MutableStateFlow(
        JourneyItemData(
            title = data.title,
            list = listOf(
                ParticipantInfo(name = "가망이", amount = 10000),
                ParticipantInfo(name = "니망이", amount = 10000),
                ParticipantInfo(name = "다망이", amount = 10000),
                ParticipantInfo(name = "라망이", amount = 10000)
            )
        )
    )
}
