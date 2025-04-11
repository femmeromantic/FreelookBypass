package com.github.chromaticforge.freelook.bypass.mixins;

import cc.polyfrost.oneconfig.utils.hypixel.HypixelUtils;
import com.github.chromaticforge.freelook.config.FreelookConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = FreelookConfig.class, remap = false)
public class FreelookConfigMixin {
    @Redirect(method = "_init_$lambda$1", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk(HypixelUtils instance) {
        return false;
    }

    @Redirect(method = "_init_$lambda$2", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk2(HypixelUtils instance) {
        return false;
    }

    @Redirect(method = "_init_$lambda$3", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk3(HypixelUtils instance) {
        return false;
    }

    @Redirect(method = "_init_$lambda$4", at = @At(value = "INVOKE", target = "Lcc/polyfrost/oneconfig/utils/hypixel/HypixelUtils;isHypixel()Z"), remap = false)
    private static boolean idk4(HypixelUtils instance) {
        return false;
    }
}
