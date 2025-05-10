package com.payto.data.database

import android.content.Context
import androidx.room.Room
import com.payto.data.database.dao.JourneyDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "paytogether_database"
        ).build()
    }

    @Provides
    internal fun provideJourneyDao(db: AppDatabase): JourneyDao {
        return db.journeyDao()
    }
}
