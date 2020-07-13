package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.BlackSand;
import com.luminousdepths.luminousdepthsmod.Blocks.BlockItemBase;
import com.luminousdepths.luminousdepthsmod.Blocks.LuminousBlockBase;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nullable;

public class LuminousBlocks { //implements IForgeRegistryEntry {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, LuminousDepthsMod.MODID);
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LuminousDepthsMod.MODID);

    public static final RegistryObject<Block> BLACK_SAND = BLOCKS.register("black_sand", BlackSand::new);
    public static final RegistryObject<Item> BLACK_SAND_ITEM = ITEMS.register("black_sand", () -> new BlockItemBase(BLACK_SAND.get()));
    public static final RegistryObject<Block> GLOW_ROCK = BLOCKS.register("glowrock", () -> new LuminousBlockBase(BlockProperties.ROCK));
    public static final RegistryObject<Item> GLOW_ROCK_ITEM = ITEMS.register("glowrock", () -> new BlockItemBase(GLOW_ROCK.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE = BLOCKS.register("black_sandstone", () -> new Block(BlockProperties.SANDSTONE));

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    public Object setRegistryName(ResourceLocation name) {
        return null;
    }

    @Nullable
    public ResourceLocation getRegistryName() {
        return null;
    }

    public Class getRegistryType() {
        return null;
    }
}
