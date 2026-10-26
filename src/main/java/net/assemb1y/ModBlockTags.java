package net.assemb1y;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> MATTOCK_MINEABLE =
            TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath("taro-flavoured", "mattock_mineable"));
}