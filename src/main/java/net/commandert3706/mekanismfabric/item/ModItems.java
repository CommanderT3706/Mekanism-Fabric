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


    // Dusts
    public static final Item BRONZE_DUST = registerItem("bronze_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item LAPIS_LAZULI_DUST = registerItem("lapis_lazuli_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item CHARCOAL_DUST = registerItem("charcoal_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item QUARTZ_DUST = registerItem("quartz_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item EMERALD_DUST = registerItem("emerald_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIAMOND_DUST = registerItem("diamond_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item NETHERITE_DUST = registerItem("netherite_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item STEEL_DUST = registerItem("steel_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item SULFUR_DUST = registerItem("sulfur_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item LITHIUM_DUST = registerItem("lithium_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item REFINED_OBSIDIAN_DUST = registerItem("refined_obsidian_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item OBSIDIAN_DUST = registerItem("obsidian_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item FLUORITE_DUST = registerItem("fluorite_dust",
            new Item(DEFAULT_SETTINGS));


    // Ingots
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item REFINED_OBSIDIAN_INGOT = registerItem("refined_obsidian_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item REFINED_GLOWSTONE_INGOT = registerItem("refined_glowstone_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(DEFAULT_SETTINGS));


    // Nuggets
    public static final Item REFINED_OBSIDIAN_NUGGET = registerItem("refined_obsidian_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item REFINED_GLOWSTONE_NUGGET = registerItem("refined_glowstone_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget",
            new Item(DEFAULT_SETTINGS));


    // Shards
    public static final Item IRON_SHARD = registerItem("iron_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item GOLD_SHARD = registerItem("gold_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item OSMIUM_SHARD = registerItem("osmium_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item COPPER_SHARD = registerItem("copper_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_SHARD = registerItem("tin_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_SHARD = registerItem("lead_shard",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_SHARD = registerItem("uranium_shard",
            new Item(DEFAULT_SETTINGS));


    // Crystals
    public static final Item IRON_CRYSTAL = registerItem("iron_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item GOLD_CRYSTAL = registerItem("gold_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item OSMIUM_CRYSTAL = registerItem("osmium_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item COPPER_CRYSTAL = registerItem("copper_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_CRYSTAL = registerItem("tin_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_CRYSTAL = registerItem("lead_crystal",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_CRYSTAL = registerItem("uranium_crystal",
            new Item(DEFAULT_SETTINGS));


    // Metal Dusts
    public static final Item IRON_DUST = registerItem("iron_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item GOLD_DUST = registerItem("gold_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item OSMIUM_DUST = registerItem("osmium_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item COPPER_DUST = registerItem("copper_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_DUST = registerItem("tin_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_DUST = registerItem("lead_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_DUST = registerItem("uranium_dust",
            new Item(DEFAULT_SETTINGS));


    // Dirty Dusts
    public static final Item DIRTY_IRON_DUST = registerItem("dirty_iron_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_GOLD_DUST = registerItem("dirty_gold_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_OSMIUM_DUST = registerItem("dirty_osmium_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_COPPER_DUST = registerItem("dirty_copper_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_TIN_DUST = registerItem("dirty_tin_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_LEAD_DUST = registerItem("dirty_lead_dust",
            new Item(DEFAULT_SETTINGS));
    public static final Item DIRTY_URANIUM_DUST = registerItem("dirty_uranium_dust",
            new Item(DEFAULT_SETTINGS));


    // Clumps
    public static final Item IRON_CLUMP = registerItem("iron_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item GOLD_CLUMP = registerItem("gold_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item OSMIUM_CLUMP = registerItem("osmium_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item COPPER_CLUMP = registerItem("copper_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_CLUMP = registerItem("tin_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_CLUMP = registerItem("lead_clump",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_CLUMP = registerItem("uranium_clump",
            new Item(DEFAULT_SETTINGS));


    // Metal Ingots
    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(DEFAULT_SETTINGS));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(DEFAULT_SETTINGS));


    // Raw Metals
    public static final Item RAW_OSMIUM = registerItem("raw_osmium",
            new Item(DEFAULT_SETTINGS));
    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(DEFAULT_SETTINGS));
    public static final Item RAW_LEAD = registerItem("raw_lead",
            new Item(DEFAULT_SETTINGS));
    public static final Item RAW_URANIUM = registerItem("raw_uranium",
            new Item(DEFAULT_SETTINGS));
}
