package net.commandert3706.mekanismfabric.item;

import net.commandert3706.mekanismfabric.MekanismFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
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
    public static final Item INFUSED_ALLOY = registerItem("infused_alloy",
            new Item(DEFAULT_SETTINGS));
    public static final Item REINFORCED_ALLOY = registerItem("reinforced_alloy",
            new Item(DEFAULT_SETTINGS));
    public static final Item ATOMIC_ALLOY = registerItem("atomic_alloy",
            new Item(DEFAULT_SETTINGS));


    // Circuits
    public static final Item BASIC_CONTROL_CIRCUIT = registerItem("basic_control_circuit",
            new Item(DEFAULT_SETTINGS));
    public static final Item ADVANCED_CONTROL_CIRCUIT = registerItem("advanced_control_circuit",
            new Item(DEFAULT_SETTINGS));
    public static final Item ELITE_CONTROL_CIRCUIT = registerItem("elite_control_circuit",
            new Item(DEFAULT_SETTINGS));
    public static final Item ULTIMATE_CONTROL_CIRCUIT = registerItem("ultimate_control_circuit",
            new Item(DEFAULT_SETTINGS));


    // Enriched items
    public static final Item ENRICHED_CARBON = registerItem("enriched_carbon",
            new Item(DEFAULT_SETTINGS));
    public static final Item ENRICHED_REDSTONE = registerItem("enriched_redstone",
            new Item(DEFAULT_SETTINGS));
    public static final Item ENRICHED_DIAMOND = registerItem("enriched_diamond",
            new Item(DEFAULT_SETTINGS));
    public static final Item ENRICHED_OBSIDIAN = registerItem("enriched_obsidian",
            new Item(DEFAULT_SETTINGS));
    public static final Item ENRICHED_GOLD = registerItem("enriched_gold",
            new Item(DEFAULT_SETTINGS));
    public static final Item ENRICHED_TIN = registerItem("enriched_tin",
            new Item(DEFAULT_SETTINGS));


    // Misc Items
    public static final Item HDPE_PELLET = registerItem("hdpe_pellet",
            new Item(DEFAULT_SETTINGS));
    public static final Item HDPE_ROD = registerItem("hdpe_rod",
            new Item(DEFAULT_SETTINGS));
    public static final Item HDPE_SHEET = registerItem("hdpe_sheet",
            new Item(DEFAULT_SETTINGS));
    public static final Item HDPE_STICK = registerItem("hdpe_stick",
            new Item(DEFAULT_SETTINGS));

    public static final Item ELECTROLYTIC_CORE = registerItem("electrolytic_core",
            new Item(DEFAULT_SETTINGS));
    public static final Item TELEPORTATION_CORE = registerItem("teleportation_core",
            new Item(DEFAULT_SETTINGS));

    public static final Item ANTIMATTER_PELLET = registerItem("antimatter_pellet",
            new Item(DEFAULT_SETTINGS));
    public static final Item PLUTONIUM_PELLET = registerItem("plutonium_pellet",
            new Item(DEFAULT_SETTINGS));
    public static final Item POLONIUM_PELLET = registerItem("polonium_pellet",
            new Item(DEFAULT_SETTINGS));
    public static final Item REPROCESSED_FISSILE_FRAGMENT = registerItem("reprocessed_fissile_fragment",
            new Item(DEFAULT_SETTINGS));

    public static final Item ENRICHED_IRON = registerItem("enriched_iron",
            new Item(DEFAULT_SETTINGS));
    public static final Item SAWDUST = registerItem("sawdust",
            new Item(DEFAULT_SETTINGS));
    public static final Item SALT = registerItem("salt",
            new Item(DEFAULT_SETTINGS));
    public static final Item SUBSTRATE = registerItem("substrate",
            new Item(DEFAULT_SETTINGS));
    public static final Item BIO_FUEL = registerItem("bio_fuel",
            new Item(DEFAULT_SETTINGS));
    public static final Item DYE_BASE = registerItem("dye_base",
            new Item(DEFAULT_SETTINGS));
    public static final Item FLUORITE = registerItem("fluorite",
            new Item(DEFAULT_SETTINGS));
    public static final Item YELLOW_CAKE_URANIUM = registerItem("yellow_cake_uranium",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_NETHERITE_SCRAP = registerItem("dirty_netherite_scrap",
            new Item(DEFAULT_SETTINGS));
}
