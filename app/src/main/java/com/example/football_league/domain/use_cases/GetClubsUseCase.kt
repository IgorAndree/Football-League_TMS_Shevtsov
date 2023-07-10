package com.example.football_league.domain.use_cases

import com.example.football_league.data.local.toLeagues
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.domain.repositories.LeaguesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetClubsUseCase @Inject constructor
    (
    private val leaguesRepository: LeaguesRepository
) {//TODO Потом сделать под клубы
    suspend fun getClubsById(): DomainLeagues? =
        leaguesRepository.getLocalRepositoryById()?.toLeagues()
}
