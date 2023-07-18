package com.example.football_league.di.module.repositories

import com.example.football_league.data.local.LeaguesDao
import com.example.football_league.data.repository.local.LeaguesLocal
import com.example.football_league.data.repository.local.LeaguesLocalImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class LocalRepositoryModule {
    @Provides
    fun providePostsLocal(leaguesDao: LeaguesDao): LeaguesLocal =
        LeaguesLocalImpl(leaguesDao = leaguesDao)
}