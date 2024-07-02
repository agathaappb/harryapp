package com.harryapp.presentation.HatSelector

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harryapp.domain.HatSelectorUseCase

class HatSelectorViewModel(
    val HatSelectorUseCase: HatSelectorUseCase
):ViewModel() {

    private lateinit var selectorHouse:MutableLiveData<Int>

    fun selectorHat(){

    }

    fun houseSelected(){

    }


}