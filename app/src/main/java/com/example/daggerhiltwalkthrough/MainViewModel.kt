package com.example.daggerhiltwalkthrough

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.daggerhiltwalkthrough.di.Car
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val car: Car,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    val carLiveData = MutableLiveData(car)
}