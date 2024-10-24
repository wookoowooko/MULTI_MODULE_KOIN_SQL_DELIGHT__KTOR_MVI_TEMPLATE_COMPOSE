plugins {
    alias(libs.plugins.delivery.courier.android.library)
    alias(libs.plugins.delivery.courier.dataStore)
    alias(libs.plugins.delivery.courier.koin)
}

android {
    namespace = "ru.madcoders.delivery.data"
}

dependencies {

    projects.apply {
        api(core.domain)
        api(core.network)
        api(core.database)
        api(core.datastore)
    }
}

