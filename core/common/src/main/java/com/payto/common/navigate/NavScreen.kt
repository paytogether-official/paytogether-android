package com.payto.common.navigate

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data object CreateJourney

@Serializable
data object JourneyHistory

@Serializable
data class JourneyDetail(val journeyId: String)

@Serializable
data class Journey(val journeyId: String)

@Serializable
data class JourneyExpenseItemDetail(
    val journeyId: String,
    val expenseId: Int,
    val quoteCurrency: String
)

@Serializable
data object JoinJourney

@Serializable
data class JourneyResult(
    val journeyId: String,
    val quoteCurrency: String
)

@Serializable
data object CategoryDetail

@Serializable
data class ExpenseSetting(val journeyId: String)


