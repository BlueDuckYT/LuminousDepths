package com.luminousdepths.luminousdepthsmod.Blocks;

import com.luminousdepths.luminousdepthsmod.registries.BlockProperties;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.material.Material;

public class BlackSand extends FallingBlock {
    public BlackSand(Properties p_i48401_1_) {
        super(p_i48401_1_);
    }
    public BlackSand() {
        super(BlockProperties.SAND);
    }
}
