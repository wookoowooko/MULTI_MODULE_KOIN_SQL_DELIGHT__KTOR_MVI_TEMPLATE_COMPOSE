
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.madcoders.delivery.convention.libs


class DataStorePreferenceConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyDependencies()

        }
    }
    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", libs.findBundle("prefs").get())
        }
    }
}
