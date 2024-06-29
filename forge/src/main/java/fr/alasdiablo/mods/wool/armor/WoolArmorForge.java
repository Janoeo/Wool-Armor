package fr.alasdiablo.mods.wool.armor;

import fr.alasdiablo.mods.wool.armor.data.ModelProvider;
import fr.alasdiablo.mods.wool.armor.data.RecipesProvider;
import fr.alasdiablo.mods.wool.armor.data.WoolArmorBlocksTagsProvider;
import fr.alasdiablo.mods.wool.armor.data.WoolArmorItemsTagsProvider;
import fr.alasdiablo.mods.wool.armor.init.WoolCreativeTabs;
import fr.alasdiablo.mods.wool.armor.init.WoolItems;
import fr.alasdiablo.mods.wool.armor.item.WoolArmorBoots;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@Mod(WoolArmorCommon.MOD_ID)
public class WoolArmorForge {

    public WoolArmorForge() {
        WoolArmorCommon.init();

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        WoolItems.init(eventBus);
        WoolCreativeTabs.init(eventBus);
        eventBus.addListener(this::onCommonSetup);
        eventBus.addListener(this::gatherData);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
    }

    private void gatherData(@NotNull GatherDataEvent event) {
        WoolArmorCommon.LOG.debug("Start data generator");
        final DataGenerator                            generator          = event.getGenerator();
        final PackOutput                               output             = generator.getPackOutput();
        final CompletableFuture<HolderLookup.Provider> lookup             = event.getLookupProvider();
        final ExistingFileHelper                       existingFileHelper = event.getExistingFileHelper();

        WoolArmorCommon.LOG.debug("Add Item Model Provider");
        generator.addProvider(true, new ModelProvider(output, existingFileHelper));

        WoolArmorCommon.LOG.debug("Add Tags Provider");
        final WoolArmorBlocksTagsProvider blockTagsProvider = new WoolArmorBlocksTagsProvider(output, lookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new WoolArmorItemsTagsProvider(output, lookup, blockTagsProvider, existingFileHelper));

        WoolArmorCommon.LOG.debug("Add Recipes Provider");
        generator.addProvider(event.includeServer(), new RecipesProvider(output));
    }
}