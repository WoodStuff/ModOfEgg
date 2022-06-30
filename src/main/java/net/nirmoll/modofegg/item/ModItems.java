package net.nirmoll.modofegg.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nirmoll.modofegg.ModOfEgg;

public class ModItems
{
	// FRAGMENT
	public static final Item FRAGMENT = registerItem("fragment",
			new Item(new FabricItemSettings().group(ModItemGroup.EARLY_GAME)));

	public static final Item BASIC_MATTER = registerItem("basic_matter",
			new Item(new FabricItemSettings().group(ModItemGroup.EARLY_GAME)));



	private static Item registerItem(String name, Item item)
	{
		return Registry.register(Registry.ITEM, new Identifier(ModOfEgg.MOD_ID, name), item);
	}

	public static void registerModItems()
	{
		ModOfEgg.LOGGER.info("Registering items for " + ModOfEgg.MOD_ID);
	}
}
