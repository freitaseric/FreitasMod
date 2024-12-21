package dev.ericfreitas.freitasmod.datagen;

import dev.ericfreitas.freitasmod.FreitasMod;
import dev.ericfreitas.freitasmod.datagen.blockstate.BlockStatesProvider;
import dev.ericfreitas.freitasmod.datagen.lang.EnglishLanguageProvider;
import dev.ericfreitas.freitasmod.datagen.lang.PortugueseLanguageProvider;
import dev.ericfreitas.freitasmod.datagen.model.BlocksModelProvider;
import dev.ericfreitas.freitasmod.datagen.model.ItemsModelProvider;
import dev.ericfreitas.freitasmod.datagen.tag.BlocksTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = FreitasMod.MOD_ID)
public class DatagenRegistry {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        net.minecraft.data.DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new BlocksTagProvider(output, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new PortugueseLanguageProvider(output));
        generator.addProvider(event.includeClient(), new EnglishLanguageProvider(output));

        generator.addProvider(event.includeClient(), new BlocksModelProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new BlockStatesProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemsModelProvider(output, existingFileHelper));
    }
}
