package com.payto.paytogether.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.payto.feature.common.HandleSideEffect
import com.payto.feature.createjourney.CreateJourneyRoute
import com.payto.feature.home.HomeRoute
import com.payto.feature.joinjourney.JoinJourneyRoute
import com.payto.feature.journey.JourneyRoute
import com.payto.feature.journey.expense.ExpenseSettingRoute
import com.payto.feature.journeydetail.JourneyDetailRoute
import com.payto.feature.journeydetail.item.ExpenseItemSettingRoute
import com.payto.feature.journeydetail.item.JourneyExpenseItemDetailRoute
import com.payto.feature.journeyhistory.JourneyHistoryRoute
import com.payto.feature.journeyresult.JourneyResultRoute
import com.payto.feature.journeyresult.category.CategoryDetailRoute
import com.payto.feature.journeysetting.JourneySettingRoute
import com.payto.model.navigate.CategoryDetail
import com.payto.model.navigate.CreateJourney
import com.payto.model.navigate.ExpenseItemSetting
import com.payto.model.navigate.ExpenseSetting
import com.payto.model.navigate.Home
import com.payto.model.navigate.JoinJourney
import com.payto.model.navigate.Journey
import com.payto.model.navigate.JourneyDetail
import com.payto.model.navigate.JourneyExpenseItemDetail
import com.payto.model.navigate.JourneyHistory
import com.payto.model.navigate.JourneyResult
import com.payto.model.navigate.JourneySetting
import com.payto.paytogether.deeplink.DeepLinkViewModel


@Composable
fun PayToNavHost(
    navController: NavHostController = rememberNavController(),
    deepLinkViewModel: DeepLinkViewModel,
) {

    HandleSideEffect(
        deepLinkViewModel,
        { navController.navigate(it) },
        { navController.popBackStack() }
    )

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
        composable<Home> { HomeRoute(onNavigate = { destination ->
            if (destination == Home) {
                navController.navigate(Home) {
                    popUpTo(navController.graph.findStartDestination().id) {
                        inclusive = true
                    }
                    launchSingleTop = true
                }
            } else {
                navController.navigate(destination)
            }
        }) }
        composable<CreateJourney> {
            CreateJourneyRoute(
                onBackClick = { navController.popBackStack() },
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
            )
        }
        composable<Journey> {
            JourneyRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyHistory> {
            JourneyHistoryRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyDetail> {
            JourneyDetailRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyExpenseItemDetail> {
            JourneyExpenseItemDetailRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JoinJourney> {
            JoinJourneyRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.popBackStack()
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() }
            )
        }
        composable<JourneyResult> {
            JourneyResultRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<CategoryDetail> {
            CategoryDetailRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<ExpenseSetting> {
            ExpenseSettingRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<JourneySetting> {
            JourneySettingRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() },
            )
        }
        composable<ExpenseItemSetting> {
            ExpenseItemSettingRoute(
                onNavigate = { destination ->
                    if (destination == Home) {
                        navController.navigate(Home) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                inclusive = true
                            }
                            launchSingleTop = true
                        }
                    } else {
                        navController.navigate(destination)
                    }
                },
                onBackClick = { navController.popBackStack() },
            )
        }
    }
}

