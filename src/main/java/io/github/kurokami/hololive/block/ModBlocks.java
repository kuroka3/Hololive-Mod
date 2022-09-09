package io.github.kurokami.hololive.block;

import io.github.kurokami.hololive.hololive;
import io.github.kurokami.hololive.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block HOLOLIVE_BLOCK = registerBlock("hololive_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f)), ModItemGroup.HOLOLIVE);

    public static final Block HOLOLIVE_ORE = registerBlock("hololive_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(2f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.HOLOLIVE);

    public static final Block DEEPSLATE_HOLOLIVE_ORE = registerBlock("deepslate_hololive_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.HOLOLIVE);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(hololive.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(hololive.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        hololive.LOGGER.debug("Registering ModBlocks for " + hololive.MOD_ID);
    }
}
