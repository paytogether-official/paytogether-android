package com.payto.paytogether.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.payto.common.navigate.CreateJourney
import com.payto.common.navigate.Home
import com.payto.feature.createjourney.CreateJourneyRoute
import com.payto.feature.home.HomeRoute


@Composable
fun PayToNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Home) {
        composable<Home> { HomeRoute(onNavigate = { navController.navigate(it) }) }
        composable<CreateJourney> { CreateJourneyRoute() }
    }
}
