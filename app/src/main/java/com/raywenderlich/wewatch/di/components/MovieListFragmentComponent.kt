package com.raywenderlich.wewatch.di.components

import com.raywenderlich.wewatch.di.modules.MainViewModelModule
import com.raywenderlich.wewatch.di.modules.MovieListAdapterModule
import com.raywenderlich.wewatch.di.modules.ViewModelFactoryModule
import com.raywenderlich.wewatch.di.scope.FragmentScope
import com.raywenderlich.wewatch.view.ui.MovieListFragment
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MainViewModelModule::class, ViewModelFactoryModule::class, MovieListAdapterModule::class])
interface MovieListFragmentComponent {
    fun inject(movieListFragment: MovieListFragment)
}