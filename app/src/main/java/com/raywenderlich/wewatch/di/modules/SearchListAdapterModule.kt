package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.listener.SearchClickListener
import com.raywenderlich.wewatch.view.adapters.SearchListAdapter
import dagger.Module
import dagger.Provides

@Module(includes = [SearchClickListenerModule::class])
class SearchListAdapterModule{
    @Provides
    fun getSearchListAdapterModule(searchClickListener: SearchClickListener): SearchListAdapter {
        return SearchListAdapter(searchClickListener)
    }

}