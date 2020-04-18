package com.raywenderlich.wewatch.view.activities

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.raywenderlich.wewatch.R
import com.raywenderlich.wewatch.data.model.details.MovieDetails
import com.raywenderlich.wewatch.data.net.RetrofitClient
import com.raywenderlich.wewatch.viewModelFactory
import com.raywenderlich.wewatch.viewmodel.MovieViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.progressBar
import kotlinx.android.synthetic.main.activity_movie_details.*
import kotlinx.android.synthetic.main.toolbar_view_custom_layout.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MovieDetailsActivity : BaseActivity() {

    private val toolbar: Toolbar by lazy { toolbar_toolbar_view as Toolbar }
    private lateinit var viewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);
        val movieId = intent.extras.getInt("id")
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MovieViewModel::class.java)
        showLoading()
        viewModel.getMovie(movieId).observe(this, Observer { movie ->
            hideLoading()
            movie?.let {
                showMovieDetails(movie)
            }
        })

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

    override fun getToolbarInstance(): Toolbar? = toolbar

    fun goToAddActivity(view: View) = startActivity<AddMovieActivity>()
}
