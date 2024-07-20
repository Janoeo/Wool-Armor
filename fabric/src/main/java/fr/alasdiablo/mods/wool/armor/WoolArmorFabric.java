package fr.alasdiablo.mods.wool.armor;

import fr.alasdiablo.mods.wool.armor.init.WoolCreativeTabs;
import fr.alasdiablo.mods.wool.armor.init.WoolItems;
import fr.alasdiablo.mods.wool.armor.init.WoolMaterials;
import net.fabricmc.api.ModInitializer;

public class WoolArmorFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        WoolArmorCommon.init();

        WoolMaterials.init();
        WoolItems.init();
        WoolCreativeTabs.init();
    }
}
