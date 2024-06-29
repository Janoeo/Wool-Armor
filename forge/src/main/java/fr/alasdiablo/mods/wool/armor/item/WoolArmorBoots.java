package fr.alasdiablo.mods.wool.armor.item;

import fr.alasdiablo.mods.wool.armor.init.WoolTags;
import fr.alasdiablo.mods.wool.armor.utils.BootsUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ParametersAreNonnullByDefault
public class WoolArmorBoots extends ArmorItem {
    public WoolArmorBoots(ArmorMaterial material, Type equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    public static void onLivingFall(LivingFallEvent event) {
        LivingEntity livingEntity = event.getEntity();
        ItemStack    itemStack    = livingEntity.getItemBySlot(EquipmentSlot.FEET);
        Item         item         = itemStack.getItem();
        if (itemStack.is(WoolTags.FALL_DAMAGE_REDUCERS)) {
            event.setDamageMultiplier(0.5f);
            MobEffectInstance jumpEffect = livingEntity.getEffect(MobEffects.JUMP);
            if (BootsUtils.calculateFallDamage(jumpEffect, event.getDistance(), event.getDamageMultiplier()) >= 1) {
                item.setDamage(itemStack, item.getDamage(itemStack) + 1);
            }
        }
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return stack.getItem() instanceof WoolArmorBoots || super.canWalkOnPowderedSnow(stack, wearer);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("wool.armor.boots.hover.text").withStyle(ChatFormatting.GRAY));
    }
}
