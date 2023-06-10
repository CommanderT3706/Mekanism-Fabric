package net.commandert3706.mekanismfabric.item;

import net.commandert3706.mekanismfabric.MekanismFabric;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MEKANISM = FabricItemGroupBuilder.build(
            new Identifier(MekanismFabric.MOD_ID, "mekanism"), () -> new ItemStack(ModItems.ATOMIC_ALLOY));
}
