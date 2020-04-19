package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.listener.MovieClickListener
import com.raywenderlich.wewatch.view.adapters.MovieListAdapter
import dagger.Module
import dagger.Provides

@Module(includes = [MovieClickListenerModule::class])
class MovieListAdapterModule {

    @Provides
    fun getMovieListAdapter(movieClickListener: MovieClickListener): MovieListAdapter {
        return MovieListAdapter(movieClickListener)
    }

}