package net.assemb1y.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;

import java.util.Map;

public class MattockItem extends Item {
    private static final Map<Block, Block> MATTOCK_MAP =
            Map.of(
                    Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG,
                    Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG,
                    Blocks.CHERRY_LOG, Blocks.STRIPPED_CHERRY_LOG,
                    Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG,
                    Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG,
                    Blocks.MANGROVE_LOG, Blocks.STRIPPED_MANGROVE_LOG,
                    Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG,
                    Blocks.PALE_OAK_LOG, Blocks.STRIPPED_PALE_OAK_LOG,
                    Blocks.POPLAR_LOG, Blocks.STRIPPED_POPLAR_LOG,
                    Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG
            );

    public MattockItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public @NonNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if (MATTOCK_MAP.containsKey(clickedBlock) && !level.isClientSide()) {
            level.setBlockAndUpdate(context.getClickedPos(), MATTOCK_MAP.get(clickedBlock).defaultBlockState());

            assert context.getPlayer() != null;
            context.getItemInHand().hurtAndBreak(1, context.getPlayer(), context.getHand().asEquipmentSlot());
        }

        return InteractionResult.SUCCESS;
    }
}
