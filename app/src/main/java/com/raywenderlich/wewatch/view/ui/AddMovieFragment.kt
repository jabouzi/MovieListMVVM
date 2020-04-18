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
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.snackbar.Snackbar
import com.raywenderlich.wewatch.*
import com.raywenderlich.wewatch.data.model.Movie
import com.raywenderlich.wewatch.viewmodel.AddViewModel
import kotlinx.android.synthetic.main.fragment_movie_add.*

class AddMovieFragment : Fragment() {

  private lateinit var viewModel: AddViewModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                            savedInstanceState: Bundle?): View? {

    viewModel = ViewModelProviders.of(this, viewModelFactory).get(AddViewModel::class.java)
    return inflater.inflate(R.layout.fragment_movie_add, container, false)
  }

  private fun showMessage(msg: String) {
    addLayout.snack((msg), Snackbar.LENGTH_LONG) {
      action(getString(R.string.ok)) {
      }
    }
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val navController = findNavController()
    val appBarConfiguration = AppBarConfiguration(navController.graph)

    view.findViewById<Toolbar>(R.id.toolbar_toolbar_view)
            .setupWithNavController(navController, appBarConfiguration)
    addMovieButton.setOnClickListener{
      addMovieClicked(it)
    }

    searchMovieButton.setOnClickListener{
      searchMovieClicked(it)
    }
  }

  fun searchMovieClicked(view: View) {
    if (titleEditText.text.toString().isNotBlank()) {
      val movieBundle = Bundle().apply {
        putString("title", titleEditText.text.toString())
      }
      view?.findNavController()?.navigate(
              R.id.action_addMovieFragment_to_searchMovieFragment, movieBundle)
    } else {
      showMessage(getString(R.string.enter_title))
    }
  }

  fun addMovieClicked(view: View) {
    if (titleEditText.text.toString().isNotBlank()) {
      viewModel.saveMovie(Movie(title = titleEditText.text.toString(), releaseDate = yearEditText.text.toString()))
//      finish()
    } else {
      showMessage(getString(R.string.enter_title))
    }
  }
}
