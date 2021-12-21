package fr.alasdiablo.woolarmor.data.language;

import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.WoolArmor;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.woolarmor.init.WoolItems.*;

public class EnglishProvider extends LanguageProvider {

    public EnglishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(BLACK_WOOL_ARMOR.getHelmet(), "Black Wool Helmet");
        this.add(BLACK_WOOL_ARMOR.getChestplate(), "Black Wool Chestplate");
        this.add(BLACK_WOOL_ARMOR.getLeggings(), "Black Wool Leggings");
        this.add(BLACK_WOOL_ARMOR.getBoots(), "Black Wool Boots");

        this.add(BLUE_WOOL_ARMOR.getHelmet(), "Blue Wool Helmet");
        this.add(BLUE_WOOL_ARMOR.getChestplate(), "Blue Wool Chestplate");
        this.add(BLUE_WOOL_ARMOR.getLeggings(), "Blue Wool Leggings");
        this.add(BLUE_WOOL_ARMOR.getBoots(), "Blue Wool Boots");

        this.add(WHITE_WOOL_ARMOR.getHelmet(), "White Wool Helmet");
        this.add(WHITE_WOOL_ARMOR.getChestplate(), "White Wool Chestplate");
        this.add(WHITE_WOOL_ARMOR.getLeggings(), "White Wool Leggings");
        this.add(WHITE_WOOL_ARMOR.getBoots(), "White Wool Boots");

        this.add(BROWN_WOOL_ARMOR.getHelmet(), "Brown Wool Helmet");
        this.add(BROWN_WOOL_ARMOR.getChestplate(), "Brown Wool Chestplate");
        this.add(BROWN_WOOL_ARMOR.getLeggings(), "Brown Wool Leggings");
        this.add(BROWN_WOOL_ARMOR.getBoots(), "Brown Wool Boots");

        this.add(CYAN_WOOL_ARMOR.getHelmet(), "Cyan Wool Helmet");
        this.add(CYAN_WOOL_ARMOR.getChestplate(), "Cyan Wool Chestplate");
        this.add(CYAN_WOOL_ARMOR.getLeggings(), "Cyan Wool Leggings");
        this.add(CYAN_WOOL_ARMOR.getBoots(), "Cyan Wool Boots");

        this.add(GRAY_WOOL_ARMOR.getHelmet(), "Gray Wool Helmet");
        this.add(GRAY_WOOL_ARMOR.getChestplate(), "Gray Wool Chestplate");
        this.add(GRAY_WOOL_ARMOR.getLeggings(), "Gray Wool Leggings");
        this.add(GRAY_WOOL_ARMOR.getBoots(), "Gray Wool Boots");

        this.add(GREEN_WOOL_ARMOR.getHelmet(), "Green Wool Helmet");
        this.add(GREEN_WOOL_ARMOR.getChestplate(), "Green Wool Chestplate");
        this.add(GREEN_WOOL_ARMOR.getLeggings(), "Green Wool Leggings");
        this.add(GREEN_WOOL_ARMOR.getBoots(), "Green Wool Boots");

        this.add(LIGHT_BLUE_WOOL_ARMOR.getHelmet(), "Light Blue Wool Helmet");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getChestplate(), "Light Blue Wool Chestplate");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getLeggings(), "Light Blue Wool Leggings");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getBoots(), "Light Blue Wool Boots");

        this.add(LIGHT_GRAY_WOOL_ARMOR.getHelmet(), "Light Gray Wool Helmet");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getChestplate(), "Light Gray Wool Chestplate");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getLeggings(), "Light Gray Wool Leggings");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getBoots(), "Light Gray Wool Boots");

        this.add(LIME_WOOL_ARMOR.getHelmet(), "Lime Wool Helmet");
        this.add(LIME_WOOL_ARMOR.getChestplate(), "Lime Wool Chestplate");
        this.add(LIME_WOOL_ARMOR.getLeggings(), "Lime Wool Leggings");
        this.add(LIME_WOOL_ARMOR.getBoots(), "Lime Wool Boots");

        this.add(MAGENTA_WOOL_ARMOR.getHelmet(), "Magenta Wool Helmet");
        this.add(MAGENTA_WOOL_ARMOR.getChestplate(), "Magenta Wool Chestplate");
        this.add(MAGENTA_WOOL_ARMOR.getLeggings(), "Magenta Wool Leggings");
        this.add(MAGENTA_WOOL_ARMOR.getBoots(), "Magenta Wool Boots");

        this.add(ORANGE_WOOL_ARMOR.getHelmet(), "Orange Wool Helmet");
        this.add(ORANGE_WOOL_ARMOR.getChestplate(), "Orange Wool Chestplate");
        this.add(ORANGE_WOOL_ARMOR.getLeggings(), "Orange Wool Leggings");
        this.add(ORANGE_WOOL_ARMOR.getBoots(), "Orange Wool Boots");

        this.add(PINK_WOOL_ARMOR.getHelmet(), "Pink Wool Helmet");
        this.add(PINK_WOOL_ARMOR.getChestplate(), "Pink Wool Chestplate");
        this.add(PINK_WOOL_ARMOR.getLeggings(), "Pink Wool Leggings");
        this.add(PINK_WOOL_ARMOR.getBoots(), "Pink Wool Boots");

        this.add(PURPLE_WOOL_ARMOR.getHelmet(), "Purple Wool Helmet");
        this.add(PURPLE_WOOL_ARMOR.getChestplate(), "Purple Wool Chestplate");
        this.add(PURPLE_WOOL_ARMOR.getLeggings(), "Purple Wool Leggings");
        this.add(PURPLE_WOOL_ARMOR.getBoots(), "Purple Wool Boots");

        this.add(RED_WOOL_ARMOR.getHelmet(), "Red Wool Helmet");
        this.add(RED_WOOL_ARMOR.getChestplate(), "Red Wool Chestplate");
        this.add(RED_WOOL_ARMOR.getLeggings(), "Red Wool Leggings");
        this.add(RED_WOOL_ARMOR.getBoots(), "Red Wool Boots");

        this.add(YELLOW_WOOL_ARMOR.getHelmet(), "Yellow Wool Helmet");
        this.add(YELLOW_WOOL_ARMOR.getChestplate(), "Yellow Wool Chestplate");
        this.add(YELLOW_WOOL_ARMOR.getLeggings(), "Yellow Wool Leggings");
        this.add(YELLOW_WOOL_ARMOR.getBoots(), "Yellow Wool Boots");

        this.add(((TranslatableComponent) WoolArmor.CREATIVE_TAB.getDisplayName()).getKey(), "Wool Armor");
        this.add("wool.armor.boots.hover.text", "Reduces fall damage by 2");
    }
}
