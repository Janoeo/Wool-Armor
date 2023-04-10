package fr.alasdiablo.woolarmor;

import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.diolib.api.util.ResourceLocations;
import fr.alasdiablo.woolarmor.data.ModelProvider;
import fr.alasdiablo.woolarmor.data.RecipesProvider;
import fr.alasdiablo.woolarmor.data.WoolArmorBlocksTagsProvider;
import fr.alasdiablo.woolarmor.data.WoolArmorItemsTagsProvider;
import fr.alasdiablo.woolarmor.init.WoolItems;
import fr.alasdiablo.woolarmor.item.WoolArmorBoots;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@Mod(Registries.MOD_ID)
public class WoolArmor {

    public static final Logger logger = LogManager.getLogger(Registries.MOD_ID);

    public static CreativeModeTab CREATIVE_TAB;

    public WoolArmor() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        WoolItems.init(modBus);
        modBus.addListener(this::onCommonSetup);
        modBus.addListener(this::gatherData);
        modBus.addListener(this::registerCreativeModeTabs);
        modBus.addListener(WoolItems::onCreativeModeTabEvent);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
    }

    private void registerCreativeModeTabs(@NotNull CreativeModeTabEvent.Register event) {
        CREATIVE_TAB = event.registerCreativeModeTab(ResourceLocations.of(Registries.MOD_ID, "tab"), (builder) -> {
            GroundCreativeModeTab.createBaseBuilder(builder);
            builder.title(Component.translatable("item_group." + Registries.MOD_ID + ".tab"));
            builder.icon(() -> new ItemStack(WoolItems.RED_WOOL_ARMOR.getChestplate()));
        });
    }

    private void gatherData(@NotNull GatherDataEvent event) {
        WoolArmor.logger.debug("Start data generator");
        final DataGenerator                            generator          = event.getGenerator();
        final PackOutput                               output             = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup             = event.getLookupProvider();
        final ExistingFileHelper                       existingFileHelper = event.getExistingFileHelper();

        WoolArmor.logger.debug("Add Item Model Provider");
        generator.addProvider(true, new ModelProvider(output, existingFileHelper));

        WoolArmor.logger.debug("Add Tags Provider");
        final WoolArmorBlocksTagsProvider blockTagsProvider = new WoolArmorBlocksTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new WoolArmorItemsTagsProvider(output, lookup, blockTagsProvider, existingFileHelper));

        WoolArmor.logger.debug("Add Recipes Provider");
        generator.addProvider(event.includeServer(), new RecipesProvider(output));
    }
}
