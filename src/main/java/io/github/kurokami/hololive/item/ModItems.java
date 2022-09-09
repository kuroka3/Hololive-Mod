package io.github.kurokami.hololive.item;

import io.github.kurokami.hololive.hololive;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item HOLOLIVE_PRODUCTION_LOGO = registerItem("hololive_production_logo",
            new Item(new FabricItemSettings().group(ModItemGroup.HOLOLIVE)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(hololive.MOD_ID, name), item);
    }


    public static void registerModItems() {
        hololive.LOGGER.debug("REGISTERING mod items for " + hololive.MOD_ID);
    }
}
