package ru.madcoders.delivery.screen_two.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import ru.madcoders.delivery.screen_two.screen.ScreenTwo


@Serializable
data object ScreenTwoRoute

fun NavController.navigateToScreenTwo(
) {
    navigate(
        ScreenTwoRoute
    )
}

@OptIn(ExperimentalSharedTransitionApi::class)
fun NavGraphBuilder.screenTwo(
    sharedTransitionScope: SharedTransitionScope,
    onCardClick: () -> Unit,
) {
    composable<ScreenTwoRoute> { backStackEntry ->
        ScreenTwoRoute(
            navBackStackEntry = backStackEntry,
            sharedTransitionScope = sharedTransitionScope,
            animatedTransitionScope = this,
            onCardClick = onCardClick
        )
    }
}


@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ScreenTwoRoute(
    navBackStackEntry: NavBackStackEntry,
    sharedTransitionScope: SharedTransitionScope,
    animatedTransitionScope: AnimatedContentScope,
    onCardClick: () -> Unit,

) {
    ScreenTwo(
        backStackEntry = navBackStackEntry,
        sharedTransitionScope = sharedTransitionScope,
        animatedTransitionScope = animatedTransitionScope,
        onCardClick = onCardClick
    )
}

