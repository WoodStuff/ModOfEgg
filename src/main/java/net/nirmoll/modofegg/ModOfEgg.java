package net.nirmoll.modofegg;

import net.fabricmc.api.ModInitializer;
import net.nirmoll.modofegg.block.ModBlocks;
import net.nirmoll.modofegg.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModOfEgg implements ModInitializer
{
	public static final String MOD_ID = "modofegg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
