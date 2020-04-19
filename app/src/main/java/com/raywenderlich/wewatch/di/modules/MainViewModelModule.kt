package com.raywenderlich.wewatch.di.modules

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.di.scope.ViewModelKey
import com.raywenderlich.wewatch.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindsMainViewModelModule(viewModel: MainViewModel): ViewModel
}