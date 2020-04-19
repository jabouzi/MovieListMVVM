package com.raywenderlich.wewatch.di.components

import com.raywenderlich.wewatch.di.modules.AddViewModelModule
import com.raywenderlich.wewatch.di.modules.MainViewModelModule
import com.raywenderlich.wewatch.di.modules.ViewModelFactoryModule
import com.raywenderlich.wewatch.di.scope.FragmentScope
import com.raywenderlich.wewatch.view.ui.AddMovieFragment
import com.raywenderlich.wewatch.view.ui.MovieListFragment
import dagger.Component
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [AddViewModelModule::class, ViewModelFactoryModule::class])
interface AddMovieFragmentComponent {
    fun inject(addMovieFragment: AddMovieFragment)
}