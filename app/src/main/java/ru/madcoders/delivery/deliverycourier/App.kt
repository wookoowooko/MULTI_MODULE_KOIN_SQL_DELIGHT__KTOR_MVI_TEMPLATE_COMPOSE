package ru.madcoders.delivery.deliverycourier

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level
import ru.madcoders.delivery.data.di.data_module
import ru.madcoders.delivery.domain.MyLogger.logger
import ru.madcoders.delivery.screen_one.di.screen_one_module
import ru.madcoders.delivery.screen_two.di.screen_two_module

private const val TAG = "App"

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            logger.info(TAG, "koin Started")
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                screen_one_module,
                screen_two_module,
                data_module,
            )
        }
    }
}