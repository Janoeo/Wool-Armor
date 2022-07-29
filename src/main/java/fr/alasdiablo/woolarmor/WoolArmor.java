package fr.alasdiablo.woolarmor;

import fr.alasdiablo.diolib.api.item.GroundCreativeModeTab;
import fr.alasdiablo.woolarmor.data.ModelProvider;
import fr.alasdiablo.woolarmor.data.RecipesProvider;
import fr.alasdiablo.woolarmor.data.TagsProvider;
import fr.alasdiablo.woolarmor.init.WoolItems;
import fr.alasdiablo.woolarmor.item.WoolArmorBoots;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(Registries.MOD_ID)
public class WoolArmor {

    public static final Logger logger = LogManager.getLogger(Registries.MOD_ID);

    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab CREATIVE_TAB = new GroundCreativeModeTab("wool.armor") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(WoolItems.RED_WOOL_ARMOR.getChestplate());
        }
    };

    public WoolArmor() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        WoolItems.init(modBus);
        modBus.addListener(this::onCommonSetup);
        modBus.addListener(this::gatherData);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
    }

    private void gatherData(@NotNull GatherDataEvent event) {
        WoolArmor.logger.debug("Start data generator");
        final DataGenerator      generator          = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        WoolArmor.logger.debug("Add Item Model Provider");
        generator.addProvider(true, new ModelProvider(generator, existingFileHelper));

        WoolArmor.logger.debug("Add Tags Provider");
        generator.addProvider(true, new TagsProvider(generator, existingFileHelper));

        WoolArmor.logger.debug("Add Recipes Provider");
        generator.addProvider(true, new RecipesProvider(generator));
    }
}
