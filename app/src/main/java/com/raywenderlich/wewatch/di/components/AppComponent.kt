package com.raywenderlich.wewatch.di.components

import com.raywenderlich.wewatch.data.net.RetrofitClient
import com.raywenderlich.wewatch.di.modules.MovieRepositoryModule
import com.raywenderlich.wewatch.di.modules.RetrofitModule
import com.raywenderlich.wewatch.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component


@AppScope
@Component(modules = [RetrofitModule::class, MovieRepositoryModule::class])
interface AppComponent {
    fun getRetrofitClient(): RetrofitClient
    fun getMovieListFragmentComponent(): MovieListFragmentComponent
    fun getAddMovieFragmentComponent(): AddMovieFragmentComponent
    fun getMovieDetailsFragmentComponent(): MovieDetailsFragmentComponent
    fun getSearchMovieFragmentComponent(): SearchMovieFragmentComponent
}