package net.assemb1y.item;

import net.assemb1y.ModBlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import static net.assemb1y.item.ModItems.registerItem;

public class Dolabras {
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
}
