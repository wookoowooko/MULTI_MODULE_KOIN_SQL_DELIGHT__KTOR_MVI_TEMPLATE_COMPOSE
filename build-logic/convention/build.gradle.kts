plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
    }
}

dependencies {
    compileOnly(libs.android.plugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "delivery.courier.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidApplicationCompose"){
            id = "delivery.courier.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidLibrary"){
            id = "delivery.courier.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidLibraryCompose"){
            id = "delivery.courier.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("dataStore"){
            id = "delivery.courier.dataStore"
            implementationClass = "DataStorePreferenceConventionPlugin"
        }
        register("feature"){
            id = "delivery.courier.feature"
            implementationClass = "FeatureConventionPlugin"
        }
        register("kotlinxSerialization"){
            id = "delivery.courier.kotlinxSerialization"
            implementationClass = "KotlinxSerializationConventionPlugin"
        }
        register("jvmLibrary"){
            id = "delivery.courier.jvmLibrary"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("koinWorkManger"){
            id = "delivery.courier.koinWorkManger"
            implementationClass = "WorkMangerKoinConventionPlugin"
        }
        register("koin"){
            id = "delivery.courier.koin"
            implementationClass = "KoinConventionPlugin"
        }
        register("sqlDelight"){
            id = "delivery.courier.sqlDelight"
            implementationClass = "SqlDelightConventionPlugin"
        }
    }
}

