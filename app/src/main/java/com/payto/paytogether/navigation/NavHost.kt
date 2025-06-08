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
import com.payto.common.navigate.CategoryDetail
import com.payto.common.navigate.CreateJourney
import com.payto.common.navigate.ExpenseSetting
import com.payto.common.navigate.Home
import com.payto.common.navigate.JoinJourney
import com.payto.common.navigate.Journey
import com.payto.common.navigate.JourneyDetail
import com.payto.common.navigate.JourneyHistory
import com.payto.common.navigate.JourneyExpenseItemDetail
import com.payto.common.navigate.JourneyResult
import com.payto.feature.createjourney.CreateJourneyRoute
import com.payto.feature.home.HomeRoute
import com.payto.feature.joinjourney.JoinJourneyRoute
import com.payto.feature.journey.JourneyRoute
import com.payto.feature.journey.expense.ExpenseSettingRoute
import com.payto.feature.journeydetail.JourneyDetailRoute
import com.payto.feature.journeydetail.item.JourneyExpenseItemDetailRoute
import com.payto.feature.journeyhistory.JourneyHistoryRoute
import com.payto.feature.journeyresult.JourneyResultRoute
import com.payto.feature.journeyresult.category.CategoryDetailRoute


@Composable
fun PayToNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Home,
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(200)
            )
        },
        exitTransition = {
            ExitTransition.None
        },
        popExitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(200)
            )
        },
        popEnterTransition = {
            EnterTransition.None
        }
    ) {
        composable<Home> { HomeRoute(onNavigate = { navController.navigate(it) }) }
        composable<CreateJourney> {
            CreateJourneyRoute(
                onBackClick = { navController.popBackStack() },
                onNavigate = { navController.navigate(it) },
            )
        }
        composable<Journey> {
            JourneyRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyHistory> {
            JourneyHistoryRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyDetail> {
            JourneyDetailRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyExpenseItemDetail> {
            JourneyExpenseItemDetailRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JoinJourney> {
            JoinJourneyRoute(
                onNavigate = {
                    navController.popBackStack()
                    navController.navigate(it)
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyResult> {
            JourneyResultRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<CategoryDetail> {
            CategoryDetailRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<ExpenseSetting> {
            ExpenseSettingRoute(
                onNavigate = { navController.navigate(it) },
                onBackClick = { navController.popBackStack() },
            )
        }
    }
}
