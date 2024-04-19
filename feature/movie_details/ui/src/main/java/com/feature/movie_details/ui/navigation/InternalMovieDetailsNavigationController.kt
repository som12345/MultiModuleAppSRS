package com.feature.movie_details.ui.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.core.common.navigation_constants.MovieFeature
import com.core.feature_api.FeatureNavigationController
import com.feature.movie_details.ui.screen.MovieDetailsScreen
import com.feature.movie_details.ui.screen.MovieDetailsViewModel

object InternalMovieDetailsNavigationController : FeatureNavigationController {

    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        navGraphBuilder.navigation(
            route = MovieFeature.nestedListDetailsRoute,
            startDestination = MovieFeature.movieListDetailsScreenRoute
        ) {
            composable(MovieFeature.movieListDetailsScreenRoute) {
                val id = it.arguments?.getString("id")
                val viewModel = hiltViewModel<MovieDetailsViewModel>()
                MovieDetailsScreen(id = id.toString(), viewModel = viewModel)

            }
        }
    }
}