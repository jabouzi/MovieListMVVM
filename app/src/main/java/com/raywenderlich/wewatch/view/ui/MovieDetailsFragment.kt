package com.raywenderlich.wewatch.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raywenderlich.wewatch.R
import com.raywenderlich.wewatch.data.model.details.MovieDetails
import com.raywenderlich.wewatch.data.net.RetrofitClient
import com.raywenderlich.wewatch.viewModelFactory
import com.raywenderlich.wewatch.viewmodel.MovieViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_movie_details.*

class MovieDetailsFragment : Fragment() {

    private lateinit var viewModel: MovieViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MovieViewModel::class.java)
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val movieId = arguments?.getInt("movieId")
        movieId?.let {
            showLoading()
            viewModel.getMovie(it).observe(this, Observer { movie ->
                hideLoading()
                movie?.let {
                    showMovieDetails(movie)
                }
            })
        }
    }

    private fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    private fun showMovieDetails(movieDetails: MovieDetails) {
        movieDetails?.let {
            if (it.posterPath != null)
                Picasso.get().load(RetrofitClient.TMDB_IMAGEURL + it.posterPath).into(movieImageView)
            else {
                movieImageView.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_local_movies_gray, null))
            }
            movieTitleTextView.setText(movieDetails.title)
            movieReleaseDateTextView.setText(movieDetails.releaseDate)
            movieDetails.voteAverage?.let { it -> movieReviewsTextView.setText(it.toString()) }
            movieoverviewTextView.setText(movieDetails.overview)
        }
    }
}
