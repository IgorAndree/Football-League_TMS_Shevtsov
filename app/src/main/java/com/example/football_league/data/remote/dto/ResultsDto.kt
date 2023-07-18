package com.example.football_league.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ResultsDto(
    @SerializedName("results")
    val results: Long,

    @SerializedName("leagues")
    val leagues: Map<String, DataLeaguesDto>
)