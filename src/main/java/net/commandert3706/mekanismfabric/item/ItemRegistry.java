package net.commandert3706.mekanismfabric.item;

import net.commandert3706.mekanismfabric.MekanismFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    // Default Settings
    public static final FabricItemSettings DEFAULT_SETTINGS =
            new FabricItemSettings().group(ModItemGroup.MEKANISM);

    // Register Items
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MekanismFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MekanismFabric.LOGGER.debug("Registering Mod Items for " + MekanismFabric.MOD_ID);
    }


    // Alloys
    public static final Item INFUSED_ALLOY = ItemRegistry.registerItem("infused_alloy",
            new Item(ItemRegistry.DEFAULT_SETTINGS));
    public static final Item REINFORCED_ALLOY = ItemRegistry.registerItem("reinforced_alloy",
            new Item(ItemRegistry.DEFAULT_SETTINGS));
    public static final Item ATOMIC_ALLOY = ItemRegistry.registerItem("atomic_alloy",
            new Item(ItemRegistry.DEFAULT_SETTINGS));
}
