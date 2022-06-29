package net.nirmoll.modofegg;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModOfEgg implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modofegg");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
