package fr.alasdiablo.woolarmor.data;

import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.WoolArmor;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.woolarmor.init.WoolItems.*;

public class SpanishProvider extends LanguageProvider {

    public SpanishProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "es_es");
    }

    @Override
    protected void addTranslations() {
        this.add(BLACK_WOOL_ARMOR.getHelmet(), "Casco de lana negra");
        this.add(BLACK_WOOL_ARMOR.getChestplate(), "Peto de lana negra");
        this.add(BLACK_WOOL_ARMOR.getLeggings(), "Grebas de lana negra");
        this.add(BLACK_WOOL_ARMOR.getBoots(), "Botas de lana negra");

        this.add(BLUE_WOOL_ARMOR.getHelmet(), "Casco de lana azul");
        this.add(BLUE_WOOL_ARMOR.getChestplate(), "Peto de lana azul");
        this.add(BLUE_WOOL_ARMOR.getLeggings(), "Grebas de lana azul");
        this.add(BLUE_WOOL_ARMOR.getBoots(), "Botas de lana azul");

        this.add(WHITE_WOOL_ARMOR.getHelmet(), "Casco de lana blanca");
        this.add(WHITE_WOOL_ARMOR.getChestplate(), "Peto de lana blanca");
        this.add(WHITE_WOOL_ARMOR.getLeggings(), "Grebas de lana blanca");
        this.add(WHITE_WOOL_ARMOR.getBoots(), "Botas de lana blanca");

        this.add(BROWN_WOOL_ARMOR.getHelmet(), "Casco de lana marrón");
        this.add(BROWN_WOOL_ARMOR.getChestplate(), "Peto de lana marrón");
        this.add(BROWN_WOOL_ARMOR.getLeggings(), "Grebas de lana marrón");
        this.add(BROWN_WOOL_ARMOR.getBoots(), "Botas de lana marrón");

        this.add(CYAN_WOOL_ARMOR.getHelmet(), "Casco de lana cian");
        this.add(CYAN_WOOL_ARMOR.getChestplate(), "Peto de lana cian");
        this.add(CYAN_WOOL_ARMOR.getLeggings(), "Grebas de lana cian");
        this.add(CYAN_WOOL_ARMOR.getBoots(), "Botas de lana cian");

        this.add(GRAY_WOOL_ARMOR.getHelmet(), "Casco de lana gris");
        this.add(GRAY_WOOL_ARMOR.getChestplate(), "Peto de lana gris");
        this.add(GRAY_WOOL_ARMOR.getLeggings(), "Grebas de lana gris");
        this.add(GRAY_WOOL_ARMOR.getBoots(), "Botas de lana gris");

        this.add(GREEN_WOOL_ARMOR.getHelmet(), "Casco de lana verde");
        this.add(GREEN_WOOL_ARMOR.getChestplate(), "Peto de lana verde");
        this.add(GREEN_WOOL_ARMOR.getLeggings(), "Grebas de lana verde");
        this.add(GREEN_WOOL_ARMOR.getBoots(), "Botas de lana verde");

        this.add(LIGHT_BLUE_WOOL_ARMOR.getHelmet(), "Casco de lana azul claro");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getChestplate(), "Peto de lana azul claro");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getLeggings(), "Grebas de lana azul claro");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getBoots(), "Botas de lana azul claro");

        this.add(LIGHT_GRAY_WOOL_ARMOR.getHelmet(), "Casco de lana gris claro");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getChestplate(), "Peto de lana gris claro");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getLeggings(), "Grebas de lana gris claro");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getBoots(), "Botas de lana gris claro");

        this.add(LIME_WOOL_ARMOR.getHelmet(), "Casco de lana verde lima");
        this.add(LIME_WOOL_ARMOR.getChestplate(), "Peto de lana verde lima");
        this.add(LIME_WOOL_ARMOR.getLeggings(), "Grebas de lana verde lima");
        this.add(LIME_WOOL_ARMOR.getBoots(), "Botas de lana verde lima");

        this.add(MAGENTA_WOOL_ARMOR.getHelmet(), "Casco de lana magenta");
        this.add(MAGENTA_WOOL_ARMOR.getChestplate(), "Peto de lana magenta");
        this.add(MAGENTA_WOOL_ARMOR.getLeggings(), "Grebas de lana magenta");
        this.add(MAGENTA_WOOL_ARMOR.getBoots(), "Botas de lana magenta");

        this.add(ORANGE_WOOL_ARMOR.getHelmet(), "Casco de lana naranja");
        this.add(ORANGE_WOOL_ARMOR.getChestplate(), "Peto de lana naranja");
        this.add(ORANGE_WOOL_ARMOR.getLeggings(), "Grebas de lana naranja");
        this.add(ORANGE_WOOL_ARMOR.getBoots(), "Botas de lana naranja");

        this.add(PINK_WOOL_ARMOR.getHelmet(), "Casco de lana rosa");
        this.add(PINK_WOOL_ARMOR.getChestplate(), "Peto de lana rosa");
        this.add(PINK_WOOL_ARMOR.getLeggings(), "Grebas de lana rosa");
        this.add(PINK_WOOL_ARMOR.getBoots(), "Botas de lana rosa");

        this.add(PURPLE_WOOL_ARMOR.getHelmet(), "Casco de lana morado");
        this.add(PURPLE_WOOL_ARMOR.getChestplate(), "Peto de lana morado");
        this.add(PURPLE_WOOL_ARMOR.getLeggings(), "Grebas de lana morado");
        this.add(PURPLE_WOOL_ARMOR.getBoots(), "Botas de lana morado");

        this.add(RED_WOOL_ARMOR.getHelmet(), "Casco de lana rojo");
        this.add(RED_WOOL_ARMOR.getChestplate(), "Peto de lana rojo");
        this.add(RED_WOOL_ARMOR.getLeggings(), "Grebas de lana rojo");
        this.add(RED_WOOL_ARMOR.getBoots(), "Botas de lana rojo");

        this.add(YELLOW_WOOL_ARMOR.getHelmet(), "Casco de lana amarillo");
        this.add(YELLOW_WOOL_ARMOR.getChestplate(), "Peto de lana amarillo");
        this.add(YELLOW_WOOL_ARMOR.getLeggings(), "Grebas de lana amarillo");
        this.add(YELLOW_WOOL_ARMOR.getBoots(), "Botas de lana amarillo");

        this.add(((TranslatableComponent) WoolArmor.CREATIVE_TAB.getDisplayName()).getKey(), "Armadura de Lana");
        this.add("wool.armor.boots.hover.text", "Reduce el daño por caída en 2");
    }
}
