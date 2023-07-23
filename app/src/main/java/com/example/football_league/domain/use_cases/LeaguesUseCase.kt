package com.example.football_league.domain.use_cases

import com.example.football_league.data.remote.dto.toDomainLeagues
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.domain.repositories.LeaguesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class LeaguesUseCase @Inject constructor(
    private val leaguesRepository: LeaguesRepository
) {
    suspend fun getLeagues(): List<DomainLeagues> =
        leaguesRepository.getLeagues().map { leaguesDto ->
            leaguesDto.toDomainLeagues()
        }
}