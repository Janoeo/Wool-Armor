package fr.alasdiablo.woolarmor.data;

import fr.alasdiablo.woolarmor.Registries;
import fr.alasdiablo.woolarmor.WoolArmor;
import net.minecraft.data.DataGenerator;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.common.data.LanguageProvider;

import static fr.alasdiablo.woolarmor.init.WoolItems.*;

public class FrenchProvider extends LanguageProvider {

    public FrenchProvider(DataGenerator gen) {
        super(gen, Registries.MOD_ID, "fr_fr");
    }

    @Override
    protected void addTranslations() {
        this.add(BLACK_WOOL_ARMOR.getHelmet(), "Casque en laine noire");
        this.add(BLACK_WOOL_ARMOR.getChestplate(), "Plastron en laine noire");
        this.add(BLACK_WOOL_ARMOR.getLeggings(), "Jambières en laine noire");
        this.add(BLACK_WOOL_ARMOR.getBoots(), "Bottes en laine noire");

        this.add(BLUE_WOOL_ARMOR.getHelmet(), "Casque en laine bleue");
        this.add(BLUE_WOOL_ARMOR.getChestplate(), "Plastron en laine bleue");
        this.add(BLUE_WOOL_ARMOR.getLeggings(), "Jambières en laine bleue");
        this.add(BLUE_WOOL_ARMOR.getBoots(), "Bottes en laine bleue");

        this.add(WHITE_WOOL_ARMOR.getHelmet(), "Casque en laine blanche");
        this.add(WHITE_WOOL_ARMOR.getChestplate(), "Plastron en laine blanche");
        this.add(WHITE_WOOL_ARMOR.getLeggings(), "Jambières en laine blanche");
        this.add(WHITE_WOOL_ARMOR.getBoots(), "Bottes en laine blanche");

        this.add(BROWN_WOOL_ARMOR.getHelmet(), "Casque en laine marron");
        this.add(BROWN_WOOL_ARMOR.getChestplate(), "Plastron en laine marron");
        this.add(BROWN_WOOL_ARMOR.getLeggings(), "Jambières en laine marron");
        this.add(BROWN_WOOL_ARMOR.getBoots(), "Bottes en laine marron");

        this.add(CYAN_WOOL_ARMOR.getHelmet(), "Casque en laine cyan");
        this.add(CYAN_WOOL_ARMOR.getChestplate(), "Plastron en laine cyan");
        this.add(CYAN_WOOL_ARMOR.getLeggings(), "Jambières en laine cyan");
        this.add(CYAN_WOOL_ARMOR.getBoots(), "Bottes en laine laine cyan");

        this.add(GRAY_WOOL_ARMOR.getHelmet(), "Casque en laine grise");
        this.add(GRAY_WOOL_ARMOR.getChestplate(), "Plastron en laine grise");
        this.add(GRAY_WOOL_ARMOR.getLeggings(), "Jambières en laine grise");
        this.add(GRAY_WOOL_ARMOR.getBoots(), "Bottes en laine grise");

        this.add(GREEN_WOOL_ARMOR.getHelmet(), "Casque en laine verte");
        this.add(GREEN_WOOL_ARMOR.getChestplate(), "Plastron en laine verte");
        this.add(GREEN_WOOL_ARMOR.getLeggings(), "Jambières en laine verte");
        this.add(GREEN_WOOL_ARMOR.getBoots(), "Bottes en laine laine verte");

        this.add(LIGHT_BLUE_WOOL_ARMOR.getHelmet(), "Casque en laine bleu clair");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getChestplate(), "Plastron en laine bleu clair");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getLeggings(), "Jambières en laine bleu clair");
        this.add(LIGHT_BLUE_WOOL_ARMOR.getBoots(), "Bottes en laine bleu clair");

        this.add(LIGHT_GRAY_WOOL_ARMOR.getHelmet(), "Casque en laine gris clair");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getChestplate(), "Plastron en laine gris clair");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getLeggings(), "Jambières en laine gris clair");
        this.add(LIGHT_GRAY_WOOL_ARMOR.getBoots(), "Bottes en laine gris clair");

        this.add(LIME_WOOL_ARMOR.getHelmet(), "Casque en laine vert clair");
        this.add(LIME_WOOL_ARMOR.getChestplate(), "Plastron en laine vert clair");
        this.add(LIME_WOOL_ARMOR.getLeggings(), "Jambières en laine vert clair");
        this.add(LIME_WOOL_ARMOR.getBoots(), "Bottes en laine vert clair");

        this.add(MAGENTA_WOOL_ARMOR.getHelmet(), "Casque en laine magenta");
        this.add(MAGENTA_WOOL_ARMOR.getChestplate(), "Plastron en laine magenta");
        this.add(MAGENTA_WOOL_ARMOR.getLeggings(), "Jambières en laine magenta");
        this.add(MAGENTA_WOOL_ARMOR.getBoots(), "Bottes en laine magenta");

        this.add(ORANGE_WOOL_ARMOR.getHelmet(), "Casque en laine orange");
        this.add(ORANGE_WOOL_ARMOR.getChestplate(), "Plastron en laine orange");
        this.add(ORANGE_WOOL_ARMOR.getLeggings(), "Jambières en laine orange");
        this.add(ORANGE_WOOL_ARMOR.getBoots(), "Bottes en laine orange");

        this.add(PINK_WOOL_ARMOR.getHelmet(), "Casque en laine rose");
        this.add(PINK_WOOL_ARMOR.getChestplate(), "Plastron en laine rose");
        this.add(PINK_WOOL_ARMOR.getLeggings(), "Jambières en laine rose");
        this.add(PINK_WOOL_ARMOR.getBoots(), "Bottes en laine rose");

        this.add(PURPLE_WOOL_ARMOR.getHelmet(), "Casque en laine violette");
        this.add(PURPLE_WOOL_ARMOR.getChestplate(), "Plastron en laine violette");
        this.add(PURPLE_WOOL_ARMOR.getLeggings(), "Jambières en laine violette");
        this.add(PURPLE_WOOL_ARMOR.getBoots(), "Bottes en laine violette");

        this.add(RED_WOOL_ARMOR.getHelmet(), "Casque en laine rouge");
        this.add(RED_WOOL_ARMOR.getChestplate(), "Plastron en laine rouge");
        this.add(RED_WOOL_ARMOR.getLeggings(), "Jambières en laine rouge");
        this.add(RED_WOOL_ARMOR.getBoots(), "Bottes en laine rouge");

        this.add(YELLOW_WOOL_ARMOR.getHelmet(), "Casque en laine jaune");
        this.add(YELLOW_WOOL_ARMOR.getChestplate(), "Plastron en laine jaune");
        this.add(YELLOW_WOOL_ARMOR.getLeggings(), "Jambières en laine jaune");
        this.add(YELLOW_WOOL_ARMOR.getBoots(), "Bottes en laine jaune");

        this.add(((TranslatableComponent) WoolArmor.CREATIVE_TAB.getDisplayName()).getKey(), "Armure en Laine");
        this.add("wool.armor.boots.hover.text", "Réduit les dégâts de chute par 2");
    }
}
