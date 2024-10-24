plugins {
    alias(libs.plugins.delivery.courier.feature)
}

android {
    namespace = "ru.madcoders.delivery.deliverycourier_screen_two"
}

dependencies {
    projects.apply {
        implementation(core.data)
    }

}