package com.raywenderlich.wewatch.viewmodel

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.Movie
import javax.inject.Inject

class AddViewModel @Inject constructor(val repository: MovieRepository): ViewModel()  {

  fun saveMovie(movie: Movie) {
    repository.saveMovie(movie)
  }
}