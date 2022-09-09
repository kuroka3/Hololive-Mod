package io.github.kurokami.hololive;

import io.github.kurokami.hololive.block.ModBlocks;
import io.github.kurokami.hololive.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class hololive implements ModInitializer {
	public static final String MOD_ID = "hololive";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
