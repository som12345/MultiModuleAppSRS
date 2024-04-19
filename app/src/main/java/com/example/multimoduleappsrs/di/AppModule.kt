package com.example.multimoduleappsrs.di

import com.example.multimoduleappsrs.navigation.NavigationProvider
import com.feature.movie.ui.navigation.MovieNavigationController
import com.feature.movie_details.ui.navigation.MovieDetailsNavigationController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideNavigationProvider(movieApi: MovieNavigationController, movieDetailsApi: MovieDetailsNavigationController): NavigationProvider {
        return NavigationProvider(movieApi,movieDetailsApi)
    }

}