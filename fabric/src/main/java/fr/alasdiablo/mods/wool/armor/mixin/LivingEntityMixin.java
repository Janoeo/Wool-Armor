package fr.alasdiablo.mods.wool.armor.mixin;

import fr.alasdiablo.mods.wool.armor.init.WoolItems;
import fr.alasdiablo.mods.wool.armor.utils.BootsUtils;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    public abstract ItemStack getItemBySlot(EquipmentSlot equipmentSlot);

    @Shadow
    public abstract MobEffectInstance getEffect(MobEffect mobEffect);

    @Inject(method = "calculateFallDamage", at = @At("RETURN"), cancellable = true)
    protected void calculateFallDamage(float distance, float damageMultiplier, @NotNull CallbackInfoReturnable<Integer> callback) {
        if (callback.getReturnValue() == 0) {
            return;
        }
        ItemStack boots = this.getItemBySlot(EquipmentSlot.FEET);
        if (WoolItems.boots().contains(boots.getItem())) {
            MobEffectInstance jumpEffect = this.getEffect(MobEffects.JUMP);
            float             dmg        = BootsUtils.calculateFallDamage(jumpEffect, distance, damageMultiplier) * 0.5f;

            if (dmg > 0.0f) {
                boots.setDamageValue(boots.getDamageValue() + 1);
            }

            callback.setReturnValue(Mth.floor(dmg));
        }
    }
}
