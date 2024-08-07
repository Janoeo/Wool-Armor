package fr.alasdiablo.mods.wool.armor.data;

import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.Arrays;

import static fr.alasdiablo.mods.wool.armor.Registries.*;

public class ModelProvider extends ItemModelProvider {

    private static final ResourceLocation GENERATED = ResourceLocation.withDefaultNamespace("item/generated");

    public ModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WoolArmorCommon.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.registerItem(
                BLACK_WOOL_ARMOR.getHelmetName(),
                BLACK_WOOL_ARMOR.getChestplateName(),
                BLACK_WOOL_ARMOR.getLeggingsName(),
                BLACK_WOOL_ARMOR.getBootsName(),
                BLUE_WOOL_ARMOR.getHelmetName(),
                BLUE_WOOL_ARMOR.getChestplateName(),
                BLUE_WOOL_ARMOR.getLeggingsName(),
                BLUE_WOOL_ARMOR.getBootsName(),
                WHITE_WOOL_ARMOR.getHelmetName(),
                WHITE_WOOL_ARMOR.getChestplateName(),
                WHITE_WOOL_ARMOR.getLeggingsName(),
                WHITE_WOOL_ARMOR.getBootsName(),
                BROWN_WOOL_ARMOR.getHelmetName(),
                BROWN_WOOL_ARMOR.getChestplateName(),
                BROWN_WOOL_ARMOR.getLeggingsName(),
                BROWN_WOOL_ARMOR.getBootsName(),
                CYAN_WOOL_ARMOR.getHelmetName(),
                CYAN_WOOL_ARMOR.getChestplateName(),
                CYAN_WOOL_ARMOR.getLeggingsName(),
                CYAN_WOOL_ARMOR.getBootsName(),
                GRAY_WOOL_ARMOR.getHelmetName(),
                GRAY_WOOL_ARMOR.getChestplateName(),
                GRAY_WOOL_ARMOR.getLeggingsName(),
                GRAY_WOOL_ARMOR.getBootsName(),
                GREEN_WOOL_ARMOR.getHelmetName(),
                GREEN_WOOL_ARMOR.getChestplateName(),
                GREEN_WOOL_ARMOR.getLeggingsName(),
                GREEN_WOOL_ARMOR.getBootsName(),
                LIGHT_BLUE_WOOL_ARMOR.getHelmetName(),
                LIGHT_BLUE_WOOL_ARMOR.getChestplateName(),
                LIGHT_BLUE_WOOL_ARMOR.getLeggingsName(),
                LIGHT_BLUE_WOOL_ARMOR.getBootsName(),
                LIGHT_GRAY_WOOL_ARMOR.getHelmetName(),
                LIGHT_GRAY_WOOL_ARMOR.getChestplateName(),
                LIGHT_GRAY_WOOL_ARMOR.getLeggingsName(),
                LIGHT_GRAY_WOOL_ARMOR.getBootsName(),
                LIME_WOOL_ARMOR.getHelmetName(),
                LIME_WOOL_ARMOR.getChestplateName(),
                LIME_WOOL_ARMOR.getLeggingsName(),
                LIME_WOOL_ARMOR.getBootsName(),
                MAGENTA_WOOL_ARMOR.getHelmetName(),
                MAGENTA_WOOL_ARMOR.getChestplateName(),
                MAGENTA_WOOL_ARMOR.getLeggingsName(),
                MAGENTA_WOOL_ARMOR.getBootsName(),
                ORANGE_WOOL_ARMOR.getHelmetName(),
                ORANGE_WOOL_ARMOR.getChestplateName(),
                ORANGE_WOOL_ARMOR.getLeggingsName(),
                ORANGE_WOOL_ARMOR.getBootsName(),
                PINK_WOOL_ARMOR.getHelmetName(),
                PINK_WOOL_ARMOR.getChestplateName(),
                PINK_WOOL_ARMOR.getLeggingsName(),
                PINK_WOOL_ARMOR.getBootsName(),
                PURPLE_WOOL_ARMOR.getHelmetName(),
                PURPLE_WOOL_ARMOR.getChestplateName(),
                PURPLE_WOOL_ARMOR.getLeggingsName(),
                PURPLE_WOOL_ARMOR.getBootsName(),
                RED_WOOL_ARMOR.getHelmetName(),
                RED_WOOL_ARMOR.getChestplateName(),
                RED_WOOL_ARMOR.getLeggingsName(),
                RED_WOOL_ARMOR.getBootsName(),
                YELLOW_WOOL_ARMOR.getHelmetName(),
                YELLOW_WOOL_ARMOR.getChestplateName(),
                YELLOW_WOOL_ARMOR.getLeggingsName(),
                YELLOW_WOOL_ARMOR.getBootsName()
        );
    }

    private void registerItem(String... items) {
        Arrays.stream(items).forEach(
                item -> withExistingParent(item, GENERATED)
                        .texture("layer0", ResourceLocation.fromNamespaceAndPath(WoolArmorCommon.MOD_ID, "item/" + item))
        );
    }
}
