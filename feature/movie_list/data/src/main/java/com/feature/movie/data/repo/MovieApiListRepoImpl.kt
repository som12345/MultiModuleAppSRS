package com.feature.movie.data.repo

import com.core.network.dataproviders.MovieApiRepository
import com.feature.movie.data.mapper.toDomainMovieList
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import javax.inject.Inject

class MovieApiListRepoImpl @Inject constructor(
    private val movieApiRepository: MovieApiRepository
) : MovieRepository {

    override suspend fun getMovieList(apiKey: String, q: String): List<Movie> {
        return movieApiRepository.getMovieLIst(apiKey, q).toDomainMovieList()
    }
}