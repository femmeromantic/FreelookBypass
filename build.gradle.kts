@file:Suppress("UnstableApiUsage", "PropertyName")
import dev.deftu.gradle.utils.GameSide

plugins {
    id("java")
    alias(libs.plugins.deftu)
    alias(libs.plugins.shadow)
    alias(libs.plugins.bloom)
    alias(libs.plugins.loom)
    alias(libs.plugins.resources)
}

toolkitLoomHelper {
    // dev env
    disableRunConfigs(GameSide.SERVER)
    useDevAuth(libs.versions.devauth.get())
    useProperty("mixin.debug.export", "true", GameSide.CLIENT)

    // mixins
    useForgeMixin(modData.id)
    useMixinRefMap(modData.id)
    useTweaker("org.spongepowered.asm.launch.MixinTweaker")
}

repositories {
    maven("https://repo.spongepowered.org/maven/")
}

sourceSets {
    val dummy by creating
    main {
        dummy.compileClasspath += compileClasspath
        compileClasspath += dummy.output
        output.setResourcesDir(java.classesDirectory)
    }
}


dependencies {
    compileOnly(files("libs/Freelook.jar"))

    implementation(shade("org.spongepowered:mixin:0.7.11-SNAPSHOT") { isTransitive = false })
}