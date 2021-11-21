package fr.alasdiablo.woolarmor.data;

import fr.alasdiablo.woolarmor.init.WoolItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

import static fr.alasdiablo.woolarmor.init.WoolItems.*;

@ParametersAreNonnullByDefault
public class RecipesProvider extends RecipeProvider {
    private Consumer<FinishedRecipe> builder;

    public RecipesProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> builder) {
        this.builder = builder;

        this.armor(BLACK_WOOL_ARMOR, Blocks.BLACK_WOOL, "has_black_wool");
        this.armor(BLUE_WOOL_ARMOR, Blocks.BLUE_WOOL, "has_blue_wool");
        this.armor(WHITE_WOOL_ARMOR, Blocks.WHITE_WOOL, "has_white_wool");
        this.armor(BROWN_WOOL_ARMOR, Blocks.BROWN_WOOL, "has_brown_wool");
        this.armor(CYAN_WOOL_ARMOR, Blocks.CYAN_WOOL, "has_cyan_wool");
        this.armor(GRAY_WOOL_ARMOR, Blocks.GRAY_WOOL, "has_gray_wool");
        this.armor(GREEN_WOOL_ARMOR, Blocks.GREEN_WOOL, "has_green_wool");
        this.armor(LIGHT_BLUE_WOOL_ARMOR, Blocks.LIGHT_BLUE_WOOL, "has_light_blue_wool");
        this.armor(LIGHT_GRAY_WOOL_ARMOR, Blocks.LIGHT_GRAY_WOOL, "has_light_gray_wool");
        this.armor(LIME_WOOL_ARMOR, Blocks.LIME_WOOL, "has_lime_wool");
        this.armor(MAGENTA_WOOL_ARMOR, Blocks.MAGENTA_WOOL, "has_magenta_wool");
        this.armor(ORANGE_WOOL_ARMOR, Blocks.ORANGE_WOOL, "has_orange_wool");
        this.armor(PINK_WOOL_ARMOR, Blocks.PINK_WOOL, "has_pink_wool");
        this.armor(PURPLE_WOOL_ARMOR, Blocks.PURPLE_WOOL, "has_purple_wool");
        this.armor(RED_WOOL_ARMOR, Blocks.RED_WOOL, "has_red_wool");
        this.armor(YELLOW_WOOL_ARMOR, Blocks.YELLOW_WOOL, "has_yellow_wool");
    }

    private void armor(WoolItems.WoolArmorItem output, ItemLike input, String criterion) {
        this.helmet(output.getHelmet(), input, criterion);
        this.chestplate(output.getChestplate(), input, criterion);
        this.leggings(output.getLeggings(), input, criterion);
        this.boots(output.getBoots(), input, criterion);
    }

    private void helmet(ItemLike output, ItemLike input, String criterion) {
        ShapedRecipeBuilder.shaped(output).pattern("CCC").pattern("C C").define('C', input).unlockedBy(criterion, has(input)).save(this.builder);
    }

    private void chestplate(ItemLike output, ItemLike input, String criterion) {
        ShapedRecipeBuilder.shaped(output).pattern("C C").pattern("CCC").pattern("CCC").define('C', input).unlockedBy(criterion, has(input)).save(this.builder);
    }

    private void leggings(ItemLike output, ItemLike input, String criterion) {
        ShapedRecipeBuilder.shaped(output).pattern("CCC").pattern("C C").pattern("C C").define('C', input).unlockedBy(criterion, has(input)).save(this.builder);
    }

    private void boots(ItemLike output, ItemLike input, String criterion) {
        ShapedRecipeBuilder.shaped(output).pattern("C C").pattern("C C").define('C', input).unlockedBy(criterion, has(input)).save(this.builder);
    }
}
