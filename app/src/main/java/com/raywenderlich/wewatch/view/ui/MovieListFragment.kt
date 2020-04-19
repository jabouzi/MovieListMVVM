package com.raywenderlich.wewatch.view.ui

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.raywenderlich.wewatch.App

import com.raywenderlich.wewatch.R
import com.raywenderlich.wewatch.di.modules.MovieListAdapterModule
import com.raywenderlich.wewatch.listener.MovieClickListener
import com.raywenderlich.wewatch.view.adapters.MovieListAdapter
import com.raywenderlich.wewatch.viewmodel.MainViewModel
import com.raywenderlich.wewatch.viewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_movie_list.*
import org.jetbrains.anko.toast
import javax.inject.Inject

class MovieListFragment : Fragment(), MovieClickListener {

    lateinit var viewModel: MainViewModel
    @Inject
    lateinit var adapter: MovieListAdapter
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        App.INSTANCE.appComponent.getMovieListFragmentComponent().inject(this)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        return inflater.inflate(R.layout.fragment_movie_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        view.findViewById<Toolbar>(R.id.toolbar_toolbar_view)
                .setupWithNavController(navController, appBarConfiguration)

        val toolbar = view.findViewById<Toolbar>(R.id.toolbar_toolbar_view)
        toolbar.inflateMenu(R.menu.main_menu)
        toolbar.setOnMenuItemClickListener {
            onOptionsItemSelected(it)
        }

        adapter = MovieListAdapter(this)
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_delete -> this.deleteMoviesClicked()
            else -> activity?.toast(getString(R.string.error))
        }
        return true
    }

    override fun onItemClick(movieId: Int) {
        val movieBundle = Bundle().apply {
            putInt("movieId", movieId)
        }
        view?.findNavController()?.navigate(
                R.id.action_movieListFragment_to_movieDetailsFragment, movieBundle)
    }
}
