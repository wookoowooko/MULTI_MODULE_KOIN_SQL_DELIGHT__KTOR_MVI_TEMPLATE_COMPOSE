plugins {
    alias(libs.plugins.delivery.courier.jvmLibrary)
}

dependencies{
    projects.apply {
        implementation(core.domain)
    }
    libs.apply {
        api(bundles.ktor)
    }
}