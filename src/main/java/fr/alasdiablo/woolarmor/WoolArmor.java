package fr.alasdiablo.woolarmor;

import fr.alasdiablo.woolarmor.utils.Registries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * main class of the mod
 */
@Mod(Registries.MOD_ID)
public class WoolArmor {

    /**
     * mod constructor
     */
    public WoolArmor() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}
