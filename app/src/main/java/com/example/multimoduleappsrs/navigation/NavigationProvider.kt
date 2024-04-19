package com.example.multimoduleappsrs.navigation

import com.feature.movie.ui.navigation.MovieNavigationController
import com.feature.movie_details.ui.navigation.MovieDetailsNavigationController

data class NavigationProvider(
    val movieListScreenController: MovieNavigationController,
    val movieDetailsScreenController:MovieDetailsNavigationController
)
