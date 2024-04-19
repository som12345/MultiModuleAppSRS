package com.feature.movie.ui.navigation.di

import com.feature.movie.ui.navigation.MovieNavigationController
import com.feature.movie.ui.navigation.MovieNavigationControllerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object UiModule {


    @Provides
    fun provideMovieApi():MovieNavigationController{
        return  MovieNavigationControllerImpl()
    }


}