package com.example.football_league.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.football_league.R
import com.example.football_league.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toast = Toast.makeText(
            context, R.string.verification,
            Toast.LENGTH_SHORT
        )
        binding.buttonLoginNext.setOnClickListener {
            if (binding.editTextPassword.length() >= 8 && binding.editTextName.length() >= 4) {
                findNavController().navigate(R.id.action_LoginFragment_to_StartFragment)
            } else {
                toast.show()
            }
        }
    }
}
