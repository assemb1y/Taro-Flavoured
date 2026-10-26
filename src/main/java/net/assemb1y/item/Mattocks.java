package net.assemb1y.item;

import net.assemb1y.ModBlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import static net.assemb1y.item.ModItems.registerItem;

public class Mattocks {
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
}
