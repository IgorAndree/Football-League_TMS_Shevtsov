package com.example.football_league.data.remote.api

import com.example.football_league.data.remote.dto.ApiDto
import retrofit2.http.GET
import retrofit2.http.Headers

interface LeaguesApi {
    companion object {
        const val GET_REQUEST = "leagues"
    }

    @Headers(
        "X-RapidAPI-Key: ",
        "X-RapidAPI-Host: api-football-v1.p.rapidapi.com"
    )
    @GET(GET_REQUEST)
    suspend fun getLeagues(): ApiDto
}
