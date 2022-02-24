package com.example.examenjr.repository

import com.example.examenjr.data.model.MovieList
import com.example.examenjr.data.remote.MovieDataSource

class MovieRepositoryImpl (private val dataSource: MovieDataSource): MovieRepository {
    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()
    override suspend fun getTopRatedMovies(): MovieList = dataSource.getTopRatedMovies()
    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()
}