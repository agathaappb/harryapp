package com.harryapp.di

import com.harryapp.domain.HatSelectorUseCase
import com.harryapp.presentation.HatSelector.HatSelectorViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { HatSelectorUseCase() }
    viewModel { HatSelectorViewModel(hatSelectorUseCase = get()) }

}

