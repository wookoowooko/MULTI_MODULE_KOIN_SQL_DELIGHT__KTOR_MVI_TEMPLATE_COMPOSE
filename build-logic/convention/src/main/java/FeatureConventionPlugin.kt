import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.madcoders.delivery.convention.libs


class FeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            applyDependencies()
        }
    }

    private fun Project.applyPlugins() {
        pluginManager.apply {
            apply("delivery.courier.android.library")
            apply("delivery.courier.android.library.compose")
            apply("delivery.courier.kotlinxSerialization")
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", project(":feature:design-system"))
            add("implementation", libs.findBundle("material").get())
            add("implementation", libs.findLibrary("koin-androidx-compose").get())
            add("implementation", libs.findLibrary("navigation-compose").get())
        }
    }

}

