package com.oak1939.seasonalfestivities;

import com.oak1939.seasonalfestivities.entity.ModEntities;
import com.oak1939.seasonalfestivities.entity.client.ModModelLayers;
import com.oak1939.seasonalfestivities.entity.client.WispModel;
import com.oak1939.seasonalfestivities.entity.client.WispRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SeasonalFestivitiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.WISP, WispRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.WISP, WispModel::getTexturedModelData);
    }

}
