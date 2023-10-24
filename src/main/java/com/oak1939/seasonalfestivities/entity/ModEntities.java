package com.oak1939.seasonalfestivities.entity;

import com.oak1939.seasonalfestivities.SeasonalFestivities;
import com.oak1939.seasonalfestivities.entity.custom.WispEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static com.oak1939.seasonalfestivities.SeasonalFestivities.MOD_ID;

public class ModEntities {
    public static final EntityType<WispEntity> WISP = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(MOD_ID, "wisp"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, WispEntity::new)
                    .dimensions(EntityDimensions.fixed(0.57f, 0.8f)).build());

    public static void registerMobs() {
        SeasonalFestivities.LOGGER.info(String.format("Registering %s for %s","Mod Entities",MOD_ID));

        FabricDefaultAttributeRegistry.register(ModEntities.WISP, WispEntity.createWispAttributes());
    }
}
