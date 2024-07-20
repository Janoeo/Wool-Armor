package fr.alasdiablo.mods.wool.armor.init;

import fr.alasdiablo.mods.wool.armor.WoolArmorCommon;
import fr.alasdiablo.mods.wool.armor.item.CommonWoolArmorMaterials;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static fr.alasdiablo.mods.wool.armor.Registries.*;

public class WoolMaterials {
    private static final DeferredRegister<ArmorMaterial> ARMOR_MATERIAL = DeferredRegister.create(Registries.ARMOR_MATERIAL, WoolArmorCommon.MOD_ID);

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BLACK_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            BLACK_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.BLACK_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BLUE_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            BLUE_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.BLUE_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> WHITE_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            WHITE_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.WHITE_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> BROWN_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            BROWN_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.BROWN_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CYAN_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            CYAN_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.CYAN_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GRAY_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            GRAY_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.GRAY_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GREEN_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            GREEN_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.GREEN_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LIGHT_BLUE_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            LIGHT_BLUE_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.LIGHT_BLUE_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LIGHT_GRAY_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            LIGHT_GRAY_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.LIGHT_GRAY_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> LIME_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            LIME_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.LIME_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MAGENTA_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            MAGENTA_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.MAGENTA_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> ORANGE_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            ORANGE_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.ORANGE_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PINK_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            PINK_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.PINK_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PURPLE_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            PURPLE_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.PURPLE_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> RED_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            RED_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.RED_WOOL_MATERIAL
    );

    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> YELLOW_WOOL_MATERIAL = ARMOR_MATERIAL.register(
            YELLOW_WOOL_ARMOR.name(),
            () -> CommonWoolArmorMaterials.YELLOW_WOOL_MATERIAL
    );

    public static void init(IEventBus bus) {
        ARMOR_MATERIAL.register(bus);
    }
}
