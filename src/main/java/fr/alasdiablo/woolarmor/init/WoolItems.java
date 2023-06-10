package fr.alasdiablo.woolarmor.init;

import fr.alasdiablo.diolib.api.item.armor.ArmorItemRegistryName;
import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.WoolArmor;
import fr.alasdiablo.woolarmor.item.WoolArmorBoots;
import fr.alasdiablo.woolarmor.item.WoolMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WoolItems {
    static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WoolArmor.MOD_ID);

    public static final WoolArmorSet BLACK_WOOL_ARMOR;
    public static final WoolArmorSet BLUE_WOOL_ARMOR;
    public static final WoolArmorSet WHITE_WOOL_ARMOR;
    public static final WoolArmorSet BROWN_WOOL_ARMOR;
    public static final WoolArmorSet CYAN_WOOL_ARMOR;
    public static final WoolArmorSet GRAY_WOOL_ARMOR;
    public static final WoolArmorSet GREEN_WOOL_ARMOR;
    public static final WoolArmorSet LIGHT_BLUE_WOOL_ARMOR;
    public static final WoolArmorSet LIGHT_GRAY_WOOL_ARMOR;
    public static final WoolArmorSet LIME_WOOL_ARMOR;
    public static final WoolArmorSet MAGENTA_WOOL_ARMOR;
    public static final WoolArmorSet ORANGE_WOOL_ARMOR;
    public static final WoolArmorSet PINK_WOOL_ARMOR;
    public static final WoolArmorSet PURPLE_WOOL_ARMOR;
    public static final WoolArmorSet RED_WOOL_ARMOR;
    public static final WoolArmorSet YELLOW_WOOL_ARMOR;

    static {
        BLACK_WOOL_ARMOR      = of(Registries.BLACK_WOOL_ARMOR, WoolMaterials.BLACK_WOOL_MATERIAL);
        BLUE_WOOL_ARMOR       = of(Registries.BLUE_WOOL_ARMOR, WoolMaterials.BLUE_WOOL_MATERIAL);
        WHITE_WOOL_ARMOR      = of(Registries.WHITE_WOOL_ARMOR, WoolMaterials.WHITE_WOOL_MATERIAL);
        BROWN_WOOL_ARMOR      = of(Registries.BROWN_WOOL_ARMOR, WoolMaterials.BROWN_WOOL_MATERIAL);
        CYAN_WOOL_ARMOR       = of(Registries.CYAN_WOOL_ARMOR, WoolMaterials.CYAN_WOOL_MATERIAL);
        GRAY_WOOL_ARMOR       = of(Registries.GRAY_WOOL_ARMOR, WoolMaterials.GRAY_WOOL_MATERIAL);
        GREEN_WOOL_ARMOR      = of(Registries.GREEN_WOOL_ARMOR, WoolMaterials.GREEN_WOOL_MATERIAL);
        LIGHT_BLUE_WOOL_ARMOR = of(Registries.LIGHT_BLUE_WOOL_ARMOR, WoolMaterials.LIGHT_BLUE_WOOL_MATERIAL);
        LIGHT_GRAY_WOOL_ARMOR = of(Registries.LIGHT_GRAY_WOOL_ARMOR, WoolMaterials.LIGHT_GRAY_WOOL_MATERIAL);
        LIME_WOOL_ARMOR       = of(Registries.LIME_WOOL_ARMOR, WoolMaterials.LIME_WOOL_MATERIAL);
        MAGENTA_WOOL_ARMOR    = of(Registries.MAGENTA_WOOL_ARMOR, WoolMaterials.MAGENTA_WOOL_MATERIAL);
        ORANGE_WOOL_ARMOR     = of(Registries.ORANGE_WOOL_ARMOR, WoolMaterials.ORANGE_WOOL_MATERIAL);
        PINK_WOOL_ARMOR       = of(Registries.PINK_WOOL_ARMOR, WoolMaterials.PINK_WOOL_MATERIAL);
        PURPLE_WOOL_ARMOR     = of(Registries.PURPLE_WOOL_ARMOR, WoolMaterials.PURPLE_WOOL_MATERIAL);
        RED_WOOL_ARMOR        = of(Registries.RED_WOOL_ARMOR, WoolMaterials.RED_WOOL_MATERIAL);
        YELLOW_WOOL_ARMOR     = of(Registries.YELLOW_WOOL_ARMOR, WoolMaterials.YELLOW_WOOL_MATERIAL);
    }

    @Contract("_, _ -> new")
    private static @NotNull WoolArmorSet of(ArmorItemRegistryName name, ArmorMaterial material) {
        return new WoolArmorSet(name, material, new Item.Properties(), ITEMS);
    }

    public static class WoolArmorSet {
        private final RegistryObject<Item> helmetRegistryObject;
        private final RegistryObject<Item> chestplateRegistryObject;
        private final RegistryObject<Item> leggingsRegistryObject;
        private final RegistryObject<Item> bootsRegistryObject;

        public WoolArmorSet(
                @NotNull ArmorItemRegistryName registryName, @NotNull ArmorMaterial material, Item.@NotNull Properties properties,
                @NotNull DeferredRegister<Item> register
        ) {
            this.helmetRegistryObject     = register.register(registryName.getHelmetName(), () -> new ArmorItem(material, ArmorItem.Type.HELMET, properties));
            this.chestplateRegistryObject = register.register(
                    registryName.getChestplateName(), () -> new ArmorItem(material, ArmorItem.Type.CHESTPLATE, properties));
            this.leggingsRegistryObject   = register.register(
                    registryName.getLeggingsName(), () -> new ArmorItem(material, ArmorItem.Type.LEGGINGS, properties));
            this.bootsRegistryObject      = register.register(
                    registryName.getBootsName(), () -> new WoolArmorBoots(material, ArmorItem.Type.BOOTS, properties));
        }

        public @NotNull List<Item> getAll() {
            return List.of(
                    getHelmet(),
                    getChestplate(),
                    getLeggings(),
                    getBoots()
            );
        }

        public @NotNull Item getHelmet() {
            return helmetRegistryObject.get();
        }

        public @NotNull Item getChestplate() {
            return chestplateRegistryObject.get();
        }

        public @NotNull Item getLeggings() {
            return leggingsRegistryObject.get();
        }

        public @NotNull Item getBoots() {
            return bootsRegistryObject.get();
        }
    }

    public static void init(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static void displayItemsGenerator(CreativeModeTab.ItemDisplayParameters parameters, CreativeModeTab.Output output) {
        BLACK_WOOL_ARMOR.getAll().forEach(output::accept);
        BLUE_WOOL_ARMOR.getAll().forEach(output::accept);
        WHITE_WOOL_ARMOR.getAll().forEach(output::accept);
        BROWN_WOOL_ARMOR.getAll().forEach(output::accept);
        CYAN_WOOL_ARMOR.getAll().forEach(output::accept);
        GRAY_WOOL_ARMOR.getAll().forEach(output::accept);
        GREEN_WOOL_ARMOR.getAll().forEach(output::accept);
        LIGHT_BLUE_WOOL_ARMOR.getAll().forEach(output::accept);
        LIGHT_GRAY_WOOL_ARMOR.getAll().forEach(output::accept);
        LIME_WOOL_ARMOR.getAll().forEach(output::accept);
        MAGENTA_WOOL_ARMOR.getAll().forEach(output::accept);
        ORANGE_WOOL_ARMOR.getAll().forEach(output::accept);
        PINK_WOOL_ARMOR.getAll().forEach(output::accept);
        PURPLE_WOOL_ARMOR.getAll().forEach(output::accept);
        RED_WOOL_ARMOR.getAll().forEach(output::accept);
        YELLOW_WOOL_ARMOR.getAll().forEach(output::accept);
    }
}
