package fr.alasdiablo.woolarmor.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Arrays;

import static fr.alasdiablo.woolarmor.Registries.*;

public class ModelProvider extends ItemModelProvider {

    private static final ResourceLocation GENERATED = new ResourceLocation("item/generated");

    public ModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.registerItem(
                BLACK_WOOL_ARMOR.getHelmet(), BLACK_WOOL_ARMOR.getChestplate(), BLACK_WOOL_ARMOR.getLeggings(), BLACK_WOOL_ARMOR.getBoots(),
                BLUE_WOOL_ARMOR.getHelmet(), BLUE_WOOL_ARMOR.getChestplate(), BLUE_WOOL_ARMOR.getLeggings(), BLUE_WOOL_ARMOR.getBoots(),
                WHITE_WOOL_ARMOR.getHelmet(), WHITE_WOOL_ARMOR.getChestplate(), WHITE_WOOL_ARMOR.getLeggings(), WHITE_WOOL_ARMOR.getBoots(),
                BROWN_WOOL_ARMOR.getHelmet(), BROWN_WOOL_ARMOR.getChestplate(), BROWN_WOOL_ARMOR.getLeggings(), BROWN_WOOL_ARMOR.getBoots(),
                CYAN_WOOL_ARMOR.getHelmet(), CYAN_WOOL_ARMOR.getChestplate(), CYAN_WOOL_ARMOR.getLeggings(), CYAN_WOOL_ARMOR.getBoots(),
                GRAY_WOOL_ARMOR.getHelmet(), GRAY_WOOL_ARMOR.getChestplate(), GRAY_WOOL_ARMOR.getLeggings(), GRAY_WOOL_ARMOR.getBoots(),
                GREEN_WOOL_ARMOR.getHelmet(), GREEN_WOOL_ARMOR.getChestplate(), GREEN_WOOL_ARMOR.getLeggings(), GREEN_WOOL_ARMOR.getBoots(),
                LIGHT_BLUE_WOOL_ARMOR.getHelmet(), LIGHT_BLUE_WOOL_ARMOR.getChestplate(), LIGHT_BLUE_WOOL_ARMOR.getLeggings(), LIGHT_BLUE_WOOL_ARMOR.getBoots(),
                LIGHT_GRAY_WOOL_ARMOR.getHelmet(), LIGHT_GRAY_WOOL_ARMOR.getChestplate(), LIGHT_GRAY_WOOL_ARMOR.getLeggings(), LIGHT_GRAY_WOOL_ARMOR.getBoots(),
                LIME_WOOL_ARMOR.getHelmet(), LIME_WOOL_ARMOR.getChestplate(), LIME_WOOL_ARMOR.getLeggings(), LIME_WOOL_ARMOR.getBoots(),
                MAGENTA_WOOL_ARMOR.getHelmet(), MAGENTA_WOOL_ARMOR.getChestplate(), MAGENTA_WOOL_ARMOR.getLeggings(), MAGENTA_WOOL_ARMOR.getBoots(),
                ORANGE_WOOL_ARMOR.getHelmet(), ORANGE_WOOL_ARMOR.getChestplate(), ORANGE_WOOL_ARMOR.getLeggings(), ORANGE_WOOL_ARMOR.getBoots(),
                PINK_WOOL_ARMOR.getHelmet(), PINK_WOOL_ARMOR.getChestplate(), PINK_WOOL_ARMOR.getLeggings(), PINK_WOOL_ARMOR.getBoots(),
                PURPLE_WOOL_ARMOR.getHelmet(), PURPLE_WOOL_ARMOR.getChestplate(), PURPLE_WOOL_ARMOR.getLeggings(), PURPLE_WOOL_ARMOR.getBoots(),
                RED_WOOL_ARMOR.getHelmet(), RED_WOOL_ARMOR.getChestplate(), RED_WOOL_ARMOR.getLeggings(), RED_WOOL_ARMOR.getBoots(),
                YELLOW_WOOL_ARMOR.getHelmet(), YELLOW_WOOL_ARMOR.getChestplate(), YELLOW_WOOL_ARMOR.getLeggings(), YELLOW_WOOL_ARMOR.getBoots()
        );
    }

    private void registerItem(String... items) {
        Arrays.stream(items).forEach(item -> withExistingParent(item, GENERATED).texture("layer0", new ResourceLocation(MOD_ID, "item/" + item)));
    }
}
