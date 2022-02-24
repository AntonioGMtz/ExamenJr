package com.example.examenjr.data.remote

import com.example.examenjr.core.Resource
import com.example.examenjr.data.model.MovieList
import com.example.examenjr.domain.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList {
        return webService.getUpcomingMovies(AppConstants.API_KEY)
    }

    suspend fun getTopRatedMovies(): MovieList {
        return webService.getTopRatedMovies(AppConstants.API_KEY)
    }

    suspend fun getPopularMovies(): MovieList {
        return webService.getPopulardMovies(AppConstants.API_KEY)
    }
}