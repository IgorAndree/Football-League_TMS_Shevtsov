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
import com.example.football_league.databinding.FragmentStartBinding
import com.example.football_league.domain.models.DomainLeagues
import com.example.football_league.presentation.adapters.LeaguesRecyclerAdapter
import com.example.football_league.presentation.view_models.LeaguesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartFragment : Fragment() {
    private lateinit var binding: FragmentStartBinding
    private val viewModel: LeaguesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState:
        Bundle?
    ): View {

        binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initFun()

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_StartFragment_to_ClubsFragment)
        }
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_StartFragment_to_LoginFragment)

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
        binding.recyclerLeagues.apply {
            layoutManager = LinearLayoutManager (requireContext())
              adapter = LeaguesRecyclerAdapter(context,
                items = leagues,
                onItemClickEvent = {
                    findNavController().navigate(R.id.action_StartFragment_to_ClubsFragment)
                }
            )
        }
    }
}

