package fr.alasdiablo.mods.wool.armor;

import fr.alasdiablo.diolib.api.item.armor.ArmorItemRegistryName;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Registries {
    public static final ArmorItemRegistryName BLACK_WOOL_ARMOR      = of("black_wool");
    public static final ArmorItemRegistryName BLUE_WOOL_ARMOR       = of("blue_wool");
    public static final ArmorItemRegistryName WHITE_WOOL_ARMOR      = of("white_wool");
    public static final ArmorItemRegistryName BROWN_WOOL_ARMOR      = of("brown_wool");
    public static final ArmorItemRegistryName CYAN_WOOL_ARMOR       = of("cyan_wool");
    public static final ArmorItemRegistryName GRAY_WOOL_ARMOR       = of("gray_wool");
    public static final ArmorItemRegistryName GREEN_WOOL_ARMOR      = of("green_wool");
    public static final ArmorItemRegistryName LIGHT_BLUE_WOOL_ARMOR = of("light_blue_wool");
    public static final ArmorItemRegistryName LIGHT_GRAY_WOOL_ARMOR = of("light_gray_wool");
    public static final ArmorItemRegistryName LIME_WOOL_ARMOR       = of("lime_wool");
    public static final ArmorItemRegistryName MAGENTA_WOOL_ARMOR    = of("magenta_wool");
    public static final ArmorItemRegistryName ORANGE_WOOL_ARMOR     = of("orange_wool");
    public static final ArmorItemRegistryName PINK_WOOL_ARMOR       = of("pink_wool");
    public static final ArmorItemRegistryName PURPLE_WOOL_ARMOR     = of("purple_wool");
    public static final ArmorItemRegistryName RED_WOOL_ARMOR        = of("red_wool");
    public static final ArmorItemRegistryName YELLOW_WOOL_ARMOR     = of("yellow_wool");
    public static       Item[]                WOOLS_LIST            = new Item[]{
            Blocks.BLACK_WOOL.asItem(),
            Blocks.BLUE_WOOL.asItem(),
            Blocks.WHITE_WOOL.asItem(),
            Blocks.BROWN_WOOL.asItem(),
            Blocks.CYAN_WOOL.asItem(),
            Blocks.GRAY_WOOL.asItem(),
            Blocks.GREEN_WOOL.asItem(),
            Blocks.LIGHT_BLUE_WOOL.asItem(),
            Blocks.LIGHT_GRAY_WOOL.asItem(),
            Blocks.LIME_WOOL.asItem(),
            Blocks.MAGENTA_WOOL.asItem(),
            Blocks.ORANGE_WOOL.asItem(),
            Blocks.PINK_WOOL.asItem(),
            Blocks.PURPLE_WOOL.asItem(),
            Blocks.RED_WOOL.asItem(),
            Blocks.YELLOW_WOOL.asItem()
    };

    @Contract("_ -> new")
    private static @NotNull ArmorItemRegistryName of(String name) {
        return new ArmorItemRegistryName(WoolArmorCommon.MOD_ID, name);
    }
}
