package net.assemb1y.datagen;

import net.assemb1y.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jspecify.annotations.NonNull;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.client.data.models.@NonNull BlockModelGenerators blockModelGenerators) {
    }

    @Override
    public void generateItemModels(net.minecraft.client.data.models.ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.WOODEN_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STONE_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.COPPER_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.IRON_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.GOLDEN_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.DIAMOND_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NETHERITE_MATTOCK, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
