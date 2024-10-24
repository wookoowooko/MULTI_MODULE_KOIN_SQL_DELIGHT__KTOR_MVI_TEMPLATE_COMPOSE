import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.madcoders.delivery.convention.libs

class KotlinxSerializationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            applyDependencies()
        }
    }

    private fun Project.applyPlugins() {
        with(pluginManager) {
            apply(libs.findPlugin("kotlinx-serialization").get().get().pluginId)
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            "implementation"(libs.findLibrary("kotlinx-serialization").get())
        }
    }
}