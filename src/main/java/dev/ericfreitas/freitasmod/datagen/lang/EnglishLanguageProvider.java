package dev.ericfreitas.freitasmod.datagen.lang;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.data.PackOutput;

public class EnglishLanguageProvider extends net.neoforged.neoforge.common.data.LanguageProvider {
    public EnglishLanguageProvider(PackOutput output) {
        super(output, FreitasMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("fml.menu.mods.info.description.freitasmod", "A simple Minecraft mod create to learn about Minecraft modding.");
    }
}
