package fr.alasdiablo.mods.wool.armor.init;

import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

public class WoolTags {
    public static final TagKey<Item> FALL_DAMAGE_REDUCERS = fallDamageReducers();

    private static @NotNull TagKey<Item> fallDamageReducers() {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(WoolArmorCommon.MOD_ID, "fall_damage_reducers"));
    }
}
