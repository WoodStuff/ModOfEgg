package net.nirmoll.modofegg.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nirmoll.modofegg.ModOfEgg;
import net.nirmoll.modofegg.item.ModItemGroup;

public class ModBlocks
{
	// FRAGMENT BLOCK
	public static final Block FRAGMENT_BLOCK = registerBlock("fragment_block",
			new Block(FabricBlockSettings.of(Material.STONE)
					.hardness(1f)
					.resistance(4.5f)
			), ModItemGroup.EARLY_GAME);

	// TUFFROCK
	public static final Block TUFFROCK = registerBlock("tuffrock",
			new Block(FabricBlockSettings.of(Material.STONE)
					.hardness(3f)
					.resistance(48f)
					.requiresTool()
			), ModItemGroup.MINING);

	// SHADOWSTONE
	public static final Block SHADOWSTONE = registerBlock("shadowstone",
			new Block(FabricBlockSettings.of(Material.STONE)
					.hardness(4.5f)
					.resistance(128f)
					.requiresTool()
			), ModItemGroup.MINING);



	private static Block registerBlock(String name, Block block, ItemGroup group)
	{
		registerBlockItem(name, block, group);
		return Registry.register(Registry.BLOCK, new Identifier(ModOfEgg.MOD_ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block, ItemGroup group)
	{
		return Registry.register(Registry.ITEM, new Identifier(ModOfEgg.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(group)));
	}

	public static void registerModBlocks()
	{
		ModOfEgg.LOGGER.info("Registering blocks for " + ModOfEgg.MOD_ID);
	}
}
