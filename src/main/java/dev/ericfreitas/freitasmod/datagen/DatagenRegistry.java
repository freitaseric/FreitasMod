package dev.ericfreitas.freitasmod.datagen;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.datagen.lang.EnglishLanguageProvider;
import dev.ericfreitas.freitasmod.datagen.lang.PortugueseLanguageProvider;
import dev.ericfreitas.freitasmod.datagen.model.ItemsModelProvider;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = FreitasMod.MOD_ID)
public class DatagenRegistry {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new PortugueseLanguageProvider(output));
        generator.addProvider(event.includeClient(), new EnglishLanguageProvider(output));

        generator.addProvider(event.includeClient(), new ItemsModelProvider(output, existingFileHelper));
    }
}
