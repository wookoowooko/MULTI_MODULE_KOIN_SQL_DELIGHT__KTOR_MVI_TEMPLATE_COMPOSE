package ru.madcoders.delivery.screen_two.screen

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import ru.madcoders.delivery.screen_two.components.ScreenTwoContent

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ScreenTwo(
    backStackEntry: NavBackStackEntry,
    sharedTransitionScope: SharedTransitionScope,
    animatedTransitionScope: AnimatedContentScope,
    onCardClick: () -> Unit
) {
    ScreenTwoContent(onCardClick = onCardClick)
}

