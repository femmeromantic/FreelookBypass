@file:Suppress("UnstableApiUsage", "PropertyName")
import dev.deftu.gradle.utils.GameSide

plugins {
    id("java")
    alias(libs.plugins.deftu)
    alias(libs.plugins.shadow)
    alias(libs.plugins.bloom)
    alias(libs.plugins.loom)
    alias(libs.plugins.ducks)
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
}

repositories {
    maven("https://repo.spongepowered.org/maven/")
}

dependencies {
    compileOnly("org.spongepowered:mixin:0.7.11-SNAPSHOT")
}