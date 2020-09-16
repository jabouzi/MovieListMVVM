package com.raywenderlich.wewatch.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SearchViewModel @Inject constructor(val repository: MovieRepository): ViewModel()  {

  private val _movies = MutableLiveData<List<Movie>>()

  // The external immutable LiveData for the response String
  val movies: LiveData<List<Movie>>
    get() = _movies

  fun searchMovie(query: String) {
    viewModelScope.launch {
      try {
        val listResult = repository.searchMovies(query)
        Log.e("listResult", "$listResult")
        _movies.value = listResult
      } catch (e: Exception) {
        Log.e("listResult", "${e.localizedMessage}")
        _movies.value = null
      }
    }
  }

  fun saveMovie(movie: Movie) {
    viewModelScope.launch {
      withContext(Dispatchers.IO) {
        repository.saveMovie(movie)
      }
    }
  }
}