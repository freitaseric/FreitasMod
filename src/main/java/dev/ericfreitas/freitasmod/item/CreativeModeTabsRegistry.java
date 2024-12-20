package dev.ericfreitas.freitasmod.item;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class CreativeModeTabsRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreitasMod.MOD_ID);

    public static final Supplier<CreativeModeTab> INGOTS_TAB = CREATIVE_MODE_TABS.register("ingots_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup." + FreitasMod.MOD_ID + ".ingots_tab")).icon(() -> new ItemStack(ItemsRegistry.TIN_INGOT.get())).displayItems((params, output) -> {
        output.accept(ItemsRegistry.TIN_INGOT.get());
        output.accept(ItemsRegistry.NICKEL_INGOT.get());
    }).withSearchBar().build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
