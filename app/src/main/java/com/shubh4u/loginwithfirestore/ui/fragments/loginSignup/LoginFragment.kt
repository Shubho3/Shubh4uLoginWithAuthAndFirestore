package com.shubh4u.loginwithfirestore.ui.fragments.loginSignup

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.shubh4u.loginwithfirestore.R
import com.shubh4u.loginwithfirestore.databinding.FragmentLoginBinding
import com.shubh4u.loginwithfirestore.ui.viewmodels.LoginViewModel

class LoginFragment : Fragment(R.layout.fragment_login) {
    private lateinit var binding: FragmentLoginBinding
    private lateinit var vmViewModel: LoginViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentLoginBinding.bind(view)
        vmViewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        binding.buttonRegister.setOnClickListener {
            var email = binding.editTextEmailAddress.text.toString()
            var pass = binding.editTextPassword.text.toString()
            if (TextUtils.isEmpty(email)&& !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                binding.editTextEmailAddress.error = "Invalid Email"

            }else if (TextUtils.isEmpty(pass)&& pass.length<=5){
                binding.editTextEmailAddress.error = "Invalid password  or password must be at least 6 characters"
            }else{
            vmViewModel.register(email, pass, requireActivity())
        }}
    }
}