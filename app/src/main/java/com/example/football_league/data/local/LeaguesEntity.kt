package com.example.football_league.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.football_league.domain.models.DomainLeagues

@Entity
data class LeaguesEntity(
    @PrimaryKey(autoGenerate = true)
    var league_id: Int? = 0,
    @ColumnInfo(name = "name")
    val name: String? = null,
    @ColumnInfo(name = "country")
    var country: String? = null,
    @ColumnInfo(name = "logo")
    var logo: String? = null
)

fun LeaguesEntity.toLeagues() =
    DomainLeagues(
        name = name,
        country = country,
        logo = logo
    )
