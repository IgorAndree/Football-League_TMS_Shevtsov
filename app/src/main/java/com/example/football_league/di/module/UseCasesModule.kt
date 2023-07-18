package com.example.football_league.di.module

import com.example.football_league.domain.repositories.LeaguesRepository
import com.example.football_league.domain.use_cases.LeaguesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    //    @Singleton
//    @Provides
//    fun provideClubsUseCase(clubsRepository: ClubsRepository) =
//        GetClubsUseCase(clubsRepository = clubsRepository)
    @Singleton
    @Provides
    fun provideLeaguesUseCase(leaguesRepository: LeaguesRepository) =
        LeaguesUseCase(leaguesRepository = leaguesRepository)
}