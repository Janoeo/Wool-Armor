package fr.alasdiablo.woolarmor.data;

import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.init.WoolTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static fr.alasdiablo.woolarmor.init.WoolItems.*;

public class TagsProvider extends ItemTagsProvider {
    public TagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, new BlockTagsProvider(generator, Registries.MOD_ID, existingFileHelper), Registries.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.tag(WoolTags.FALL_DAMAGE_REDUCERS).add(
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
        );
    }
}
