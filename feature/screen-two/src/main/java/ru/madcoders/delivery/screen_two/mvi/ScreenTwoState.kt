package ru.madcoders.delivery.screen_two.mvi

import androidx.compose.runtime.Stable

@Stable
data class ScreenTwoState(
    val isLoading: Boolean = true,
    val exampleString: String = "",
    val exampleList: List<String> = emptyList()
    //add more states
)



