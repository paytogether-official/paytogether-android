package com.payto.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.payto.data.database.entity.JourneyEntity
import kotlinx.coroutines.flow.Flow

@Dao
internal interface JourneyDao {

    @Query("SELECT * FROM Journey WHERE isClosed = 0")
    suspend fun getOngoingJourneys(): List<JourneyEntity>

    @Query("SELECT * FROM Journey WHERE id = :id")
    suspend fun getJourney(id: String): JourneyEntity?

    @Query("SELECT * FROM Journey WHERE id = :id")
    fun getJourneyFlow(id: String): Flow<JourneyEntity>

    @Query("SELECT * FROM Journey")
    suspend fun getJourneys(): List<JourneyEntity>

    @Query("SELECT payer FROM Journey WHERE id = :id")
    suspend fun getJourneyPayer(id: String): String

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(journey: JourneyEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(list: List<JourneyEntity>)

    @Delete
    suspend fun delete(journey: JourneyEntity)
}
