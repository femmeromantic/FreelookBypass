package com.github.chromaticforge.freelook.bypass.mixins;

import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import com.github.chromaticforge.freelook.Freelook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = Freelook.class, remap = false)
public class FreelookMixin {
    @Redirect(method = "overrideMouse", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk(HypixelUtils instance) {
        return false;
    }
}
