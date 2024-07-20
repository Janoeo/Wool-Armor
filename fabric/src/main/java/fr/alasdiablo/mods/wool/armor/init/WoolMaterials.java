package fr.alasdiablo.mods.wool.armor.init;

import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import fr.alasdiablo.mods.wool.armor.item.CommonWoolArmorMaterials;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;

import static fr.alasdiablo.mods.wool.armor.Registries.*;

public class WoolMaterials {
    public static void init() {}

    public static final Holder<ArmorMaterial> BLACK_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(WoolArmorCommon.MOD_ID, BLACK_WOOL_ARMOR.name()),
            CommonWoolArmorMaterials.BLACK_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> BLUE_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    BLUE_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.BLUE_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> WHITE_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    WHITE_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.WHITE_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> BROWN_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    BROWN_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.BROWN_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> CYAN_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    CYAN_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.CYAN_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> GRAY_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    GRAY_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.GRAY_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> GREEN_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    GREEN_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.GREEN_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> LIGHT_BLUE_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    LIGHT_BLUE_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.LIGHT_BLUE_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> LIGHT_GRAY_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    LIGHT_GRAY_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.LIGHT_GRAY_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> LIME_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    LIME_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.LIME_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> MAGENTA_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    MAGENTA_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.MAGENTA_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> ORANGE_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    ORANGE_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.ORANGE_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> PINK_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    PINK_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.PINK_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> PURPLE_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    PURPLE_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.PURPLE_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> RED_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    RED_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.RED_WOOL_MATERIAL
    );

    public static final Holder<ArmorMaterial> YELLOW_WOOL_MATERIAL = Registry.registerForHolder(
            BuiltInRegistries.ARMOR_MATERIAL,
            ResourceLocation.fromNamespaceAndPath(
                    WoolArmorCommon.MOD_ID,
                    YELLOW_WOOL_ARMOR.name()
            ),
            CommonWoolArmorMaterials.YELLOW_WOOL_MATERIAL
    );
}
