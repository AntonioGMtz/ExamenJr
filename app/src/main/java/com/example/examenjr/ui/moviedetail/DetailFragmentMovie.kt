package com.example.examenjr.ui.moviedetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.examenjr.R
import com.example.examenjr.databinding.FragmentDetailMovieBinding
import com.example.examenjr.databinding.FragmentMovieBinding


class DetailFragmentMovie : Fragment() {
    private lateinit var binding: FragmentDetailMovieBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         binding = FragmentDetailMovieBinding.bind(view)
    }
}