package com.example.football_league.di.module.repositories

import com.example.football_league.data.repository.LeaguesDataRepositoryImpl
import com.example.football_league.data.repository.local.LeaguesLocal
import com.example.football_league.data.repository.remote.LeaguesRemote
import com.example.football_league.domain.repositories.LeaguesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun provideLeaguesRepository(
        leaguesRemote: LeaguesRemote,
        leaguesLocal: LeaguesLocal
    ): LeaguesRepository =
        LeaguesDataRepositoryImpl(
            leaguesRemote = leaguesRemote,
            leaguesLocal = leaguesLocal
        )
}