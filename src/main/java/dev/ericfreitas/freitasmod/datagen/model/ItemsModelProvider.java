package dev.ericfreitas.freitasmod.datagen.model;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.item.ItemsRegistry;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemsModelProvider extends ItemModelProvider {
    public ItemsModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FreitasMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemsRegistry.TIN_INGOT.get());
        basicItem(ItemsRegistry.NICKEL_INGOT.get());
        basicItem(ItemsRegistry.ALUMINUM_INGOT.get());
    }
}
