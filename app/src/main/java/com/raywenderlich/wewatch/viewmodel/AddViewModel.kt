package com.raywenderlich.wewatch.viewmodel

import androidx.lifecycle.ViewModel
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.Movie
import javax.inject.Inject
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AddViewModel @Inject constructor(val repository: MovieRepository): ViewModel()  {

  fun saveMovie(movie: Movie) {
    viewModelScope.launch {
      withContext(Dispatchers.IO) {
        repository.saveMovie(movie)
      }
    }
  }
}