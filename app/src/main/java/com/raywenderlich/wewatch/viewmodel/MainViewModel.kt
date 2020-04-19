package com.raywenderlich.wewatch.viewmodel

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.Movie
import javax.inject.Inject

class MainViewModel @Inject constructor(val repository: MovieRepository) : ViewModel() {

  private val allMovies = MediatorLiveData<List<Movie>>()

  init {
    getAllMovies()
  }

  fun getSavedMovies() = allMovies

  private fun getAllMovies() {
    allMovies.addSource(repository.getSavedMovies()) { movies ->
      allMovies.postValue(movies)
    }
  }

  fun deleteSavedMovies(movie: Movie) {
    repository.deleteMovie(movie)
  }
}