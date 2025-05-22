package com.github.chromaticforge.freelook.bypass.mixins;

import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Pseudo
@Mixin(targets = "com.github.chromaticforge.freelook.hook.FreelookHook", remap = false)
public class FreelookMixin {

    @Dynamic("Freelook Mod")
    @Redirect(method = "overrideMouse", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk(HypixelUtils instance) {
        return false;
    }

}
