package com.example.football_league.data.remote.dto

import com.example.football_league.data.local.LeaguesEntity
import com.example.football_league.domain.models.DomainLeagues
import com.google.gson.annotations.SerializedName

data class DataLeaguesDto(
    @SerializedName("name")
    val name: String?,
    @SerializedName("country")
    val country: String?
)

fun DataLeaguesDto.toDomainLeagues() =
    DomainLeagues(
        name = name,
        country = country,
        //logo = logo
    )

fun DataLeaguesDto.toLocalLeagues() =
    LeaguesEntity(
        name = name,
        country = country,
       // logo = logo
    )