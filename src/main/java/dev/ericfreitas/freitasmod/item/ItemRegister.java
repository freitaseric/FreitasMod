package dev.ericfreitas.freitasmod.item;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(FreitasMod.MOD_ID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
