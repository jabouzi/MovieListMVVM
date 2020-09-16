package com.raywenderlich.wewatch.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.raywenderlich.wewatch.data.MovieRepository
import com.raywenderlich.wewatch.data.MovieRepositoryImpl
import com.raywenderlich.wewatch.data.model.Movie
import com.raywenderlich.wewatch.data.model.details.MovieDetails
import kotlinx.coroutines.launch
import javax.inject.Inject

class MovieViewModel @Inject constructor(val repository: MovieRepository): ViewModel()  {

    private val _movie = MutableLiveData<MovieDetails>()

    // The external immutable LiveData for the response String
    val movie: LiveData<MovieDetails>
        get() = _movie

    fun getMovie(movieId: Int){
        viewModelScope.launch {
            try {
                val result = repository.getMovieDetails(movieId)
                _movie.value = result
            } catch (e: Exception) {
                _movie.value = MovieDetails()
            }
        }
    }
}