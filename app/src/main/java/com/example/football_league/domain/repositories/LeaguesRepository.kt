package com.example.football_league.domain.repositories

import com.example.football_league.data.local.LeaguesEntity
import com.example.football_league.data.remote.dto.DataLeaguesDto

internal interface LeaguesRepository {
    suspend fun getLeagues(): List<DataLeaguesDto>
    suspend fun getLocalLeagues(): List<LeaguesEntity>
    suspend fun getClubsFromLocal(): LeaguesEntity?
    //TODO  Потом будет под клубы
//    suspend fun getLocalRepositoryById(): LeaguesEntity?
}
