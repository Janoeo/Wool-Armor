package fr.alasdiablo.woolarmor.init;

import fr.alasdiablo.diolib.registries.RegistryHelper;
import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.WoolArmor;
import fr.alasdiablo.woolarmor.item.WoolArmorBoots;
import fr.alasdiablo.woolarmor.item.WoolMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class WoolItems {

    public static final WoolArmorItem BLACK_WOOL_ARMOR      = of(Registries.BLACK_WOOL_ARMOR, WoolMaterials.BLACK_WOOL_MATERIAL);
    public static final WoolArmorItem BLUE_WOOL_ARMOR       = of(Registries.BLUE_WOOL_ARMOR, WoolMaterials.BLUE_WOOL_MATERIAL);
    public static final WoolArmorItem WHITE_WOOL_ARMOR      = of(Registries.WHITE_WOOL_ARMOR, WoolMaterials.WHITE_WOOL_MATERIAL);
    public static final WoolArmorItem BROWN_WOOL_ARMOR      = of(Registries.BROWN_WOOL_ARMOR, WoolMaterials.BROWN_WOOL_MATERIAL);
    public static final WoolArmorItem CYAN_WOOL_ARMOR       = of(Registries.CYAN_WOOL_ARMOR, WoolMaterials.CYAN_WOOL_MATERIAL);
    public static final WoolArmorItem GRAY_WOOL_ARMOR       = of(Registries.GRAY_WOOL_ARMOR, WoolMaterials.GRAY_WOOL_MATERIAL);
    public static final WoolArmorItem GREEN_WOOL_ARMOR      = of(Registries.GREEN_WOOL_ARMOR, WoolMaterials.GREEN_WOOL_MATERIAL);
    public static final WoolArmorItem LIGHT_BLUE_WOOL_ARMOR = of(Registries.LIGHT_BLUE_WOOL_ARMOR, WoolMaterials.LIGHT_BLUE_WOOL_MATERIAL);
    public static final WoolArmorItem LIGHT_GRAY_WOOL_ARMOR = of(Registries.LIGHT_GRAY_WOOL_ARMOR, WoolMaterials.LIGHT_GRAY_WOOL_MATERIAL);
    public static final WoolArmorItem LIME_WOOL_ARMOR       = of(Registries.LIME_WOOL_ARMOR, WoolMaterials.LIME_WOOL_MATERIAL);
    public static final WoolArmorItem MAGENTA_WOOL_ARMOR    = of(Registries.MAGENTA_WOOL_ARMOR, WoolMaterials.MAGENTA_WOOL_MATERIAL);
    public static final WoolArmorItem ORANGE_WOOL_ARMOR     = of(Registries.ORANGE_WOOL_ARMOR, WoolMaterials.ORANGE_WOOL_MATERIAL);
    public static final WoolArmorItem PINK_WOOL_ARMOR       = of(Registries.PINK_WOOL_ARMOR, WoolMaterials.PINK_WOOL_MATERIAL);
    public static final WoolArmorItem PURPLE_WOOL_ARMOR     = of(Registries.PURPLE_WOOL_ARMOR, WoolMaterials.PURPLE_WOOL_MATERIAL);
    public static final WoolArmorItem RED_WOOL_ARMOR        = of(Registries.RED_WOOL_ARMOR, WoolMaterials.RED_WOOL_MATERIAL);
    public static final WoolArmorItem YELLOW_WOOL_ARMOR     = of(Registries.YELLOW_WOOL_ARMOR, WoolMaterials.YELLOW_WOOL_MATERIAL);

    public static void init(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        RegistryHelper.registerItem(
                registry, BLACK_WOOL_ARMOR.getHelmet(), BLACK_WOOL_ARMOR.getChestplate(), BLACK_WOOL_ARMOR.getLeggings(), BLACK_WOOL_ARMOR.getBoots(),
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

    private static WoolArmorItem of(Registries.WoolArmorRegistriesName name, ArmorMaterial material) {
        return new WoolArmorItem(name, material);
    }

    public static class WoolArmorItem {
        private final Item helmet;
        private final Item chestplate;
        private final Item leggings;
        private final Item boots;

        public WoolArmorItem(Registries.WoolArmorRegistriesName name, ArmorMaterial material) {
            this.helmet     = new ArmorItem(material, EquipmentSlot.HEAD, new Item.Properties().tab(WoolArmor.CREATIVE_TAB));
            this.chestplate = new ArmorItem(material, EquipmentSlot.CHEST, new Item.Properties().tab(WoolArmor.CREATIVE_TAB));
            this.leggings   = new ArmorItem(material, EquipmentSlot.LEGS, new Item.Properties().tab(WoolArmor.CREATIVE_TAB));
            this.boots      = new WoolArmorBoots(material, EquipmentSlot.FEET, new Item.Properties().tab(WoolArmor.CREATIVE_TAB));

            this.helmet.setRegistryName(RegistryHelper.rl(Registries.MOD_ID, name.getHelmet()));
            this.chestplate.setRegistryName(RegistryHelper.rl(Registries.MOD_ID, name.getChestplate()));
            this.leggings.setRegistryName(RegistryHelper.rl(Registries.MOD_ID, name.getLeggings()));
            this.boots.setRegistryName(RegistryHelper.rl(Registries.MOD_ID, name.getBoots()));
        }

        public Item getHelmet() {
            return this.helmet;
        }

        public Item getChestplate() {
            return this.chestplate;
        }

        public Item getLeggings() {
            return this.leggings;
        }

        public Item getBoots() {
            return this.boots;
        }
    }
}
