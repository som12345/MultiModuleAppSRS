package com.feature.movie_details.repo

import com.core.network.dataproviders.MovieApiRepository
import com.feature.movie_details.domain.model.MovieDetails
import com.feature.movie_details.domain.repository.MovieDetailsRepo
import com.feature.movie_details.mappers.toDomain
import javax.inject.Inject

class MovieApiDetailsRepoImpl @Inject constructor(private val movieApiRepository: MovieApiRepository) : MovieDetailsRepo{
    override suspend fun getMovieDetails(id: String, apiKey: String): MovieDetails {
       return movieApiRepository.getMovieDetails(id,apiKey).toDomain()
    }
}