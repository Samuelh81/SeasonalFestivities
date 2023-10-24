package com.oak1939.seasonalfestivities.sound;

import com.oak1939.seasonalfestivities.SeasonalFestivities;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import static com.oak1939.seasonalfestivities.SeasonalFestivities.MOD_ID;

public class ModSounds {
    // Static sounds go here

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        SeasonalFestivities.LOGGER.info(String.format("Registering %s for %s","Mod Sounds",MOD_ID));
    }
}
