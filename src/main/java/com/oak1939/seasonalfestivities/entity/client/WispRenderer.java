package com.oak1939.seasonalfestivities.entity.client;

import com.oak1939.seasonalfestivities.entity.custom.WispEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static com.oak1939.seasonalfestivities.SeasonalFestivities.MOD_ID;

public class WispRenderer extends MobEntityRenderer<WispEntity, WispModel<WispEntity>> {
    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/entity/wisp.png");

    public WispRenderer(EntityRendererFactory.Context context) {
        super(context, new WispModel<>(context.getPart(ModModelLayers.WISP)), 0.6f);
    }

    @Override
    public Identifier getTexture(WispEntity entity) {
        return TEXTURE;
    }
}
