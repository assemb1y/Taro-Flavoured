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

    public static final Item WOODEN_DOLABRA = registerItem("wooden_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.WOOD, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item STONE_DOLABRA = registerItem("stone_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.STONE, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item COPPER_DOLABRA = registerItem("copper_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.COPPER, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item IRON_DOLABRA = registerItem("iron_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.IRON, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item GOLDEN_DOLABRA = registerItem("golden_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.GOLD, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item DIAMOND_DOLABRA = registerItem("diamond_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.DIAMOND, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );
    public static final Item NETHERITE_DOLABRA = registerItem("netherite_dolabra",
            properties -> new Item(properties.tool(ToolMaterial.NETHERITE, ModBlockTags.DOLABRA_MINEABLE, 5.0F, -3.0F, 0.0F))
    );

    public static final ResourceKey<EquipmentAsset> MORGANITE_ASSET =
            ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(TaroFlavoured.MOD_ID, "ruby"));

    public static void registerModItems() {
        TaroFlavoured.LOGGER.info("Registering Items for " + TaroFlavoured.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(ModItems::modifyOutputMattocks);
    }

    private static void modifyOutputMattocks(FabricCreativeModeTabOutput output) {
        output.accept(WOODEN_DOLABRA);
        output.accept(STONE_DOLABRA);
        output.accept(COPPER_DOLABRA);
        output.accept(IRON_DOLABRA);
        output.accept(GOLDEN_DOLABRA);
        output.accept(DIAMOND_DOLABRA);
        output.accept(NETHERITE_DOLABRA);
    }
}
