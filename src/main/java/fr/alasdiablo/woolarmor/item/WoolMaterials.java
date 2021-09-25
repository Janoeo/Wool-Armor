package fr.alasdiablo.woolarmor.item;

import fr.alasdiablo.woolarmor.Registries;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import static fr.alasdiablo.woolarmor.Registries.*;

@MethodsReturnNonnullByDefault
public enum WoolMaterials implements ArmorMaterial {
    BLACK_WOOL_MATERIAL(BLACK_WOOL_ARMOR.name()), BLUE_WOOL_MATERIAL(BLUE_WOOL_ARMOR.name()), WHITE_WOOL_MATERIAL(WHITE_WOOL_ARMOR.name()),
    BROWN_WOOL_MATERIAL(BROWN_WOOL_ARMOR.name()), CYAN_WOOL_MATERIAL(CYAN_WOOL_ARMOR.name()), GRAY_WOOL_MATERIAL(GRAY_WOOL_ARMOR.name()),
    GREEN_WOOL_MATERIAL(GREEN_WOOL_ARMOR.name()), LIGHT_BLUE_WOOL_MATERIAL(LIGHT_BLUE_WOOL_ARMOR.name()), LIGHT_GRAY_WOOL_MATERIAL(LIGHT_GRAY_WOOL_ARMOR.name()),
    LIME_WOOL_MATERIAL(LIME_WOOL_ARMOR.name()), MAGENTA_WOOL_MATERIAL(MAGENTA_WOOL_ARMOR.name()), ORANGE_WOOL_MATERIAL(ORANGE_WOOL_ARMOR.name()),
    PINK_WOOL_MATERIAL(PINK_WOOL_ARMOR.name()), PURPLE_WOOL_MATERIAL(PURPLE_WOOL_ARMOR.name()), RED_WOOL_MATERIAL(RED_WOOL_ARMOR.name()),
    YELLOW_WOOL_MATERIAL(YELLOW_WOOL_ARMOR.name());


    private static final int[]      HEALTH_PER_SLOT = new int[]{ 13, 15, 16, 11 };
    private final        String     name;
    private final        int        durabilityMultiplier;
    private final        int[]      slotProtections;
    private final        int        enchantmentValue;
    private final        SoundEvent sound;
    private final        float      toughness;
    private final        float      knockbackResistance;
    private final        Ingredient repairIngredient;

    WoolMaterials(String name) {
        this.name                 = name;
        this.durabilityMultiplier = 3;
        this.slotProtections      = new int[]{ 1, 2, 2, 1 };
        this.enchantmentValue     = 10;
        this.sound                = SoundEvents.ARMOR_EQUIP_LEATHER;
        this.toughness            = 0f;
        this.knockbackResistance  = 0f;
        this.repairIngredient     = Ingredient.of(Registries.WOOLS_LIST);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
