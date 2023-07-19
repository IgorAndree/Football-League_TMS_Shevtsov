package com.example.football_league.data.repository.local

import com.example.football_league.data.local.LeaguesDao
import com.example.football_league.data.local.LeaguesEntity
import javax.inject.Inject

class LeaguesLocalImpl @Inject constructor(
    private val leaguesDao: LeaguesDao
) : LeaguesLocal {
    override suspend fun getLocalLeagues(): List<LeaguesEntity>? = leaguesDao.getAll()

    override suspend fun getById(leagueId: Long): LeaguesEntity? =
        leaguesDao.getById(leagueId = leagueId)

    override suspend fun insertLeagues(leagues: LeaguesEntity) {
        leaguesDao.insert(leaguesEntity = leagues)
    }

    override suspend fun deleteLeagues(leagues: LeaguesEntity) {
        leaguesDao.delete(leaguesEntity = leagues)
    }

    override suspend fun updateLeagues(leagues: LeaguesEntity) {
        leaguesDao.update(leaguesEntity = leagues)
    }
}
