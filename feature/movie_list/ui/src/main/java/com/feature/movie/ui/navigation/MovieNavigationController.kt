package com.feature.movie.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureNavigationController

interface MovieNavigationController : FeatureNavigationController {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieFeatureNavigationController.registerGraph(
            navController, navGraphBuilder
        )
    }
}


class MovieNavigationControllerImpl : MovieNavigationController {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieFeatureNavigationController.registerGraph(
            navController, navGraphBuilder
        )
    }
}