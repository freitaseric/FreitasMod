package dev.ericfreitas.freitasmod.item;

import dev.ericfreitas.freitasmod.FreitasMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemsRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FreitasMod.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT = ITEMS.registerSimpleItem("tin_ingot", new Item.Properties());

    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.registerSimpleItem("nickel_ingot", new Item.Properties());

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
