package com.example.football_league.data.repository.remote

import com.example.football_league.data.remote.dto.ResponseDto

interface LeaguesRemote {
    suspend fun getLeagues(): ResponseDto
}