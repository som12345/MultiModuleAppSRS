package com.example.multimoduleappsrs.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.core.common.navigation_constants.MovieFeature

@Composable
fun AppNavGraph(
    navController: NavHostController,
    navigationProvider: NavigationProvider
) {

    NavHost(navController = navController, startDestination = MovieFeature.nestedListRoute){
        navigationProvider.movieListScreenController.registerGraph(
            navController,this
        )

        navigationProvider.movieDetailsScreenController.registerGraph(
            navController,this
        )
    }
}