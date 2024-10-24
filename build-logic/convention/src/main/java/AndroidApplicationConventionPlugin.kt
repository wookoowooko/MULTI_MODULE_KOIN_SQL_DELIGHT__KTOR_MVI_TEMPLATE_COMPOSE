import com.android.build.api.dsl.ApplicationExtension

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import ru.madcoders.delivery.convention.configureBuildTypes
import ru.madcoders.delivery.convention.configureKotlinAndroid
import ru.madcoders.delivery.convention.configureSigningConfig
import ru.madcoders.delivery.convention.libs

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            applyDependencies()
            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = 35
                configureSigningConfig(this)
                configureBuildTypes(this)
            }
        }
    }

    private fun Project.applyPlugins() {
        with(pluginManager) {
            apply("com.android.application")
            apply("org.jetbrains.kotlin.android")
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", libs.findLibrary("kotlinx-coroutines-core").get())
        }
    }
}
