package fr.alasdiablo.woolarmor;

import fr.alasdiablo.woolarmor.data.WoolItemModelProvider;
import fr.alasdiablo.woolarmor.init.WoolItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Registries.MOD_ID)
public class WoolArmor {

    public static final Logger logger = LogManager.getLogger(Registries.MOD_ID);

    public WoolArmor() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        modBus.addListener(this::gatherData);
        modBus.addGenericListener(Item.class, WoolItems::init);
    }

    private void gatherData(GatherDataEvent event) {
        WoolArmor.logger.debug("Start data generator");
        final DataGenerator      generator          = event.getGenerator();
        final ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        WoolArmor.logger.debug("Add Item Model Provider");
        generator.addProvider(new WoolItemModelProvider(generator, existingFileHelper));

//        WoolArmor.logger.debug("Add Language Provider");
//        generator.addProvider(new EnglishProvider(generator));
//        generator.addProvider(new FrenchProvider(generator));
//
//        WoolArmor.logger.debug("Add Recipes Provider");
//        generator.addProvider(new FoundationRecipeProvider(generator));
    }
}
