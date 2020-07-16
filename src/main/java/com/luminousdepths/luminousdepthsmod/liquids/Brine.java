package com.luminousdepths.luminousdepthsmod.liquids;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class Brine extends WaterFluid {
    @Override
    public boolean isSource(IFluidState state) {
        return false;
    }

    @Override
    public int getLevel(IFluidState p_207192_1_) {
        return 0;
    }

    public Fluid getFlowingFluid() {
        return Fluids.FLOWING_WATER;
    }

    public Fluid getStillFluid() {
        return Fluids.WATER;
    }

    public Item getFilledBucket() {
        return Items.WATER_BUCKET;
    }

}
