package com.luminousdepths.luminousdepthsmod.entities;

import com.luminousdepths.luminousdepthsmod.registries.LuminousEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class IsopodEntity extends AbstractFishEntity {
    public IsopodEntity(EntityType<? extends AbstractFishEntity> type, World worldIn) {
        super(type, worldIn);
    }



    @Override
    protected ItemStack getFishBucket() {
        return new ItemStack(LuminousEntities.ISOPOD_BUCKET.get());
    }

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }


    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
    }



}
