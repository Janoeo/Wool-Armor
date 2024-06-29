package fr.alasdiablo.mods.wool.armor;

import fr.alasdiablo.mods.wool.armor.data.ItemsTagsProvider;
import fr.alasdiablo.mods.wool.armor.data.ModelProvider;
import fr.alasdiablo.mods.wool.armor.data.RecipesProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public class WoolArmorFabricDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(@NotNull FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(ModelProvider::new);
        pack.addProvider(RecipesProvider::new);
        pack.addProvider(ItemsTagsProvider::new);
    }

}
