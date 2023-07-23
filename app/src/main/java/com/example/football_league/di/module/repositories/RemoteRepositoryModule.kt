package com.example.football_league.di.module.repositories

import com.example.football_league.data.remote.api.LeaguesApi
import com.example.football_league.data.repository.remote.LeaguesRemote
import com.example.football_league.data.repository.remote.LeaguesRemoteImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal class RemoteRepositoryModule {
    @Singleton
    @Provides
    fun provideLeaguesRemote(leaguesApi: LeaguesApi): LeaguesRemote =
        LeaguesRemoteImpl(leaguesApi = leaguesApi)
}