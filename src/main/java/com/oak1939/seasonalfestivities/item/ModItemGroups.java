package com.oak1939.seasonalfestivities.item;

import com.oak1939.seasonalfestivities.SeasonalFestivities;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.oak1939.seasonalfestivities.SeasonalFestivities.MOD_ID;

public class ModItemGroups {
    public static final ItemGroup HALLOWEEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MOD_ID, "halloween"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.seasonalfestivities.halloween"))
                    .icon(() -> new ItemStack(Items.JACK_O_LANTERN)).entries((displayContext, entries) -> {
                        entries.add(Items.PUMPKIN);
                        entries.add(Items.CARVED_PUMPKIN);
                        entries.add(Items.JACK_O_LANTERN);
                        entries.add(Items.SOUL_LANTERN);
                        entries.add(ModItems.CANDYCORN);
                    }).build());

    public static void registerItemGroups() {
        SeasonalFestivities.LOGGER.info(String.format("Registering %s for %s","Mod Items Groups",MOD_ID));
    }
}
