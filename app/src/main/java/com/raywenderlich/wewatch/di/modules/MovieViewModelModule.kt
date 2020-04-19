package com.raywenderlich.wewatch.di.modules

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.di.scope.ViewModelKey
import com.raywenderlich.wewatch.viewmodel.MovieViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MovieViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    abstract fun bindsMovieViewModelModule(viewModel: MovieViewModel): ViewModel
}