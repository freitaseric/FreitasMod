package dev.ericfreitas.freitasmod.block;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.item.ItemsRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(FreitasMod.MOD_ID);

    private static <T extends Block> DeferredHolder<Block, T> addBlock(String name, Supplier<T> block) {
        var toReturn = BLOCKS.register(name, block);
        addBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void addBlockItem(String name, DeferredHolder<Block, T> block) {
        ItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
