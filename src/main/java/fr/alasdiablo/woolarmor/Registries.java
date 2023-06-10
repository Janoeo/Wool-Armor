package fr.alasdiablo.woolarmor;

import fr.alasdiablo.diolib.api.item.armor.ArmorItemRegistryName;
import net.minecraft.world.level.ItemLike;
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
    public static       ItemLike[]            WOOLS_LIST            = new ItemLike[]{
            Blocks.BLACK_WOOL, Blocks.BLUE_WOOL, Blocks.WHITE_WOOL, Blocks.BROWN_WOOL, Blocks.CYAN_WOOL, Blocks.GRAY_WOOL, Blocks.GREEN_WOOL,
            Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.LIME_WOOL, Blocks.MAGENTA_WOOL, Blocks.ORANGE_WOOL, Blocks.PINK_WOOL, Blocks.PURPLE_WOOL,
            Blocks.RED_WOOL, Blocks.YELLOW_WOOL
    };

    @Contract("_ -> new")
    private static @NotNull ArmorItemRegistryName of(String name) {
        return new ArmorItemRegistryName(WoolArmor.MOD_ID, name);
    }
}
