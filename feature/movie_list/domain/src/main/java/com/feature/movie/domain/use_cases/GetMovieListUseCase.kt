package com.feature.movie.domain.use_cases

import com.core.common.ApiResponseEvent
import com.feature.movie.domain.model.Movie
import com.feature.movie.domain.repo.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetMovieListUseCase @Inject constructor(private val movieRepository: MovieRepository) {

    operator fun invoke(apiKey: String, q: String) = flow<ApiResponseEvent<List<Movie>>> {
        emit(ApiResponseEvent.Loading())
        emit(ApiResponseEvent.Success(movieRepository.getMovieList(apiKey, q)))
    }.catch {
        emit(ApiResponseEvent.Error(it.message.toString()))
    }.flowOn(Dispatchers.IO)

}