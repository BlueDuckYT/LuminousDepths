package com.luminousdepths.luminousdepthsmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.PufferfishEntity;
import net.minecraft.world.World;

public class GlowPufferEntity extends PufferfishEntity {
    public GlowPufferEntity(EntityType<? extends PufferfishEntity> type, World worldIn) {
        super(type, worldIn);
    }
}
