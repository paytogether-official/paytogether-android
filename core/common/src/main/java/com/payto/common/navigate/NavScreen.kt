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
data class JourneyExpenseItemDetail(val journeyId: String, val expenseId: Int)

@Serializable
data object JoinJourney

@Serializable
data class JourneyResult(val journeyId: String)

@Serializable
data object CategoryDetail


