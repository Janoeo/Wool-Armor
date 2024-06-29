package fr.alasdiablo.mods.wool.armor.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;

import java.util.Arrays;

import static fr.alasdiablo.mods.wool.armor.init.WoolItems.*;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {}

    @Override
    public void generateItemModels(ItemModelGenerators generators) {
        this.registerItem(
                generators,
                BLACK_WOOL_ARMOR.getHelmet(),
                BLACK_WOOL_ARMOR.getChestplate(),
                BLACK_WOOL_ARMOR.getLeggings(),
                BLACK_WOOL_ARMOR.getBoots(),
                BLUE_WOOL_ARMOR.getHelmet(),
                BLUE_WOOL_ARMOR.getChestplate(),
                BLUE_WOOL_ARMOR.getLeggings(),
                BLUE_WOOL_ARMOR.getBoots(),
                WHITE_WOOL_ARMOR.getHelmet(),
                WHITE_WOOL_ARMOR.getChestplate(),
                WHITE_WOOL_ARMOR.getLeggings(),
                WHITE_WOOL_ARMOR.getBoots(),
                BROWN_WOOL_ARMOR.getHelmet(),
                BROWN_WOOL_ARMOR.getChestplate(),
                BROWN_WOOL_ARMOR.getLeggings(),
                BROWN_WOOL_ARMOR.getBoots(),
                CYAN_WOOL_ARMOR.getHelmet(),
                CYAN_WOOL_ARMOR.getChestplate(),
                CYAN_WOOL_ARMOR.getLeggings(),
                CYAN_WOOL_ARMOR.getBoots(),
                GRAY_WOOL_ARMOR.getHelmet(),
                GRAY_WOOL_ARMOR.getChestplate(),
                GRAY_WOOL_ARMOR.getLeggings(),
                GRAY_WOOL_ARMOR.getBoots(),
                GREEN_WOOL_ARMOR.getHelmet(),
                GREEN_WOOL_ARMOR.getChestplate(),
                GREEN_WOOL_ARMOR.getLeggings(),
                GREEN_WOOL_ARMOR.getBoots(),
                LIGHT_BLUE_WOOL_ARMOR.getHelmet(),
                LIGHT_BLUE_WOOL_ARMOR.getChestplate(),
                LIGHT_BLUE_WOOL_ARMOR.getLeggings(),
                LIGHT_BLUE_WOOL_ARMOR.getBoots(),
                LIGHT_GRAY_WOOL_ARMOR.getHelmet(),
                LIGHT_GRAY_WOOL_ARMOR.getChestplate(),
                LIGHT_GRAY_WOOL_ARMOR.getLeggings(),
                LIGHT_GRAY_WOOL_ARMOR.getBoots(),
                LIME_WOOL_ARMOR.getHelmet(),
                LIME_WOOL_ARMOR.getChestplate(),
                LIME_WOOL_ARMOR.getLeggings(),
                LIME_WOOL_ARMOR.getBoots(),
                MAGENTA_WOOL_ARMOR.getHelmet(),
                MAGENTA_WOOL_ARMOR.getChestplate(),
                MAGENTA_WOOL_ARMOR.getLeggings(),
                MAGENTA_WOOL_ARMOR.getBoots(),
                ORANGE_WOOL_ARMOR.getHelmet(),
                ORANGE_WOOL_ARMOR.getChestplate(),
                ORANGE_WOOL_ARMOR.getLeggings(),
                ORANGE_WOOL_ARMOR.getBoots(),
                PINK_WOOL_ARMOR.getHelmet(),
                PINK_WOOL_ARMOR.getChestplate(),
                PINK_WOOL_ARMOR.getLeggings(),
                PINK_WOOL_ARMOR.getBoots(),
                PURPLE_WOOL_ARMOR.getHelmet(),
                PURPLE_WOOL_ARMOR.getChestplate(),
                PURPLE_WOOL_ARMOR.getLeggings(),
                PURPLE_WOOL_ARMOR.getBoots(),
                RED_WOOL_ARMOR.getHelmet(),
                RED_WOOL_ARMOR.getChestplate(),
                RED_WOOL_ARMOR.getLeggings(),
                RED_WOOL_ARMOR.getBoots(),
                YELLOW_WOOL_ARMOR.getHelmet(),
                YELLOW_WOOL_ARMOR.getChestplate(),
                YELLOW_WOOL_ARMOR.getLeggings(),
                YELLOW_WOOL_ARMOR.getBoots()
        );
    }

    private void registerItem(ItemModelGenerators generators, Item... items) {
        Arrays.stream(items).forEach(item -> generators.generateFlatItem(item, ModelTemplates.FLAT_ITEM));
    }
}
