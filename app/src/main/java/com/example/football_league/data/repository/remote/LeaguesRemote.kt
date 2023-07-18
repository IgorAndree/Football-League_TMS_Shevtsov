package com.example.football_league.data.repository.remote

import com.example.football_league.data.remote.dto.ApiDto

interface LeaguesRemote {
    suspend fun getLeagues(): ApiDto
}