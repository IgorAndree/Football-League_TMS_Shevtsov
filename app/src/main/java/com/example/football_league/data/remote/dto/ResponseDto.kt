package com.example.football_league.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ResponseDto(
    @SerializedName("results")
    val results: Int,

    @SerializedName("leagues")
    val leagues: List <DataLeaguesDto>?

)