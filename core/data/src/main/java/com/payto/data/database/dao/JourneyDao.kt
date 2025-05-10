package com.payto.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.payto.data.database.entity.JourneyEntity

@Dao
internal interface JourneyDao {

    @Query("SELECT * FROM Journey WHERE isClosed = 0")
    suspend fun getOngoingJourneys(): List<JourneyEntity>

    @Query("SELECT * FROM Journey")
    suspend fun getJourneys(): List<JourneyEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(journey: JourneyEntity)

    @Delete
    suspend fun delete(journey: JourneyEntity)
}
