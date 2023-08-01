package com.shubh4u.loginwithfirestore.ui.fragments.loginSignup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.shubh4u.loginwithfirestore.R
import com.shubh4u.loginwithfirestore.databinding.FragmentSplashBinding
import com.shubh4u.loginwithfirestore.ui.viewmodels.SplashViewModel

class SplashFragment : Fragment(R.layout.fragment_splash) {
    private lateinit var binding: FragmentSplashBinding
    private  lateinit var vmViewModel : SplashViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentSplashBinding.bind(view)
        vmViewModel = ViewModelProvider(this)[SplashViewModel::class.java]
        vmViewModel.startBoutiqueRefreshTimer(3000,binding.root)
        /*val crashButton = Button(requireActivity())
        crashButton.text = "Test Crash"
        crashButton.setOnClickListener {
            throw RuntimeException("Test Crash") // Force a crash
        }
        requireActivity().addContentView(crashButton, ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT))*/
    }}