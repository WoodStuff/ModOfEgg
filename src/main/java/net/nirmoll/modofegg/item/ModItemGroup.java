package net.nirmoll.modofegg.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nirmoll.modofegg.ModOfEgg;
import net.nirmoll.modofegg.block.ModBlocks;

public class ModItemGroup
{
	public static final ItemGroup EARLY_GAME = FabricItemGroupBuilder.build(new Identifier(ModOfEgg.MOD_ID, "earlygame"),
			() -> new ItemStack(ModItems.FRAGMENT));

	public static final ItemGroup MINING = FabricItemGroupBuilder.build(new Identifier(ModOfEgg.MOD_ID, "mining"),
			() -> new ItemStack(ModBlocks.SHADOWSTONE.asItem()));
}
