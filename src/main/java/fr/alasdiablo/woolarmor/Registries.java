package fr.alasdiablo.woolarmor;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

public class Registries {
    public static final String MOD_ID = "wool_armor";

    public static final WoolArmorRegistriesName BLACK_WOOL_ARMOR      = of("black_wool");
    public static final WoolArmorRegistriesName BLUE_WOOL_ARMOR       = of("blue_wool");
    public static final WoolArmorRegistriesName WHITE_WOOL_ARMOR      = of("white_wool");
    public static final WoolArmorRegistriesName BROWN_WOOL_ARMOR      = of("brown_wool");
    public static final WoolArmorRegistriesName CYAN_WOOL_ARMOR       = of("cyan_wool");
    public static final WoolArmorRegistriesName GRAY_WOOL_ARMOR       = of("gray_wool");
    public static final WoolArmorRegistriesName GREEN_WOOL_ARMOR      = of("green_wool");
    public static final WoolArmorRegistriesName LIGHT_BLUE_WOOL_ARMOR = of("light_blue_wool");
    public static final WoolArmorRegistriesName LIGHT_GRAY_WOOL_ARMOR = of("light_gray_wool");
    public static final WoolArmorRegistriesName LIME_WOOL_ARMOR       = of("lime_wool");
    public static final WoolArmorRegistriesName MAGENTA_WOOL_ARMOR    = of("magenta_wool");
    public static final WoolArmorRegistriesName ORANGE_WOOL_ARMOR     = of("orange_wool");
    public static final WoolArmorRegistriesName PINK_WOOL_ARMOR       = of("pink_wool");
    public static final WoolArmorRegistriesName PURPLE_WOOL_ARMOR     = of("purple_wool");
    public static final WoolArmorRegistriesName RED_WOOL_ARMOR        = of("red_wool");
    public static final WoolArmorRegistriesName YELLOW_WOOL_ARMOR     = of("yellow_wool");

    private static WoolArmorRegistriesName of(String name) {
        return new WoolArmorRegistriesName(name);
    }

    public record WoolArmorRegistriesName(String name) {
        public String getHelmet() {
            return this.name + "_helmet";
        }

        public String getChestplate() {
            return this.name + "_chestplate";
        }

        public String getLeggings() {
            return this.name + "_leggings";
        }

        public String getBoots() {
            return this.name + "_boots";
        }
    }

    public static ItemLike[] WOOLS_LIST = new ItemLike[]{
            Blocks.BLACK_WOOL, Blocks.BLUE_WOOL, Blocks.WHITE_WOOL, Blocks.BROWN_WOOL, Blocks.CYAN_WOOL, Blocks.GRAY_WOOL, Blocks.GREEN_WOOL,
            Blocks.LIGHT_BLUE_WOOL, Blocks.LIGHT_GRAY_WOOL, Blocks.LIME_WOOL, Blocks.MAGENTA_WOOL, Blocks.ORANGE_WOOL, Blocks.PINK_WOOL, Blocks.PURPLE_WOOL,
            Blocks.RED_WOOL, Blocks.YELLOW_WOOL
    };
}
