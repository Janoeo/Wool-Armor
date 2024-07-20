package fr.alasdiablo.mods.wool.armor;


import fr.alasdiablo.mods.wool.armor.data.ModelProvider;
import fr.alasdiablo.mods.wool.armor.data.RecipesProvider;
import fr.alasdiablo.mods.wool.armor.data.WoolArmorBlocksTagsProvider;
import fr.alasdiablo.mods.wool.armor.data.WoolArmorItemsTagsProvider;
import fr.alasdiablo.mods.wool.armor.init.WoolCreativeTabs;
import fr.alasdiablo.mods.wool.armor.init.WoolItems;
import fr.alasdiablo.mods.wool.armor.init.WoolMaterials;
import fr.alasdiablo.mods.wool.armor.item.WoolArmorBoots;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@Mod(WoolArmorCommon.MOD_ID)
public class WoolArmorNeoForge {

    public WoolArmorNeoForge(IEventBus eventBus) {
        WoolArmorCommon.init();

        WoolMaterials.init(eventBus);
        WoolItems.init(eventBus);
        WoolCreativeTabs.init(eventBus);
        eventBus.addListener(this::onCommonSetup);
        eventBus.addListener(this::gatherData);

        NeoForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        // NeoForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
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
        generator.addProvider(event.includeServer(), new RecipesProvider(output, lookup));
    }
}