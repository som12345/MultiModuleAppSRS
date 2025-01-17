package com.feature.movie_details.ui.screen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common.ApiResponseEvent
import com.feature.movie_details.domain.use_cases.GetMovieDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel @Inject constructor(
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {


    private val _movieDetails = mutableStateOf(MovieDetailsStateHolder())
    val movieDetails: State<MovieDetailsStateHolder> get() = _movieDetails

    val API_KEY = "02f440e85f7722d198a3559061c88d6f"

    init {
        savedStateHandle.getLiveData<String>("id").observeForever {
            it?.let {
                Log.d("TAGGG", "${it}")
                getMovieDetails(it, API_KEY)
            }
        }

    }


    fun getMovieDetails(id: String, apiKey: String) {
        getMovieDetailsUseCase(id, apiKey).onEach {
            when (it) {
                is ApiResponseEvent.Loading -> {
                    _movieDetails.value = MovieDetailsStateHolder(isLoading = true)
                }

                is ApiResponseEvent.Error -> {
                    _movieDetails.value = MovieDetailsStateHolder(error = it.message.toString())
                }

                is ApiResponseEvent.Success -> {
                    _movieDetails.value = MovieDetailsStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }


}