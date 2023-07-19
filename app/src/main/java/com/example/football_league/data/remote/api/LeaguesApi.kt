package com.example.football_league.data.remote.api

import com.example.football_league.data.remote.dto.ApiDto
import retrofit2.http.GET
import retrofit2.http.Headers

interface LeaguesApi {
    companion object {
        const val GET_REQUEST = "leagues"
    }

    //TODO add to constants
    @Headers(
        "X-RapidAPI-Key: d96928c09fmshe77173f972a0bebp14fe0bjsn009077f1e4ed",
        "X-RapidAPI-Host: api-football-v1.p.rapidapi.com"
    )
    @GET(GET_REQUEST)
    suspend fun getLeagues(): ApiDto
}
