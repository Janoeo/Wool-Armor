package fr.alasdiablo.mods.wool.armor.init;

import fr.alasdiablo.mods.lib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@SuppressWarnings("unused")
public class WoolCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoolArmorCommon.MOD_ID);

    public static DeferredHolder<CreativeModeTab, CreativeModeTab> MATERIALS_GROUP = CREATIVE_TABS.register("tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
        GroundCreativeModeTab.createBaseBuilder(builder);
        builder.title(Component.translatable("item_group." + WoolArmorCommon.MOD_ID + ".tab"));
        builder.icon(() -> new ItemStack(WoolItems.RED_WOOL_ARMOR.getChestplate()));
        builder.displayItems(WoolItems::displayItemsGenerator);
        return builder.build();
    });

    public static void init(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
