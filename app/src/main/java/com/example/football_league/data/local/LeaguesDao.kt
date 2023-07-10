package com.example.football_league.data.local

import androidx.room.*

@Dao
interface LeaguesDao {
    @Query("SELECT * FROM LeaguesEntity")
    suspend fun getAll(): List<LeaguesEntity>?

    @Query("SELECT * FROM LeaguesEntity public WHERE league_id = :league_id")
    suspend fun getById(league_id: Long): LeaguesEntity?

    @Insert
    suspend fun insert(leaguesEntity: LeaguesEntity?)

    @Update
    suspend fun update(leaguesEntity: LeaguesEntity?)

    @Delete
    suspend fun delete(leaguesEntity: LeaguesEntity?)
}