package com.feature.movie_details.ui.di

import com.feature.movie_details.ui.navigation.MovieDetailsNavigationController
import com.feature.movie_details.ui.navigation.MovieDetailsNavigationControllerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {
    @Provides
    fun provideMovieDetailsApi(): MovieDetailsNavigationController {
        return MovieDetailsNavigationControllerImpl()
    }
}
