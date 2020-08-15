package com.luminousdepths.luminousdepthsmod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.world.World;

public class GorgeBeastEntity extends WaterMobEntity {
    public GorgeBeastEntity(EntityType<? extends WaterMobEntity> type, World worldIn) {
        super(type, worldIn);
    }




    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
    }




}
