package com.example.football_league.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class LeaguesEntity(
    @PrimaryKey(autoGenerate = true)
    var leagueId: Long? = Math.random().toLong(),
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "country")
    var country: String? = null,
    @ColumnInfo(name = "logo")
    var logo: String? = null
)
