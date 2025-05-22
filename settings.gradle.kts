import groovy.lang.MissingPropertyException

pluginManagement {
    repositories {
        maven("https://maven.deftu.dev/releases")
        maven("https://maven.fabricmc.net")
        maven("https://maven.architectury.dev/")
        maven("https://maven.minecraftforge.net")
        maven("https://repo.essential.gg/repository/maven-public")
        maven("https://jitpack.io/")

        maven("https://maven.deftu.dev/snapshots")
        maven("https://s01.oss.sonatype.org/content/groups/public/")

        gradlePluginPortal()
        mavenCentral()
    }
}

val projectName: String = extra["mod.name"]?.toString()
    ?: throw MissingPropertyException("mod.name has not been set.")

rootProject.name = projectName