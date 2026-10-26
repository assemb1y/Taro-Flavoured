package net.assemb1y.datagen;

import net.assemb1y.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries, @NonNull BootstrapContext<Recipe<?>> recipes, @NonNull BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.TOOLS, ModItems.WOODEN_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', ItemTags.PLANKS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.STONE_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', ItemTags.STONE_TOOL_MATERIALS)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.COPPER_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', Items.COPPER_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.IRON_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', Items.IRON_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.GOLDEN_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', Items.GOLD_INGOT)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.DIAMOND_DOLABRA)
                        .pattern("MMM")
                        .pattern(" SM")
                        .pattern(" S ")
                        .define('M', Items.DIAMOND)
                        .define('S', Items.STICK)
                        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, Items.SHULKER_BOX)
                        .pattern("III")
                        .pattern("ICI")
                        .pattern("III")
                        .define('I', Items.IRON_INGOT)
                        .define('C', Items.CHEST)
                        .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                        .save(output);
            }
        };
    }
}
