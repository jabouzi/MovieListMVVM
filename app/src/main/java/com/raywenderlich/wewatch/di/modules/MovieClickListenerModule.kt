package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.listener.MovieClickListener
import com.raywenderlich.wewatch.view.ui.MovieListFragment
import dagger.Binds
import dagger.Module

@Module(includes = [MovieListFragmentModule::class])
abstract class MovieClickListenerModule {
    @Binds
    abstract fun bindMovieClickListener(movieListFragment: MovieListFragment): MovieClickListener

}