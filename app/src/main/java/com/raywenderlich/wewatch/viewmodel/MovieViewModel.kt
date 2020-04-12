package com.raywenderlich.wewatch.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.details.MovieDetails

class MovieViewModel(private val repository: MovieRepository = MovieRepositoryImpl()): ViewModel()  {

    fun getMovie(movieId: Int): LiveData<MovieDetails?>{
        return repository.getMovieDetails(movieId)
    }
}