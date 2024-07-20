package fr.alasdiablo.mods.wool.armor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WoolArmorBoots extends ArmorItem {
    public WoolArmorBoots(Holder<ArmorMaterial> material, Type equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext context, @NotNull List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("wool.armor.boots.hover.text").withStyle(ChatFormatting.GRAY));
    }
}
