package com.luminousdepths.luminousdepthsmod.registries;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class LuminousBlockTags extends BlockTags {

    public static final Tag<Block> DEEP_CORAL_BLOCKS = makeWrapperTag("luminousdepths:coral_blocks");
    public static final Tag<Block> DEEP_CORALS = makeWrapperTag("luminousdepths:corals");
    public static final Tag<Block> DEEP_WALL_CORALS = makeWrapperTag("luminousdepths:coral_fans");

    private static Tag<Block> makeWrapperTag(String id) {
        return new BlockTags.Wrapper(new ResourceLocation(id));
    }

}
