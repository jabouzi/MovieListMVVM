package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.view.ui.MovieListFragment
import com.raywenderlich.wewatch.view.ui.SearchMovieFragment
import dagger.Module
import dagger.Provides

@Module
class SearchMovieFragmentModule {
    @Provides
    fun provideSearchMovieFragment(): SearchMovieFragment {
        return SearchMovieFragment()
    }
}