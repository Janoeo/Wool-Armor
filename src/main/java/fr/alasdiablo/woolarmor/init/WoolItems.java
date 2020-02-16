package fr.alasdiablo.woolarmor.init;

import fr.alasdiablo.woolarmor.materials.ArmorsMaterials;
import fr.alasdiablo.woolarmor.utils.Registries;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

/**
 * class use for handle all block
 */
@SuppressWarnings("unused")
public class WoolItems {

    /**
     * Items declaration
     */
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_HELMET)
    public static Item RED_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_CHESTPLATE)
    public static Item RED_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_LEGGINGS)
    public static Item RED_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.RED_WOOL_BOOTS)
    public static Item RED_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_HELMET)
    public static Item WHITE_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_CHESTPLATE)
    public static Item WHITE_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_LEGGINGS)
    public static Item WHITE_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.WHITE_WOOL_BOOTS)
    public static Item WHITE_WOOL_BOOTS;

    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_HELMET)
    public static Item YELLOW_WOOL_HELMET;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_CHESTPLATE)
    public static Item YELLOW_WOOL_CHESTPLATE;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_LEGGINGS)
    public static Item YELLOW_WOOL_LEGGINGS;
    @ObjectHolder(Registries.MOD_ID + ":" + Registries.YELLOW_WOOL_BOOTS)
    public static Item YELLOW_WOOL_BOOTS;

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        /**
         * items register
         * @param event registry event from forge
         */
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties().group(ItemGroup.COMBAT);
            IForgeRegistry<Item> e = event.getRegistry();

            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.HEAD, properties).setRegistryName(Registries.RED_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.CHEST, properties).setRegistryName(Registries.RED_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.LEGS, properties).setRegistryName(Registries.RED_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.RED_WOOL_ARMOR, EquipmentSlotType.FEET, properties).setRegistryName(Registries.RED_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.HEAD, properties).setRegistryName(Registries.WHITE_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.CHEST, properties).setRegistryName(Registries.WHITE_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.LEGS, properties).setRegistryName(Registries.WHITE_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.WHITE_WOOL_ARMOR, EquipmentSlotType.FEET, properties).setRegistryName(Registries.WHITE_WOOL_BOOTS));

            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.HEAD, properties).setRegistryName(Registries.YELLOW_WOOL_HELMET));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.CHEST, properties).setRegistryName(Registries.YELLOW_WOOL_CHESTPLATE));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.LEGS, properties).setRegistryName(Registries.YELLOW_WOOL_LEGGINGS));
            e.register(new ArmorItem(ArmorsMaterials.YELLOW_WOOL_ARMOR, EquipmentSlotType.FEET, properties).setRegistryName(Registries.YELLOW_WOOL_BOOTS));
        }
    }
}
