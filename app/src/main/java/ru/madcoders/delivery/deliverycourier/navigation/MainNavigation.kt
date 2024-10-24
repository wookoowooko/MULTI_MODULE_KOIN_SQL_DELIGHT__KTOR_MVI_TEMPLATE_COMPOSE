package ru.madcoders.delivery.deliverycourier.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ru.madcoders.delivery.domain.MyLogger.logger
import ru.madcoders.delivery.screen_one.navigation.ScreenOneRoute
import ru.madcoders.delivery.screen_one.navigation.screenOne
import ru.madcoders.delivery.screen_two.navigation.navigateToScreenTwo
import ru.madcoders.delivery.screen_two.navigation.screenTwo


private const val TAG = "MainNavigation"


@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun MainRouter() {

    val navigator = rememberNavController()

    SharedTransitionLayout {
        NavHost(
            navController = navigator,
            startDestination = ScreenOneRoute,
        ) {
            screenOne(
                sharedTransitionScope = this@SharedTransitionLayout,
                onCardClick = {
                    logger.info( TAG,"onCardClick")
                    if (navigator.canGoBack) navigator.navigateToScreenTwo()
                }
            )
            screenTwo(
                sharedTransitionScope = this@SharedTransitionLayout,
                onCardClick = navigator::popBackStack
            )
        }
    }
}

internal val NavHostController.canGoBack: Boolean
    get() = this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED


