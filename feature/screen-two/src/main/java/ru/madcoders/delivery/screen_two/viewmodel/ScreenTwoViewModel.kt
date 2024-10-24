package ru.madcoders.delivery.screen_two.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.madcoders.delivery.domain.IMasterRepository
import ru.madcoders.delivery.screen_two.mvi.ScreenTwoEvents
import ru.madcoders.delivery.screen_two.mvi.ScreenTwoState

class ScreenTwoViewModel(
    private val master: IMasterRepository
) : ViewModel() {

    private val _state = MutableStateFlow(ScreenTwoState())
    val state = _state.asStateFlow()

    fun event(event: ScreenTwoEvents) {
        when (event) {
            ScreenTwoEvents.ExampleEvent -> TODO()
            is ScreenTwoEvents.ExampleEventWithParam -> TODO()
        }
    }
}