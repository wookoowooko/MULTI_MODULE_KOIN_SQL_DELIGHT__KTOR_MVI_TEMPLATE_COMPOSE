package ru.madcoders.delivery.screen_two.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.madcoders.delivery.screen_two.viewmodel.ScreenTwoViewModel

val screen_two_module = module {
    viewModelOf(::ScreenTwoViewModel)
}