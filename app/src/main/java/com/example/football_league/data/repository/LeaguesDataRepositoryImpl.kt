package com.example.football_league.data.repository

import com.example.football_league.data.local.LeaguesEntity
import com.example.football_league.data.remote.dto.DataLeaguesDto
import com.example.football_league.data.remote.dto.toLocalLeagues
import com.example.football_league.data.repository.local.LeaguesLocal
import com.example.football_league.data.repository.remote.LeaguesRemote
import com.example.football_league.domain.repositories.LeaguesRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class LeaguesDataRepositoryImpl @Inject constructor(
    private val leaguesRemote: LeaguesRemote,
    private val leaguesLocal: LeaguesLocal
) : LeaguesRepository {
    override suspend fun getLeagues(): List<DataLeaguesDto> {
        val leaguesList = leaguesRemote.getLeagues().results.leagues
        val values = leaguesList.values.toMutableList()
        if (leaguesList.isNotEmpty()) {
            leaguesList.forEach { leaguesDto ->
                leaguesLocal.insertLeagues(
                    leaguesDto.value.toLocalLeagues()
                )
            }
        }
        return values
    }

    override suspend fun getLocalLeagues(): List<LeaguesEntity> =
        leaguesLocal.getLocalLeagues().orEmpty()

    override suspend fun getLeaguesInfoFromLocal(): LeaguesEntity? {
        return null
    }
}
