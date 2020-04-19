package com.raywenderlich.wewatch.di.modules

import com.raywenderlich.wewatch.BuildConfig
import com.raywenderlich.wewatch.di.scope.AppScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class RetrofitModule {
    @AppScope
    @Provides
    fun provideHttpLogginInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    @AppScope
    @Provides
    fun provideGsonFactory(): GsonConverterFactory {
        return GsonConverterFactory.create()
    }

    @AppScope
    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor()
        val builder = OkHttpClient.Builder()
        builder.addInterceptor(logging)
        return builder.build()
    }

    @AppScope
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gsonFactory: GsonConverterFactory): Retrofit {
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.TMDB_BASE_URL)
                .addConverterFactory(gsonFactory)
                .client(okHttpClient)
                .build()

        return retrofit
    }
}