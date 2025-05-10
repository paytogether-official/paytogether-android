package com.payto.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Journey")
internal data class JourneyEntity(
    @PrimaryKey val id: String,
    val isClosed: Boolean,
)
