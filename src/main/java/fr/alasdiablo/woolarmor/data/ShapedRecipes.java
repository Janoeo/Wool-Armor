package fr.alasdiablo.woolarmor.data;

import fr.alasdiablo.woolarmor.init.WoolItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Items;

import java.util.function.Consumer;

@SuppressWarnings("unused")
public class ShapedRecipes extends RecipeProvider {

    public ShapedRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(WoolItems.RED_WOOL_HELMET)
                .key('W', Items.RED_WOOL)
                .patternLine("WWW")
                .patternLine("W W")
                .addCriterion("has_red_wool", this.hasItem(Items.RED_WOOL))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(WoolItems.RED_WOOL_CHESTPLATE)
                .key('W', Items.RED_WOOL)
                .patternLine("W W")
                .patternLine("WWW")
                .patternLine("WWW")
                .addCriterion("has_red_wool", this.hasItem(Items.RED_WOOL))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(WoolItems.RED_WOOL_LEGGINGS)
                .key('W', Items.RED_WOOL)
                .patternLine("WWW")
                .patternLine("W W")
                .patternLine("W W")
                .addCriterion("has_red_wool", this.hasItem(Items.RED_WOOL))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(WoolItems.RED_WOOL_BOOTS)
                .key('W', Items.RED_WOOL)
                .patternLine("W W")
                .patternLine("W W")
                .addCriterion("has_red_wool", this.hasItem(Items.RED_WOOL))
                .build(consumer);
    }
}
