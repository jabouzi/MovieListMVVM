package com.raywenderlich.wewatch.di.components

import com.raywenderlich.wewatch.di.modules.SearchListAdapterModule
import com.raywenderlich.wewatch.di.modules.SearchViewModelModule
import com.raywenderlich.wewatch.di.modules.ViewModelFactoryModule
import com.raywenderlich.wewatch.di.scope.FragmentScope
import com.raywenderlich.wewatch.view.adapters.SearchListAdapter
import com.raywenderlich.wewatch.view.ui.SearchMovieFragment
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@FragmentScope
@Subcomponent(modules = [SearchViewModelModule::class, ViewModelFactoryModule::class, SearchListAdapterModule::class])
interface SearchMovieFragmentComponent {
    fun inject(searchMovieFragment: SearchMovieFragment)
}