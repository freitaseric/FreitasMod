package dev.ericfreitas.freitasmod.block;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.item.ItemsRegistry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlocksRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FreitasMod.MOD_ID);

    public static final DeferredBlock<Block> ALUMINUM_BLOCK = addBlock("aluminum_block", BlockBehaviour.Properties.of().strength(3.2f).sound(SoundType.METAL).requiresCorrectToolForDrops());

    private static DeferredBlock<Block> addBlock(String name, BlockBehaviour.Properties props) {
        var toReturn = BLOCKS.registerSimpleBlock(name, props);
        addBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void addBlockItem(String name, DeferredBlock<Block> block) {
        ItemsRegistry.ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
