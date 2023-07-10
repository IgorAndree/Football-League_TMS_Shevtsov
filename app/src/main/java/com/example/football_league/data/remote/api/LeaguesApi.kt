package com.example.football_league.data.remote.api

import com.example.football_league.data.remote.dto.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface LeaguesApi {
    companion object {
        const val GET_REQUEST = "leagues"
//        const val KEY_PARAM = "X-RapidAPI-Key"
//        const val API_KEY =  "0984d2d403msh5a3bbf53822f480p133098jsn4456be0a8c43"
//        const val HOST_PARAM = "X-RapidAPI-Host"
//        const val API_HOST =  "api-football-v1.p.rapidapi.com"
 //     const val PARAM = "results"
 //     const val CONST = "leagues"

    }

    @Headers(
        "X-RapidAPI-Key: 0984d2d403msh5a3bbf53822f480p133098jsn4456be0a8c43",
        "X-RapidAPI-Host: api-football-v1.p.rapidapi.com"
    )
    @GET(GET_REQUEST)
    suspend fun getLeagues(
 //     @Query(CONST) leagues: String = CONST,
 //     @Query(PARAM) results: Int = PARAM
   ): ResponseDto



}
