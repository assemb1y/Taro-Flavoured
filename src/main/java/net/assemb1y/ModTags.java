package net.assemb1y;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> REPAIRS_MORGANITE_ARMOR = createTag("repairs_morganite_armor");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TaroFlavoured.MOD_ID, name));
        }
    }
}
