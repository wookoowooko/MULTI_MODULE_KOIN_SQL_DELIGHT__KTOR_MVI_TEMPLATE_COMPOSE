package ru.madcoders.delivery.screen_two.mvi

sealed interface ScreenTwoEvents {

    /**
     * Events go here
     * */

    data object ExampleEvent : ScreenTwoEvents
    data class ExampleEventWithParam(val param: String) : ScreenTwoEvents
}