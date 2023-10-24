package com.oak1939.seasonalfestivities.entity.client;

import com.oak1939.seasonalfestivities.entity.custom.WispEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class WispModel<T extends WispEntity> extends SinglePartEntityModel<T> {
	private final ModelPart wisp;

	public WispModel(ModelPart root) {
		this.wisp = root.getChild("wisp");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData wisp = modelPartData.addChild("wisp", ModelPartBuilder.create().uv(0, 0).cuboid(-4.5F, -4.5F, -4.5F, 9.0F, 9.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 15.9F, 0.0F));

		ModelPartData legs = wisp.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.1F, 0.0F));

		ModelPartData legl_r1 = legs.addChild("legl_r1", ModelPartBuilder.create().uv(0, 18).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(2.5F, 0.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData legr_r1 = legs.addChild("legr_r1", ModelPartBuilder.create().uv(0, 18).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.1745F));

		ModelPartData arms = wisp.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 4.1F, 0.0F));

		ModelPartData arml_r1 = arms.addChild("arml_r1", ModelPartBuilder.create().uv(2, 19).cuboid(0.0F, -0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		ModelPartData armr_r1 = arms.addChild("armr_r1", ModelPartBuilder.create().uv(2, 18).cuboid(-4.25F, -0.5F, 0.0F, 4.5F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.25F, -5.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		wisp.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return wisp;
	}

	@Override
	public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}