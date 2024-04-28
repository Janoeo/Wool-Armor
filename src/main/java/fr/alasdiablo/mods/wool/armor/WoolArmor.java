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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@Mod(WoolArmor.MOD_ID)
public class WoolArmor {
    public static final String MOD_ID = "wool_armor";

    public static final Logger logger = LogManager.getLogger(WoolArmor.MOD_ID);

    public WoolArmor(@NotNull IEventBus modEventBus) {
        WoolItems.init(modEventBus);
        WoolCreativeTabs.init(modEventBus);
        modEventBus.addListener(this::onCommonSetup);
        modEventBus.addListener(this::gatherData);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        NeoForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
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
