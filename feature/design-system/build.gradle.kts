plugins {
    alias(libs.plugins.delivery.courier.android.library)
    alias(libs.plugins.delivery.courier.android.library.compose)
}

android {
    namespace = "ru.madcoders.delivery.design_system"
}

dependencies {

    libs.apply {
        api(material.icons.extended)
        implementation(androidx.ui.tooling.preview)
        implementation(androidx.ui.tooling)
        implementation(androidx.material3)
        implementation(kotlinx.date)
        implementation(lottie.compose)
        api(bundles.coil)
    }
}