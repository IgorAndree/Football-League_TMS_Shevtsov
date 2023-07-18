package com.example.football_league.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ApiDto(
    @SerializedName("api")
    val results: ResultsDto
)