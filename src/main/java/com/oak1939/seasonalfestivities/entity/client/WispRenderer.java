package com.oak1939.seasonalfestivities.entity.client;

import com.oak1939.seasonalfestivities.entity.custom.WispEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

import static com.oak1939.seasonalfestivities.SeasonalFestivities.MOD_ID;

public class WispRenderer extends MobEntityRenderer<WispEntity, WispModel<WispEntity>> {
    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/entity/wisp.png");

    public WispRenderer(EntityRendererFactory.Context context) {
        super(context, new WispModel<>(context.getPart(ModModelLayers.WISP)), 0.4f);
    }

    @Override
    public void render(WispEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.scale(0.75f, 0.75f, 0.75f);
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Override
    public Identifier getTexture(WispEntity entity) {
        return TEXTURE;
    }
}
