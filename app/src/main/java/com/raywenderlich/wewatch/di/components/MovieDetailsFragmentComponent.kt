package com.raywenderlich.wewatch.di.components

import com.raywenderlich.wewatch.di.modules.MainViewModelModule
import com.raywenderlich.wewatch.di.modules.MovieViewModelModule
import com.raywenderlich.wewatch.di.modules.ViewModelFactoryModule
import com.raywenderlich.wewatch.di.scope.FragmentScope
import com.raywenderlich.wewatch.view.ui.MovieDetailsFragment
import com.raywenderlich.wewatch.view.ui.MovieListFragment
import dagger.Component
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [MovieViewModelModule::class, ViewModelFactoryModule::class])
interface MovieDetailsFragmentComponent {
    fun inject(movieDetailsFragment: MovieDetailsFragment)
}