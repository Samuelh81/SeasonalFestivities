package com.oak1939.item;

import com.oak1939.SeasonalFestivities;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.oak1939.SeasonalFestivities.MOD_ID;

public class ModItems {
    // Static items go here

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        SeasonalFestivities.LOGGER.info(String.format("Registering %s for %s","Mod Items",MOD_ID));
    }
}
