package com.harryapp.di

import com.harryapp.models.HatSelectorUseCase
import com.harryapp.viewmodels.HatSelectorViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { HatSelectorUseCase() }
    viewModel { HatSelectorViewModel(hatSelectorUseCase = get()) }

}

