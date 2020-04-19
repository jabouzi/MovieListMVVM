package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class MovieRepositoryModule {
    @Provides
    fun provideRepository(): MovieRepository {
        return MovieRepositoryImpl()
    }
}