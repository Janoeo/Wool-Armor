package fr.alasdiablo.mods.wool.armor.mixin;

import fr.alasdiablo.mods.wool.armor.init.WoolItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.PowderSnowBlock;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PowderSnowBlock.class)
public class PowderSnowBlockMixin {

    @Inject(method = "canEntityWalkOnPowderSnow", at = @At("RETURN"), cancellable = true)
    private static void canEntityWalkOnPowderSnow(Entity entity, @NotNull CallbackInfoReturnable<Boolean> callback) {
        if (!callback.getReturnValue()) {
            if (entity instanceof LivingEntity livingEntity) {
                ItemStack boots = livingEntity.getItemBySlot(EquipmentSlot.FEET);
                if (WoolItems.boots().contains(boots.getItem())) {
                    callback.setReturnValue(true);
                }
            }
        }
    }
}
