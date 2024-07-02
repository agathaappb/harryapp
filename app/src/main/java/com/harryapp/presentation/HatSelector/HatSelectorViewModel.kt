package com.harryapp.presentation.HatSelector

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.harryapp.domain.HatSelectorUseCase
import kotlinx.coroutines.handleCoroutineException

class HatSelectorViewModel(
    val hatSelectorUseCase: HatSelectorUseCase
):ViewModel() {

    private val _selectorHouse = MutableLiveData<Int>()
    val selectorHouse: LiveData<Int> = _selectorHouse

    fun selectorHat(){
        houseSelected()
    }

    fun houseSelected(){
        _selectorHouse.postValue(hatSelectorUseCase.getSelectorHouse())
    }


}