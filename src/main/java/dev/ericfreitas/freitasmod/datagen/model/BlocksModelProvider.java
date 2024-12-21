package dev.ericfreitas.freitasmod.datagen.model;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class BlocksModelProvider extends BlockModelProvider {
    public BlocksModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FreitasMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
