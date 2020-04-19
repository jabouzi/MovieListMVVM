package com.raywenderlich.wewatch.di.modules

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.di.scope.ViewModelKey
import com.raywenderlich.wewatch.viewmodel.AddViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AddViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AddViewModel::class)
    abstract fun bindsAddViewModelModule(viewModel: AddViewModel): ViewModel
}