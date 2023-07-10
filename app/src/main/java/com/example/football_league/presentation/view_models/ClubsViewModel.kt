package com.example.football_league.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.domain.use_cases.GetClubsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
open class ClubsViewModel @Inject constructor(
    private val getClubsUseCase: GetClubsUseCase
) : ViewModel() {
// TODO Потом прекрепить к Фрагменту с клубами
    private val _clubs = MutableLiveData<DomainLeagues>()
    val clubs: LiveData<DomainLeagues> = _clubs

    init {
        viewModelScope.launch {
            getClubs()
        }
    }

    private suspend fun getClubs() {
        _clubs.value = getClubsUseCase.getClubsById()
    }
}