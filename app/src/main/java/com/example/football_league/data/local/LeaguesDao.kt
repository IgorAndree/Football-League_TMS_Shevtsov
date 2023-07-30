package com.example.football_league.data.local

import androidx.room.*

@Dao
internal interface LeaguesDao {
    @Query("SELECT * FROM LeaguesEntity")
    suspend fun getAll(): List<LeaguesEntity>?

    @Query("SELECT * FROM LeaguesEntity public WHERE leagueId = :leagueId")
    suspend fun getById(leagueId: Long): LeaguesEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(leaguesEntity: LeaguesEntity?)

    @Update
    suspend fun update(leaguesEntity: LeaguesEntity?)

    @Delete
    suspend fun delete(leaguesEntity: LeaguesEntity?)
}