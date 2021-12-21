package fr.alasdiablo.woolarmor;

import fr.alasdiablo.diolib.item.GroundCreativeModeTab;
import fr.alasdiablo.woolarmor.data.ModelProvider;
import fr.alasdiablo.woolarmor.data.RecipesProvider;
import fr.alasdiablo.woolarmor.data.TagsProvider;
import fr.alasdiablo.woolarmor.data.language.EnglishProvider;
import fr.alasdiablo.woolarmor.data.language.FrenchProvider;
import fr.alasdiablo.woolarmor.data.language.SpanishProvider;
import fr.alasdiablo.woolarmor.init.WoolItems;
import fr.alasdiablo.woolarmor.item.WoolArmorBoots;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        modBus.addListener(this::onCommonSetup);
        modBus.addListener(this::gatherData);
        modBus.addGenericListener(Item.class, WoolItems::init);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.addListener(WoolArmorBoots::onLivingFall);
    }

    private void gatherData(GatherDataEvent event) {
        WoolArmor.logger.debug("Start data generator");
        final DataGenerator      generator          = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        WoolArmor.logger.debug("Add Item Model Provider");
        generator.addProvider(new ModelProvider(generator, existingFileHelper));

        WoolArmor.logger.debug("Add Language Provider");
        generator.addProvider(new EnglishProvider(generator));
        generator.addProvider(new FrenchProvider(generator));
        generator.addProvider(new SpanishProvider(generator));

        WoolArmor.logger.debug("Add Tags Provider");
        generator.addProvider(new TagsProvider(generator, existingFileHelper));

        WoolArmor.logger.debug("Add Recipes Provider");
        generator.addProvider(new RecipesProvider(generator));
    }
}
