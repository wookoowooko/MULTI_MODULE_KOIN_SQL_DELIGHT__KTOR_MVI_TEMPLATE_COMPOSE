package ru.madcoders.delivery.screen_one.screen

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import ru.madcoders.delivery.screen_one.components.ScreenOneContent

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun ScreenOne(
    backStackEntry: NavBackStackEntry,
    sharedTransitionScope: SharedTransitionScope,
    animatedTransitionScope: AnimatedContentScope,
    onCardClick: () -> Unit
) {
    ScreenOneContent(
        onCardClick = onCardClick
    )
}

