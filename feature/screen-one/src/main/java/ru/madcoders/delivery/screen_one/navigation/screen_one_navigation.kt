package ru.madcoders.delivery.screen_one.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import ru.madcoders.delivery.screen_one.screen.ScreenOne


@Serializable
data object ScreenOneRoute


@OptIn(ExperimentalSharedTransitionApi::class)
fun NavGraphBuilder.screenOne(
    sharedTransitionScope: SharedTransitionScope,
    onCardClick: () -> Unit,
) {
    composable<ScreenOneRoute> { backStackEntry ->
        ScreenOneRoute(
            navBackStackEntry = backStackEntry,
            sharedTransitionScope = sharedTransitionScope,
            animatedTransitionScope = this,
            onCardClick = onCardClick,
        )
    }
}


@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ScreenOneRoute(
    navBackStackEntry: NavBackStackEntry,
    sharedTransitionScope: SharedTransitionScope,
    animatedTransitionScope: AnimatedContentScope,
    onCardClick: () -> Unit,

) {
    ScreenOne(
        backStackEntry = navBackStackEntry,
        sharedTransitionScope = sharedTransitionScope,
        animatedTransitionScope = animatedTransitionScope,
        onCardClick = onCardClick,
    )
}

