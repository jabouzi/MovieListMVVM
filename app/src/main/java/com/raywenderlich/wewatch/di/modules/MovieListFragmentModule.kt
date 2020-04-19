package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.view.ui.MovieListFragment
import dagger.Module
import dagger.Provides

@Module
class MovieListFragmentModule {
    @Provides
    fun provideMovieListFragment(): MovieListFragment {
        return MovieListFragment()
    }
}