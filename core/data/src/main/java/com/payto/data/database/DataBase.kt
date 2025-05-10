package com.payto.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.payto.data.database.dao.JourneyDao
import com.payto.data.database.entity.JourneyEntity

@Database(entities = [JourneyEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    internal abstract fun journeyDao(): JourneyDao
}
