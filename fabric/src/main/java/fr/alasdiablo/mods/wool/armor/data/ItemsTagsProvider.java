package fr.alasdiablo.mods.wool.armor.data;

import fr.alasdiablo.mods.wool.armor.init.WoolTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static fr.alasdiablo.mods.wool.armor.init.WoolItems.*;

public class ItemsTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ItemsTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        Item[] helmet = new Item[]{
                BLACK_WOOL_ARMOR.getHelmet(),
                BLUE_WOOL_ARMOR.getHelmet(),
                WHITE_WOOL_ARMOR.getHelmet(),
                BROWN_WOOL_ARMOR.getHelmet(),
                CYAN_WOOL_ARMOR.getHelmet(),
                GRAY_WOOL_ARMOR.getHelmet(),
                GREEN_WOOL_ARMOR.getHelmet(),
                LIGHT_BLUE_WOOL_ARMOR.getHelmet(),
                LIGHT_GRAY_WOOL_ARMOR.getHelmet(),
                LIME_WOOL_ARMOR.getHelmet(),
                MAGENTA_WOOL_ARMOR.getHelmet(),
                ORANGE_WOOL_ARMOR.getHelmet(),
                PINK_WOOL_ARMOR.getHelmet(),
                PURPLE_WOOL_ARMOR.getHelmet(),
                RED_WOOL_ARMOR.getHelmet(),
                YELLOW_WOOL_ARMOR.getHelmet()
        };

        Item[] chestplate = new Item[]{
                BLACK_WOOL_ARMOR.getChestplate(),
                BLUE_WOOL_ARMOR.getChestplate(),
                WHITE_WOOL_ARMOR.getChestplate(),
                BROWN_WOOL_ARMOR.getChestplate(),
                CYAN_WOOL_ARMOR.getChestplate(),
                GRAY_WOOL_ARMOR.getChestplate(),
                GREEN_WOOL_ARMOR.getChestplate(),
                LIGHT_BLUE_WOOL_ARMOR.getChestplate(),
                LIGHT_GRAY_WOOL_ARMOR.getChestplate(),
                LIME_WOOL_ARMOR.getChestplate(),
                MAGENTA_WOOL_ARMOR.getChestplate(),
                ORANGE_WOOL_ARMOR.getChestplate(),
                PINK_WOOL_ARMOR.getChestplate(),
                PURPLE_WOOL_ARMOR.getChestplate(),
                RED_WOOL_ARMOR.getChestplate(),
                YELLOW_WOOL_ARMOR.getChestplate()
        };

        Item[] leggings = new Item[]{
                BLACK_WOOL_ARMOR.getLeggings(),
                BLUE_WOOL_ARMOR.getLeggings(),
                WHITE_WOOL_ARMOR.getLeggings(),
                BROWN_WOOL_ARMOR.getLeggings(),
                CYAN_WOOL_ARMOR.getLeggings(),
                GRAY_WOOL_ARMOR.getLeggings(),
                GREEN_WOOL_ARMOR.getLeggings(),
                LIGHT_BLUE_WOOL_ARMOR.getLeggings(),
                LIGHT_GRAY_WOOL_ARMOR.getLeggings(),
                LIME_WOOL_ARMOR.getLeggings(),
                MAGENTA_WOOL_ARMOR.getLeggings(),
                ORANGE_WOOL_ARMOR.getLeggings(),
                PINK_WOOL_ARMOR.getLeggings(),
                PURPLE_WOOL_ARMOR.getLeggings(),
                RED_WOOL_ARMOR.getLeggings(),
                YELLOW_WOOL_ARMOR.getLeggings()
        };

        Item[] boots = new Item[]{
                BLACK_WOOL_ARMOR.getBoots(),
                BLUE_WOOL_ARMOR.getBoots(),
                WHITE_WOOL_ARMOR.getBoots(),
                BROWN_WOOL_ARMOR.getBoots(),
                CYAN_WOOL_ARMOR.getBoots(),
                GRAY_WOOL_ARMOR.getBoots(),
                GREEN_WOOL_ARMOR.getBoots(),
                LIGHT_BLUE_WOOL_ARMOR.getBoots(),
                LIGHT_GRAY_WOOL_ARMOR.getBoots(),
                LIME_WOOL_ARMOR.getBoots(),
                MAGENTA_WOOL_ARMOR.getBoots(),
                ORANGE_WOOL_ARMOR.getBoots(),
                PINK_WOOL_ARMOR.getBoots(),
                PURPLE_WOOL_ARMOR.getBoots(),
                RED_WOOL_ARMOR.getBoots(),
                YELLOW_WOOL_ARMOR.getBoots()
        };

        this.getOrCreateTagBuilder(WoolTags.FALL_DAMAGE_REDUCERS).add(boots);

        this.getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES).add(helmet);
        this.getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES).add(chestplate);
        this.getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES).add(leggings);
        this.getOrCreateTagBuilder(ItemTags.FREEZE_IMMUNE_WEARABLES).add(boots);
    }
}
