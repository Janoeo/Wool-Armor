package fr.alasdiablo.woolarmor.utils;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;

public class Registries {
    public static final String MOD_ID                     = "wool_armor";
    public static final String RED_WOOL_HELMET            = "red_wool_helmet";
    public static final String RED_WOOL_CHESTPLATE        = "red_wool_chestplate";
    public static final String RED_WOOL_LEGGINGS          = "red_wool_leggings";
    public static final String RED_WOOL_BOOTS             = "red_wool_boots";

    public static final String WHITE_WOOL_HELMET            = "white_wool_helmet";
    public static final String WHITE_WOOL_CHESTPLATE        = "white_wool_chestplate";
    public static final String WHITE_WOOL_LEGGINGS          = "white_wool_leggings";
    public static final String WHITE_WOOL_BOOTS             = "white_wool_boots";

    public static final String YELLOW_WOOL_HELMET            = "yellow_wool_helmet";
    public static final String YELLOW_WOOL_CHESTPLATE        = "yellow_wool_chestplate";
    public static final String YELLOW_WOOL_LEGGINGS          = "yellow_wool_leggings";
    public static final String YELLOW_WOOL_BOOTS             = "yellow_wool_boots";


    public static Item[] WOOLS_LIST = new Item[] {
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
}
