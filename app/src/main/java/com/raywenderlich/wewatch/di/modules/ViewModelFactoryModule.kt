package com.raywenderlich.wewatch.di.modules

import androidx.lifecycle.ViewModelProvider
import com.raywenderlich.wewatch.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ViewModelFactoryModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}