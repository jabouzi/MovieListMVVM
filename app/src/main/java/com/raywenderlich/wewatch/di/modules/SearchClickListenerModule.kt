package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.listener.MovieClickListener
import com.raywenderlich.wewatch.listener.SearchClickListener
import com.raywenderlich.wewatch.view.ui.MovieListFragment
import com.raywenderlich.wewatch.view.ui.SearchMovieFragment
import dagger.Binds
import dagger.Module

@Module(includes = [SearchMovieFragmentModule::class])
abstract class SearchClickListenerModule {
    @Binds
    abstract fun bindMovieClickListener(searchMovieFragment: SearchMovieFragment): SearchClickListener

}