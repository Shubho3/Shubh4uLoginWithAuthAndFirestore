package com.shubh4u.loginwithfirestore.ui.viewmodels

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation.findNavController
import com.shubh4u.loginwithfirestore.R

class SplashViewModel : ViewModel() {
    fun startBoutiqueRefreshTimer(delayMs: Long,view : View) {
        android.os.Handler().apply {
            val runnable = Runnable {
                findNavController(view).navigate(R.id.action_splash_to_login)
            }
            postDelayed(runnable, delayMs)
        }
    }
}