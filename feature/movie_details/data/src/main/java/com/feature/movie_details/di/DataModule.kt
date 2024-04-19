package com.feature.movie_details.di

import com.core.network.dataproviders.MovieApiRepository
import com.feature.movie_details.domain.repository.MovieDetailsRepo
import com.feature.movie_details.repo.MovieApiDetailsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DataModule {


    @Provides
    fun provideMovieDetailsRepo(movieApiRepository: MovieApiRepository):MovieDetailsRepo{
        return MovieApiDetailsRepoImpl(movieApiRepository)
    }


}