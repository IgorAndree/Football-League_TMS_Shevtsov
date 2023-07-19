package com.example.football_league.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

//TODO add internal (везде по приложению)
@Database(entities = [LeaguesEntity::class], version = 2, exportSchema = false)
abstract class LeaguesDatabase : RoomDatabase() {
    abstract fun leaguesDao(): LeaguesDao
}