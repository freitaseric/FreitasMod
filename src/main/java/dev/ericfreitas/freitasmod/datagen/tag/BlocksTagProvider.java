package dev.ericfreitas.freitasmod.datagen.tag;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.block.BlocksRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlocksTagProvider extends BlockTagsProvider {

    public BlocksTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, FreitasMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlocksRegistry.ALUMINUM_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL).add(BlocksRegistry.ALUMINUM_BLOCK.get());
    }
}
