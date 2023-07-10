package com.example.football_league.data.repository.local

import com.example.football_league.data.local.LeaguesEntity

interface LeaguesLocal {
    suspend fun getLocalLeagues(): List<LeaguesEntity>?
    suspend fun getById(league_id: Long): LeaguesEntity?
    suspend fun insertLeagues(leagues: LeaguesEntity)
    suspend fun deleteLeagues(leagues: LeaguesEntity)
    suspend fun updateLeagues(leagues: LeaguesEntity)
}