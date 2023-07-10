package com.example.football_league.di.base

import android.content.Context
import androidx.room.Room
import com.example.football_league.data.local.LeaguesDatabase
import com.example.football_league.data.local.LeaguesEntity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): LeaguesDatabase =
        Room.databaseBuilder(
            context, LeaguesDatabase::class.java,
            "leagues_db"
        )
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideDao(db: LeaguesDatabase) = db.leaguesDao()

    @Provides
    fun provideEntity() = LeaguesEntity()
}