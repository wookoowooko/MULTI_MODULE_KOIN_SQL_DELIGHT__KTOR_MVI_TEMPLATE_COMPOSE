package ru.madcoders.delivery.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project

internal fun Project.configureSigningConfig(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        signingConfigs {
            create("release") {
                keyAlias = "kitchen"
                storePassword = "kitchen"
                keyPassword = "kitchen"
                storeFile = file("$rootDir/kitchen.jks")
                storeType = "jks"
            }
        }
    }
}