plugins {
    alias(libs.plugins.delivery.courier.android.library)
    alias(libs.plugins.delivery.courier.dataStore)
    alias(libs.plugins.delivery.courier.kotlinxSerialization)
}

android {
    namespace = "ru.madcoders.delivery.datastore"
}

dependencies {
    projects.apply {
        implementation(core.domain)
    }
}