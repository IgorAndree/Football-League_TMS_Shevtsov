package com.example.football_league.data.remote.dto

import com.example.football_league.data.local.LeaguesEntity
import com.example.football_league.domain.models.DomainLeagues
import com.google.gson.annotations.SerializedName

internal data class DataLeaguesDto(
    @SerializedName("name")
    val name: String?,
    @SerializedName("country")
    val country: String?,
    @SerializedName("logo")
    val logo: String?
)

internal fun DataLeaguesDto.toDomainLeagues() =
    DomainLeagues(
        name = name,
        country = country,
        logo = logo
    )

internal fun DataLeaguesDto.toLocalLeagues() =
    LeaguesEntity(
        leagueId = Math.random().toLong(),
        name = name,
        country = country,
        logo = logo
    )