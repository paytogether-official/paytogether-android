package com.payto.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.payto.data.database.entity.JourneyEntity

@Dao
internal interface JourneyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(journey: JourneyEntity)

    @Delete
    suspend fun delete(journey: JourneyEntity)
}
