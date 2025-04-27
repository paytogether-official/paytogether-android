package com.payto.feature.localcomposition

import androidx.compose.runtime.compositionLocalOf
import com.payto.data.repository.CreateJourneyRepository

val LocalCreateJourneyRepository = compositionLocalOf<CreateJourneyRepository> {
    error("Repository not provided")
}