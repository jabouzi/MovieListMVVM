package com.raywenderlich.wewatch.view.ui

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController

import com.raywenderlich.wewatch.R
import com.raywenderlich.wewatch.listener.MovieClickListener
import com.raywenderlich.wewatch.view.adapters.MovieListAdapter
import com.raywenderlich.wewatch.viewModelFactory
import com.raywenderlich.wewatch.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.fragment_movie_list.*
import org.jetbrains.anko.toast

class MovieListFragment : Fragment(), MovieClickListener {

    private lateinit var adapter: MovieListAdapter
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = MovieListAdapter(mutableListOf(), this)
        moviesRecyclerView.adapter = adapter
        showLoading()
        viewModel.getSavedMovies().observe(this, Observer { movies ->
            hideLoading()
            Log.e("movies", "$movies")
            movies?.let {
                adapter.setMovies(movies)
            }
        })

        addFab.setOnClickListener {
            view.findNavController().navigate(
                    R.id.action_movieListFragment_to_addMovieFragment)
        }
    }

    private fun showLoading() {
        moviesRecyclerView.isEnabled = false
        progressBar.visibility = View.VISIBLE
    }

    private fun hideLoading() {
        moviesRecyclerView.isEnabled = true
        progressBar.visibility = View.GONE
    }

    private fun deleteMoviesClicked() {
        for (movie in adapter.selectedMovies) {
            viewModel.deleteSavedMovies(movie)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.main_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_delete -> this.deleteMoviesClicked()
            else -> activity?.toast(getString(R.string.error))
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onItemClick(movieId: Int) {
        val movieBundle = Bundle().apply {
            putInt("movieId", movieId)
        }
        view?.findNavController()?.navigate(
                R.id.action_movieListFragment_to_movieDetailsFragment, movieBundle)
    }
}
