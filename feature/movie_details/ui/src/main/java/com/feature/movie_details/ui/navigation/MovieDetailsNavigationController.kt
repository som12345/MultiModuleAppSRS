package com.feature.movie_details.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.core.feature_api.FeatureNavigationController

interface MovieDetailsNavigationController : FeatureNavigationController {

}

class MovieDetailsNavigationControllerImpl : MovieDetailsNavigationController {
    override fun registerGraph(navController: NavHostController, navGraphBuilder: NavGraphBuilder) {
        InternalMovieDetailsNavigationController.registerGraph(navController, navGraphBuilder)
    }
}