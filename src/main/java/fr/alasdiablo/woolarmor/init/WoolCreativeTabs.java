package fr.alasdiablo.woolarmor.init;

import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.woolarmor.WoolArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class WoolCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WoolArmor.MOD_ID);

    public static RegistryObject<CreativeModeTab> MATERIALS_GROUP = CREATIVE_TABS.register("tab", () -> {
        CreativeModeTab.Builder builder = CreativeModeTab.builder();
        GroundCreativeModeTab.createBaseBuilder(builder);
        builder.title(Component.translatable("item_group." + WoolArmor.MOD_ID + ".tab"));
        builder.icon(() -> new ItemStack(WoolItems.RED_WOOL_ARMOR.getChestplate()));
        builder.displayItems(WoolItems::displayItemsGenerator);
        return builder.build();
    });

    public static void init(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
