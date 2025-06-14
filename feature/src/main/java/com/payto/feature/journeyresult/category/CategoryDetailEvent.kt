package com.payto.feature.journeyresult.category

import com.payto.feature.common.UiEvent
import com.payto.model.ExpenseCategory

interface CategoryDetailEvent : UiEvent

data class OnChangeCategory(
    val category: ExpenseCategory
) : CategoryDetailEvent
