package ru.madcoders.delivery.screen_one.mvi

sealed interface ScreenOneEvents {

    /**
     * Events go here
     * */

    data object ExampleEvent : ScreenOneEvents
    data class ExampleEventWithParam(val param: Long) : ScreenOneEvents
}