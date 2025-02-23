package com.payto.feature.journeydetail

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute
import com.payto.common.navigate.JourneyDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class JourneyDetailViewModel @Inject constructor(savedStateHandle: SavedStateHandle) : ViewModel() {

    val detail = savedStateHandle.toRoute<JourneyDetail>()

    init {
        Log.e("흐흐", "JourneyDetailViewModel init ${this.hashCode()}, detail $detail")
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("흐흐", "JourneyDetailViewModel onCleared ${this.hashCode()}")
    }
}
