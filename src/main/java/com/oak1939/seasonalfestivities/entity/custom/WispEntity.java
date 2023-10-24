package com.oak1939.seasonalfestivities.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.world.World;

import static com.oak1939.seasonalfestivities.util.Util.ALLAY_SPEED;

public class WispEntity extends AllayEntity {

    public WispEntity(EntityType<? extends AllayEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        super.initGoals();
    }

    public static DefaultAttributeContainer.Builder createWispAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, ALLAY_SPEED)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0d)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, ALLAY_SPEED)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0d)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 48.0d);
    }




}
