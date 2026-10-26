package net.assemb1y.item;

import net.assemb1y.ModBlockTags;
import net.assemb1y.TaroFlavoured;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.*;

import java.util.function.Function;

public class ModItems {
    public static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM,  Identifier.fromNamespaceAndPath(TaroFlavoured.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TaroFlavoured.MOD_ID, name)))));
    }

    public static final Item WOODEN_MATTOCK = registerItem("wooden_mattock",
            properties -> new Item(properties.tool(ToolMaterial.WOOD, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item STONE_MATTOCK = registerItem("stone_mattock",
            properties -> new Item(properties.tool(ToolMaterial.STONE, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item COPPER_MATTOCK = registerItem("copper_mattock",
            properties -> new Item(properties.tool(ToolMaterial.COPPER, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item IRON_MATTOCK = registerItem("iron_mattock",
            properties -> new Item(properties.tool(ToolMaterial.IRON, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item GOLDEN_MATTOCK = registerItem("golden_mattock",
            properties -> new Item(properties.tool(ToolMaterial.GOLD, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item DIAMOND_MATTOCK = registerItem("diamond_mattock",
            properties -> new Item(properties.tool(ToolMaterial.DIAMOND, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item NETHERITE_MATTOCK = registerItem("netherite_mattock",
            properties -> new Item(properties.tool(ToolMaterial.NETHERITE, ModBlockTags.MATTOCK_MINEABLE, 5.0F, -3.0F, 0.0F))
    );

    public static final ResourceKey<EquipmentAsset> MORGANITE_ASSET =
            ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(TaroFlavoured.MOD_ID, "ruby"));

    public static void registerModItems() {
        TaroFlavoured.LOGGER.info("Registering Items for " + TaroFlavoured.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(ModItems::modifyOutputMattocks);
    }

    private static void modifyOutputMattocks(FabricCreativeModeTabOutput output) {
        output.accept(WOODEN_MATTOCK);
        output.accept(STONE_MATTOCK);
        output.accept(COPPER_MATTOCK);
        output.accept(IRON_MATTOCK);
        output.accept(GOLDEN_MATTOCK);
        output.accept(DIAMOND_MATTOCK);
        output.accept(NETHERITE_MATTOCK);
    }
}
