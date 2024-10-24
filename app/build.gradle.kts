plugins {
    alias(libs.plugins.delivery.courier.application.compose)
    alias(libs.plugins.delivery.courier.application)
    alias(libs.plugins.delivery.courier.koin)
}

android {
    namespace = "ru.madcoders.delivery.deliverycourier"
    compileSdk = 35

    bundle {
        language {
            enableSplit = false
        }
    }
    buildTypes {
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {

    projects.feature.apply {
        implementation(designSystem)
        implementation(screenOne)
        implementation(screenTwo)

    }
    projects.core.apply {
        implementation(data)
    }

    libs.apply {
        implementation(androidx.material3)
        implementation(navigation.compose)
    }
}