package com.raywenderlich.wewatch.listener

import com.raywenderlich.wewatch.data.model.Movie

interface SearchClickListener {
    fun onItemClick(movie: Movie)
}