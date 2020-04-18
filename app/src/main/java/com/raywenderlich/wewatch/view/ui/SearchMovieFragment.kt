/*
 * Copyright (c) 2018 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.raywenderlich.wewatch.view.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.raywenderlich.wewatch.R
import com.raywenderlich.wewatch.action
import com.raywenderlich.wewatch.data.model.Movie
import com.raywenderlich.wewatch.snack
import com.raywenderlich.wewatch.view.adapters.SearchListAdapter
import com.raywenderlich.wewatch.viewModelFactory
import com.raywenderlich.wewatch.viewmodel.SearchViewModel
import kotlinx.android.synthetic.main.fragment_search.*

class SearchMovieFragment : Fragment() {

  private lateinit var adapter: SearchListAdapter
  private lateinit var viewModel: SearchViewModel
  private lateinit var title: String

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                          savedInstanceState: Bundle?): View? {
    viewModel = ViewModelProviders.of(this, viewModelFactory).get(SearchViewModel::class.java)
    return inflater.inflate(R.layout.fragment_search, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    val searchText = arguments?.getString("title")
    searchText?.let {
      title = it
    }
    adapter = SearchListAdapter(mutableListOf()) { movie -> displayConfirmation(movie) }
    searchRecyclerView.adapter = adapter
    searchMovie()
  }

  private fun showLoading() {
    searchProgressBar.visibility = View.VISIBLE
    searchRecyclerView.isEnabled = false
  }

  private fun hideLoading() {
    searchProgressBar.visibility = View.GONE
    searchRecyclerView.isEnabled = true
  }

  private fun showMessage() {
    searchLayout.snack(getString(R.string.network_error), Snackbar.LENGTH_INDEFINITE) {
      action(getString(R.string.ok)) {
        searchMovie()
      }
    }
  }

  private fun displayConfirmation(movie: Movie) {
    searchLayout.snack("Add ${movie.title} to your list?", Snackbar.LENGTH_LONG) {
      action(getString(R.string.ok)) {
        viewModel.saveMovie(movie)
        activity?.findNavController(R.id.searchLayout).let {
          it?.navigate(
                  R.id.action_searchMovieFragment_to_movieListFragment)
        }
      }
    }
  }

  private fun searchMovie() {
    showLoading()
    viewModel.searchMovie(title).observe(this, Observer { movies ->
      hideLoading()
      if (movies == null) {
        showMessage()
      } else {
          adapter.setMovies(movies)
      }
    })
  }
}
