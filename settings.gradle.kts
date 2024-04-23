pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            mavenCentral()
            maven { url = uri("https://jitpack.io") }
            google()
            jcenter()
        }
    }
}

rootProject.name = "rlc_sim_pc191777_dm201736_dv201086_ll191567"
include(":app")
 