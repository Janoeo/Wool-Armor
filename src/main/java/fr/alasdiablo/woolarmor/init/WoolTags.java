package fr.alasdiablo.woolarmor.init;

import fr.alasdiablo.woolarmor.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class WoolTags {
    public static final Tags.IOptionalNamedTag<Item> FALL_DAMAGE_REDUCERS = fallDamageReducers();

    private static Tags.IOptionalNamedTag<Item> fallDamageReducers() {
        return ItemTags.createOptional(new ResourceLocation(Registries.MOD_ID, "fall_damage_reducers"));
    }
}
