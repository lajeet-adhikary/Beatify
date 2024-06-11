package com.lajeet.beatify.introAndAuth.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class IntroAndAuthViewModel @Inject constructor(

) : ViewModel() {

    private val _loggedInInfo = MutableStateFlow(true)
    val loggedInInfo = _loggedInInfo

    init {
        checkAuthentication()
    }

    private fun checkAuthentication() {
        viewModelScope.launch {
            delay(5000) //time-taking task
            _loggedInInfo.emit(true)
        }
    }
}