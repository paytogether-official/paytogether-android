package com.payto.model

data class JourneyDetailModel(
    val journeyInfo: JourneyInfoModel = JourneyInfoModel(),
    val list: List<ExpenseGroupByDateModel> = listOf(),
    val params: ExpenseParams = ExpenseParams(),
) {
    fun updateOrder(order: JourneyDetailOrder): JourneyDetailModel {
        return this.copy(params = params.copy(order = order))
    }

    fun updateCurrency(currency: String): JourneyDetailModel {
        return this.copy(params = params.copy(quoteCurrency = currency))
    }

    fun updateDate(date: String?): JourneyDetailModel {
        return this.copy(params = params.copy(expenseDate = date))
    }
}

data class ExpenseGroupByDateModel(
    val date: String = "",
    val list: List<JourneyExpenseModel> = listOf()
)
