package com.example.football_league.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LeaguesEntity::class], version = 1)
abstract class LeaguesDatabase : RoomDatabase() {
    abstract fun leaguesDao(): LeaguesDao
}