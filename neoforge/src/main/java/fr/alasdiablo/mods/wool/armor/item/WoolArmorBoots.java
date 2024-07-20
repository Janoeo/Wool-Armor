package fr.alasdiablo.mods.wool.armor.item;

import fr.alasdiablo.mods.wool.armor.init.WoolTags;
import fr.alasdiablo.mods.wool.armor.utils.BootsUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.event.entity.living.LivingFallEvent;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static fr.alasdiablo.mods.wool.armor.init.WoolItems.*;
import static fr.alasdiablo.mods.wool.armor.init.WoolItems.YELLOW_WOOL_ARMOR;

@ParametersAreNonnullByDefault
public class WoolArmorBoots extends ArmorItem {
    private static final Supplier<List<Item>> BOOTS = () -> Arrays.stream(new Item[]{
            BLACK_WOOL_ARMOR.getBoots(),
            BLUE_WOOL_ARMOR.getBoots(),
            WHITE_WOOL_ARMOR.getBoots(),
            BROWN_WOOL_ARMOR.getBoots(),
            CYAN_WOOL_ARMOR.getBoots(),
            GRAY_WOOL_ARMOR.getBoots(),
            GREEN_WOOL_ARMOR.getBoots(),
            LIGHT_BLUE_WOOL_ARMOR.getBoots(),
            LIGHT_GRAY_WOOL_ARMOR.getBoots(),
            LIME_WOOL_ARMOR.getBoots(),
            MAGENTA_WOOL_ARMOR.getBoots(),
            ORANGE_WOOL_ARMOR.getBoots(),
            PINK_WOOL_ARMOR.getBoots(),
            PURPLE_WOOL_ARMOR.getBoots(),
            RED_WOOL_ARMOR.getBoots(),
            YELLOW_WOOL_ARMOR.getBoots()
    }).toList();

    public WoolArmorBoots(Holder<ArmorMaterial> material, Type equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    public static void onLivingFall(LivingFallEvent event) {
        LivingEntity livingEntity = event.getEntity();
        ItemStack    itemStack    = livingEntity.getItemBySlot(EquipmentSlot.FEET);
        Item         item         = itemStack.getItem();

        if (itemStack.is(WoolTags.FALL_DAMAGE_REDUCERS) || BOOTS.get().contains(item)) {
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
    public void appendHoverText(ItemStack itemStack, TooltipContext context, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(
                Component.translatable("wool.armor.boots.hover.text").withStyle(ChatFormatting.GRAY)
        );
    }
}
