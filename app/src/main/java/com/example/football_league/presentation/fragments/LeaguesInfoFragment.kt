package com.example.football_league.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.football_league.R
import com.example.football_league.databinding.FragmentLeaguesInfoBinding
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.presentation.adapters.LeaguesRecyclerAdapter
import com.example.football_league.presentation.view_models.LeaguesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LeaguesInfoFragment : Fragment() {
    private lateinit var binding: FragmentLeaguesInfoBinding
    private val viewModel: LeaguesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
        Bundle?
    ): View {
        binding = FragmentLeaguesInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initFun()

        binding.buttonBackToStart.setOnClickListener {
            findNavController().navigate(R.id.action_LeaguesInfoFragment_to_StartFragment)
        }
    }

    private fun initFun() {
        observeLeagues()
    }

    private fun observeLeagues() {
        viewModel.leaguesList.observe(viewLifecycleOwner) { leagues ->
            initRecycler(leagues)
        }
    }

    private fun initRecycler(leagues: List<DomainLeagues>) {
        binding.leaguesRecycler.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = LeaguesRecyclerAdapter(
                context,
                items = leagues
            )
        }
    }
}
