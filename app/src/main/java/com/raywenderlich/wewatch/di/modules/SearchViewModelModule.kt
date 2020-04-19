package com.raywenderlich.wewatch.di.modules

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.di.scope.ViewModelKey
import com.raywenderlich.wewatch.viewmodel.SearchViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SearchViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun bindsSearchViewModelModule(viewModel: SearchViewModel): ViewModel
}