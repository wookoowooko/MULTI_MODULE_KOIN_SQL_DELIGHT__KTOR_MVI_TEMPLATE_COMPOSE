package ru.madcoders.delivery.screen_one.mvi

import androidx.compose.runtime.Stable

@Stable
data class ScreenOneState(
    val isLoading: Boolean = true,
    val exampleString: String = "",
    val exampleList: List<String> = emptyList()
    //add more states
)



