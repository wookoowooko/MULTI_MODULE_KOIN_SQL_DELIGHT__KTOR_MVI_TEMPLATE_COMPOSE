package ru.madcoders.delivery.convention

import com.android.build.api.dsl.ApplicationBuildType
import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project


internal fun Project.configureBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
) {
    commonExtension.apply {
        buildTypes {
            getByName("release") {
                this as ApplicationBuildType
                isDebuggable = false
                isMinifyEnabled = true
                multiDexEnabled = true
                proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            }
            getByName("debug") {
                this as ApplicationBuildType
                isDebuggable = true
                isMinifyEnabled = false
                multiDexEnabled = true
            }
        }
    }
}
