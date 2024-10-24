plugins {
    alias(libs.plugins.delivery.courier.feature)
}

android {
    namespace = "ru.madcoders.delivery.deliverycourier.screen_one"
}

dependencies {
    projects.apply {
        implementation(core.data)
    }

}