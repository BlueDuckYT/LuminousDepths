package com.luminousdepths.luminousdepthsmod.Blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block p_i48527_1_) {
        super(p_i48527_1_, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
    public BlockItemBase(Block p_i48527_1_, Item.Properties properties) {
        super(p_i48527_1_, properties);
    }
}
