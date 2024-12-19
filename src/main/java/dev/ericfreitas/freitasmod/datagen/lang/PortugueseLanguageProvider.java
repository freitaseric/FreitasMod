package dev.ericfreitas.freitasmod.datagen.lang;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.data.PackOutput;

public class PortugueseLanguageProvider extends net.neoforged.neoforge.common.data.LanguageProvider {
    public PortugueseLanguageProvider(PackOutput output) {
        super(output, FreitasMod.MOD_ID, "pt_br");
    }

    @Override
    protected void addTranslations() {
        add("fml.menu.mods.info.description.freitasmod", "Um simples mod criado para aprender sobre criação de mods para Minecraft.");
    }
}