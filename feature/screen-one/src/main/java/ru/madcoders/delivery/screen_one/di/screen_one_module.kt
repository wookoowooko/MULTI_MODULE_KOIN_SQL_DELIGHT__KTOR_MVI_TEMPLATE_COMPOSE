package ru.madcoders.delivery.screen_one.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import ru.madcoders.delivery.screen_one.viewmodel.ScreenOneViewModel

val screen_one_module = module {
    viewModelOf(::ScreenOneViewModel)
}