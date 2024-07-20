package fr.alasdiablo.mods.wool.armor.item;

import fr.alasdiablo.mods.wool.armor.Registries;
import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import static fr.alasdiablo.mods.wool.armor.Registries.*;

public class CommonWoolArmorMaterials {

    private static final Map<ArmorItem.Type, Integer> DEFENSE              = Util.make(new EnumMap<>(ArmorItem.Type.class), builder -> {
        builder.put(ArmorItem.Type.BOOTS, 1);
        builder.put(ArmorItem.Type.LEGGINGS, 2);
        builder.put(ArmorItem.Type.CHESTPLATE, 3);
        builder.put(ArmorItem.Type.HELMET, 1);
        builder.put(ArmorItem.Type.BODY, 4);
    });
    private static final int                          ENCHANTMENT          = 10;
    private static final Holder<SoundEvent>           SOUND                = SoundEvents.ARMOR_EQUIP_LEATHER;
    private static final Supplier<Ingredient>         REPAIR_INGREDIENT    = () -> Ingredient.of(Registries.WOOLS_LIST);
    private static final float                        TOUGHNESS            = 0f;
    private static final float                        KNOCKBACK_RESISTANCE = 0f;

    private static final int[]      DURABILITY_FACTOR = new int[]{ 13, 15, 16, 11 };

    public static final ArmorMaterial BLACK_WOOL_MATERIAL      = create(BLACK_WOOL_ARMOR.name());
    public static final ArmorMaterial BLUE_WOOL_MATERIAL       = create(BLUE_WOOL_ARMOR.name());
    public static final ArmorMaterial WHITE_WOOL_MATERIAL      = create(WHITE_WOOL_ARMOR.name());
    public static final ArmorMaterial BROWN_WOOL_MATERIAL      = create(BROWN_WOOL_ARMOR.name());
    public static final ArmorMaterial CYAN_WOOL_MATERIAL       = create(CYAN_WOOL_ARMOR.name());
    public static final ArmorMaterial GRAY_WOOL_MATERIAL       = create(GRAY_WOOL_ARMOR.name());
    public static final ArmorMaterial GREEN_WOOL_MATERIAL      = create(GREEN_WOOL_ARMOR.name());
    public static final ArmorMaterial LIGHT_BLUE_WOOL_MATERIAL = create(LIGHT_BLUE_WOOL_ARMOR.name());
    public static final ArmorMaterial LIGHT_GRAY_WOOL_MATERIAL = create(LIGHT_GRAY_WOOL_ARMOR.name());
    public static final ArmorMaterial LIME_WOOL_MATERIAL       = create(LIME_WOOL_ARMOR.name());
    public static final ArmorMaterial MAGENTA_WOOL_MATERIAL    = create(MAGENTA_WOOL_ARMOR.name());
    public static final ArmorMaterial ORANGE_WOOL_MATERIAL     = create(ORANGE_WOOL_ARMOR.name());
    public static final ArmorMaterial PINK_WOOL_MATERIAL       = create(PINK_WOOL_ARMOR.name());
    public static final ArmorMaterial PURPLE_WOOL_MATERIAL     = create(PURPLE_WOOL_ARMOR.name());
    public static final ArmorMaterial RED_WOOL_MATERIAL        = create(RED_WOOL_ARMOR.name());
    public static final ArmorMaterial YELLOW_WOOL_MATERIAL     = create(YELLOW_WOOL_ARMOR.name());

    @Contract(pure = true)
    public static int getHelmetDurabilityFactor() {
        return DURABILITY_FACTOR[0];
    }

    public static int getChestplateDurabilityFactor() {
        return DURABILITY_FACTOR[1];
    }

    public static int getLeggingsDurabilityFactor() {
        return DURABILITY_FACTOR[2];
    }

    public static int getBootsDurabilityFactor() {
        return DURABILITY_FACTOR[3];
    }

    private static @NotNull ArmorMaterial create(String name) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(
                        ResourceLocation.fromNamespaceAndPath(WoolArmorCommon.MOD_ID, name)
                )
        );

        return new ArmorMaterial(
                DEFENSE, ENCHANTMENT, SOUND, REPAIR_INGREDIENT, layers, TOUGHNESS, KNOCKBACK_RESISTANCE
        );
    }
}
