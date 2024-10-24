plugins {
    alias(libs.plugins.delivery.courier.android.library)
    alias(libs.plugins.delivery.courier.android.library.compose)
    alias(libs.plugins.delivery.courier.koin)
    alias(libs.plugins.delivery.courier.sqlDelight)
}

android {
    namespace = "ru.madcoders.delivery.database"
}

dependencies {
    projects.core.apply {
        implementation(domain)
    }
}

sqldelight {
    databases {
        create("CourierDatabase") {
            packageName.set("ru.madcoders.deliverycourier.database")
            dialect("app.cash.sqldelight:sqlite-3-24-dialect:2.0.2")
            verifyMigrations.set(true)
            schemaOutputDirectory.set(file("src/main/sqldelight/databases"))
        }
    }
}
