package dev.ericfreitas.freitasmod.datagen.lang;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.block.BlocksRegistry;
import dev.ericfreitas.freitasmod.item.ItemsRegistry;
import net.minecraft.data.PackOutput;

public class PortugueseLanguageProvider extends net.neoforged.neoforge.common.data.LanguageProvider {
    public PortugueseLanguageProvider(PackOutput output) {
        super(output, FreitasMod.MOD_ID, "pt_br");
    }

    @Override
    protected void addTranslations() {
        add("fml.menu.mods.info.description." + FreitasMod.MOD_ID, "Um simples mod criado para aprender sobre criação de mods para Minecraft.");
        add("itemGroup." + FreitasMod.MOD_ID + ".ores_tab", "Freitas' Mod Minérios");

        addItem(ItemsRegistry.TIN_INGOT, "Barra de Estanho");

        addItem(ItemsRegistry.NICKEL_INGOT, "Barra de Níquel");

        addItem(ItemsRegistry.ALUMINUM_INGOT, "Barra de Alumínio");
        addBlock(BlocksRegistry.ALUMINUM_BLOCK, "Bloco de Alumínio");
    }
}
