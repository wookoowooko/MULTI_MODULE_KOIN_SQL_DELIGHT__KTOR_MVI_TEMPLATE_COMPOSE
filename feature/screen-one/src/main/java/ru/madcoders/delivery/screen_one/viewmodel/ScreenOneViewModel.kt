package ru.madcoders.delivery.screen_one.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import ru.madcoders.delivery.domain.IMasterRepository
import ru.madcoders.delivery.screen_one.mvi.ScreenOneEvents
import ru.madcoders.delivery.screen_one.mvi.ScreenOneState

class ScreenOneViewModel(
    private val master: IMasterRepository
) : ViewModel() {

    private val _state = MutableStateFlow(ScreenOneState())

    val state = combine(
        _state,
        master.example3()
    ) { screenState, exampleData ->
        // Здесь вы должны указать, как вы хотите объединять данные
        // Например, вы создаете новый объект состояния, который включает оба потока
        screenState.copy(exampleList = exampleData)
    }.stateIn(
        viewModelScope,  // Это гарантирует, что объединенные данные будут отслеживаться в жизненном цикле ViewModel
        SharingStarted.Eagerly,  // Когда поток будет активен
        ScreenOneState()  // Начальное значение
    )


    fun event(event: ScreenOneEvents) {
        when (event) {
            ScreenOneEvents.ExampleEvent -> {
                viewModelScope.launch {
                    master.example()
                }
            }
            is ScreenOneEvents.ExampleEventWithParam ->{
                    master.example2(event.param)
            }
        }
    }

}