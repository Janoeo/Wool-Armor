package fr.alasdiablo.mods.wool.armor.init;

import fr.alasdiablo.mods.lib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("unused")
public class WoolCreativeTabs {
    public static final ResourceKey<CreativeModeTab> MATERIALS_GROUP = ResourceKey.create(
            Registries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(WoolArmorCommon.MOD_ID, "tab")
    );

    public static void init() {
        CreativeModeTab.Builder builder = FabricItemGroup.builder();

        GroundCreativeModeTab.createBaseBuilder(builder);

        builder.title(Component.translatable("item_group." + WoolArmorCommon.MOD_ID + ".tab"));
        builder.icon(() -> new ItemStack(WoolItems.RED_WOOL_ARMOR.getChestplate()));
        builder.displayItems(WoolItems::displayItemsGenerator);

        Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                MATERIALS_GROUP,
                builder.build()
        );
    }
}
