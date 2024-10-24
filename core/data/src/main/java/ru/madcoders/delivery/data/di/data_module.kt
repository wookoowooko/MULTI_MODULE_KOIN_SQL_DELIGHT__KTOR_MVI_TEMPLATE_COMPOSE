package ru.madcoders.delivery.data.di

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ru.madcoders.delivery.data.MasterRepositoryImpl
import ru.madcoders.delivery.domain.IMasterRepository

val data_module = module {
    singleOf(::MasterRepositoryImpl) { bind<IMasterRepository>() }
}