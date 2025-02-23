package com.payto.common.navigate

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data object CreateJourney

@Serializable
data object PastJourney

@Serializable
data class JourneyDetail(val journeyId: String)