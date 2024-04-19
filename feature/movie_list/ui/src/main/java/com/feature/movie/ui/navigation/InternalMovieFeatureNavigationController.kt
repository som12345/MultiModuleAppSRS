package com.feature.movie.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureNavigationController
import com.feature.movie.ui.navigation.screen.MovieScreen
import com.feature.movie.ui.navigation.screen.MovieSearchViewModel

internal object InternalMovieFeatureNavigationController : FeatureNavigationController {

    override fun registerGraph(
        navController: androidx.navigation.NavHostController,
        navGraphBuilder: androidx.navigation.NavGraphBuilder
    ) {
        navGraphBuilder.navigation(
            startDestination = MovieFeature.movieListScreenRoute,
            route = MovieFeature.nestedListRoute
        ) {
            composable(MovieFeature.movieListScreenRoute) {
                val viewModel = hiltViewModel<MovieSearchViewModel>()
                MovieScreen(viewModel = viewModel,navController)
            }
        }
    }
}