package com.luminousdepths.luminousdepthsmod.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.FishBucketItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class LuminousFishBucket extends FishBucketItem {
    Supplier<? extends EntityType<?>> type;
    public LuminousFishBucket(Supplier<? extends EntityType<?>> typeIn,  Properties builder) {
        super(null, Fluids.WATER, builder);
        type = typeIn;
    }


    public void placeFish(World worldIn, ItemStack p_205357_2_, BlockPos pos) {
        Entity entity = this.type.get().spawn(worldIn, p_205357_2_, null, pos, SpawnReason.BUCKET, true, false);
        if (entity != null) {
            ((AbstractFishEntity)entity).setFromBucket(true);
        }

    }

    @Override
    protected EntityType<?> getFishType() {
        return type.get();
    }


}
