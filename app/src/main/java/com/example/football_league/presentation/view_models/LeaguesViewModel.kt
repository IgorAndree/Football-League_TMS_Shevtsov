package com.example.football_league.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.domain.use_cases.LeaguesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
internal open class LeaguesViewModel @Inject constructor(
    private val leaguesUseCase: LeaguesUseCase
) : ViewModel() {
    private val _leaguesList = MutableLiveData<List<DomainLeagues>>()
    val leaguesList: LiveData<List<DomainLeagues>> = _leaguesList

    init {
        viewModelScope.launch {
            getLeagues()
        }
    }

    private suspend fun getLeagues() {
        _leaguesList.value = leaguesUseCase.getLeagues()
    }
}