
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import ru.madcoders.delivery.convention.libs


class SqlDelightConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            applyPlugins()
            applyDependencies()

        }
    }

    private fun Project.applyPlugins() {
        with(pluginManager){
            apply("app.cash.sqldelight")
        }
    }

    private fun Project.applyDependencies() {
        dependencies {
            add("implementation", libs.findBundle("sql-delight-bundle").get())
        }
    }

}
