package com.payto.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.payto.data.database.dao.JourneyDao
import com.payto.data.database.entity.JourneyEntity

@Database(entities = [JourneyEntity::class], version = 1)
@TypeConverters(TypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    internal abstract fun journeyDao(): JourneyDao
}
