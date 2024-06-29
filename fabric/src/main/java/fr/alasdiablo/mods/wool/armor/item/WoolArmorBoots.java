package fr.alasdiablo.mods.wool.armor.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import java.util.List;

public class WoolArmorBoots extends ArmorItem {
    public WoolArmorBoots(ArmorMaterial material, Type equipmentSlot, Properties properties) {
        super(material, equipmentSlot, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable("wool.armor.boots.hover.text").withStyle(ChatFormatting.GRAY));
    }
}
