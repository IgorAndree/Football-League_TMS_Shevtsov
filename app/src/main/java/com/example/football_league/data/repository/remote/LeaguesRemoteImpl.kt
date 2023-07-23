package com.example.football_league.data.repository.remote

import com.example.football_league.data.remote.api.LeaguesApi
import com.example.football_league.data.remote.dto.ApiDto
import javax.inject.Inject

internal class LeaguesRemoteImpl @Inject constructor(
    private val leaguesApi: LeaguesApi
) : LeaguesRemote {
    override suspend fun getLeagues(): ApiDto =
        leaguesApi.getLeagues()
}
