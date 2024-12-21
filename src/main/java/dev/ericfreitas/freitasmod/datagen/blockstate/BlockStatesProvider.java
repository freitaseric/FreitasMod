package dev.ericfreitas.freitasmod.datagen.blockstate;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.block.BlocksRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlockStatesProvider extends BlockStateProvider {
    public BlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, FreitasMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(BlocksRegistry.ALUMINUM_BLOCK.get(), models().cubeAll("aluminum_block", ResourceLocation.fromNamespaceAndPath(FreitasMod.MOD_ID, "block/aluminum_block")));
    }
}
