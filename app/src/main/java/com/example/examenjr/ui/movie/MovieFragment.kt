package com.example.examenjr.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.examenjr.R
import com.example.examenjr.databinding.FragmentMovieBinding
import com.example.examenjr.core.Resource
import com.example.examenjr.data.model.Movie
import com.example.examenjr.data.remote.MovieDataSource
import com.example.examenjr.presentation.MovieViewModel
import com.example.examenjr.presentation.MovieViewModelFactory
import com.example.examenjr.repository.MovieRepositoryImpl
import com.example.examenjr.repository.RetrofitClient




class MovieFragment : Fragment() {

    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> { MovieViewModelFactory(MovieRepositoryImpl(MovieDataSource(
        RetrofitClient.webservice))) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)




        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, Observer { result ->
            when (result) {
                is Resource.Loading -> {
                    Log.d("LiveData","Loading...")

                }
                is Resource.Success -> {
                    Log.d("LiveData","Upcoming ${result.data.first} \n \n Top rated :  ${result.data.second} \n \n Popular: ${result.data.third}")
                }
                is Resource.Failure -> {
                    Log.d("Error","${result.exception}")
                }
            }
        })
    }

}