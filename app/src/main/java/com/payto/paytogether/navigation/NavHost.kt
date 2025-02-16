package com.payto.paytogether.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.payto.common.navigate.CreateJourney
import com.payto.common.navigate.Home
import com.payto.common.navigate.PastJourney
import com.payto.feature.createjourney.CreateJourneyRoute
import com.payto.feature.home.HomeRoute
import com.payto.feature.pastjourney.PastJourneyRoute


@Composable
fun PayToNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Home,
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
        exitTransition = {
            ExitTransition.None
        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(500)
            )
        },
        popEnterTransition = {
            EnterTransition.None
        }
    ) {
        composable<Home> { HomeRoute(onNavigate = { navController.navigate(it) }) }
        composable<CreateJourney> { CreateJourneyRoute(onBackClick = { navController.popBackStack() }) }
        composable<PastJourney> { PastJourneyRoute(onBackClick = { navController.popBackStack() }) }
    }
}
