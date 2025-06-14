package com.payto.feature.journey.expense

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import androidx.navigation.toRoute
import com.payto.model.navigate.ExpenseSetting
import com.payto.data.repository.ExpenseSettingRepository
import com.payto.feature.common.ShowSnackbar
import com.payto.feature.common.UiEvent
import com.payto.feature.common.arch.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExpenseSettingViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    val repository: ExpenseSettingRepository
) : BaseViewModel() {

    private val route = savedStateHandle.toRoute<ExpenseSetting>()
    val model = repository.getMemberList(route.journeyId)
        .catch {
            showErrorMessage()
        }
        .stateIn(viewModelScope, SharingStarted.Eagerly, null)

    override fun onEvent(event: UiEvent) {
        event as? ExpenseSettingEvent ?: return
        when (event) {
            is OnParticipantsChange -> {
                updateMemberInfo(event)
            }

            is OnPayerChange -> {
                updatePayer(event.name)
            }
        }
    }

    private fun updateMemberInfo(event: OnParticipantsChange) {
        if (event.name == model.value?.payer) {
            showSnackbar("결제자는 비활성화 할 수 없습니다.", status = ShowSnackbar.Status.FAIL)
            return
        }
        viewModelScope.launch {
            runCatching {
                repository.updateMemberInfo(route.journeyId, event.name, event.exclude)
            }.onFailure {
                showErrorMessage()
            }
        }
    }

    private fun updatePayer(payer: String) {
        if (model.value?.payer == payer) return

        viewModelScope.launch {
            runCatching {
                repository.updatePayer(route.journeyId, payer)
            }.onFailure {
                showErrorMessage()
            }
        }
    }
}
