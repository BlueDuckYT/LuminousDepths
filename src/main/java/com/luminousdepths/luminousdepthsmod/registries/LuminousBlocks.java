package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.*;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.WallOrFloorItem;
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

    //Black Sand
    public static final RegistryObject<Block> BLACK_SAND = BLOCKS.register("black_sand", BlackSand::new);
    public static final RegistryObject<Item> BLACK_SAND_ITEM = ITEMS.register("black_sand", () -> new BlockItemBase(BLACK_SAND.get()));

    public static final RegistryObject<Block> TUNGSTEN_DEPOSIT = BLOCKS.register("tungsten_deposit", () -> new LuminousBlockBase(BlockProperties.SAND));
    public static final RegistryObject<Item> TUNGSTEN_DEPOSIT_ITEM = ITEMS.register("tungsten_deposit", () -> new BlockItemBase(TUNGSTEN_DEPOSIT.get()));

    //Black Sandstone and variants
    public static final RegistryObject<Block> BLACK_SANDSTONE = BLOCKS.register("black_sandstone", () -> new Block(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_ITEM = ITEMS.register("black_sandstone", () -> new BlockItemBase(BLACK_SANDSTONE.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_SLAB = BLOCKS.register("black_sandstone_slab", () -> new LuminousSlabBase(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_SLAB_ITEM = ITEMS.register("black_sandstone_slab", () -> new BlockItemBase(BLACK_SANDSTONE_SLAB.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_WALL = BLOCKS.register("black_sandstone_wall", () -> new WallBlock(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_WALL_ITEM = ITEMS.register("black_sandstone_wall", () -> new BlockItemBase(BLACK_SANDSTONE_WALL.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_CHISELED = BLOCKS.register("black_sandstone_chiseled", () -> new Block(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_CHISELED_ITEM = ITEMS.register("black_sandstone_chiseled", () -> new BlockItemBase(BLACK_SANDSTONE_CHISELED.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_CUT = BLOCKS.register("black_sandstone_cut", () -> new Block(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_CUT_ITEM = ITEMS.register("black_sandstone_cut", () -> new BlockItemBase(BLACK_SANDSTONE_CUT.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_CUT_SLAB = BLOCKS.register("black_sandstone_cut_slab", () -> new LuminousSlabBase(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_CUT_SLAB_ITEM = ITEMS.register("black_sandstone_cut_slab", () -> new BlockItemBase(BLACK_SANDSTONE_CUT_SLAB.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_SMOOTH = BLOCKS.register("black_sandstone_smooth", () -> new Block(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_SMOOTH_ITEM = ITEMS.register("black_sandstone_smooth", () -> new BlockItemBase(BLACK_SANDSTONE_SMOOTH.get()));

    public static final RegistryObject<Block> BLACK_SANDSTONE_SMOOTH_SLAB = BLOCKS.register("black_sandstone_smooth_slab", () -> new LuminousSlabBase(BlockProperties.SANDSTONE));
    public static final RegistryObject<Item> BLACK_SANDSTONE_SMOOTH_SLAB_ITEM = ITEMS.register("black_sandstone_smooth_slab", () -> new BlockItemBase(BLACK_SANDSTONE_SMOOTH_SLAB.get()));


    //Tungsten
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", () -> new LuminousBlockBase(BlockProperties.METAL));
    public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));

    //Glow Rock
    public static final RegistryObject<Block> GLOW_ROCK = BLOCKS.register("glowrock", () -> new LuminousBlockBase(BlockProperties.LUMINOUSOBJECT));
    public static final RegistryObject<Item> GLOW_ROCK_ITEM = ITEMS.register("glowrock", () -> new BlockItemBase(GLOW_ROCK.get()));

    public static final RegistryObject<Block> HARDENED_BRINE = BLOCKS.register("hardened_brine", () -> new LuminousBlockBase(BlockProperties.LUMINOUSOBJECT));
    public static final RegistryObject<Item> HARDENED_BRINE_ITEM = ITEMS.register("hardened_brine", () -> new BlockItemBase(HARDENED_BRINE.get()));

    public static final RegistryObject<Block> CORALLINE_ALGAE_DEAD = BLOCKS.register("coralline_algae_dead", () -> new LuminousBlockBase(BlockProperties.SAND));
    public static final RegistryObject<Item> CORALLINE_ALGAE_DEAD_ITEM = ITEMS.register("coralline_algae_dead", () -> new BlockItemBase(CORALLINE_ALGAE_DEAD.get()));

    public static final RegistryObject<Block> CORALLINE_ALGAE = BLOCKS.register("coralline_algae", () -> new LuminousCoralBlockBase(CORALLINE_ALGAE_DEAD.get(), BlockProperties.ALGAE));
    public static final RegistryObject<Item> CORALLINE_ALGAE_ITEM = ITEMS.register("coralline_algae", () -> new BlockItemBase(CORALLINE_ALGAE.get()));


    //Dirty Cobblestone
    public static final RegistryObject<Block> DIRTY_COBBLESTONE = BLOCKS.register("dirty_cobblestone", () -> new LuminousBlockBase(BlockProperties.ROCK));
    public static final RegistryObject<Item> DIRTY_COBBLESTONE_ITEM = ITEMS.register("dirty_cobblestone", () -> new BlockItemBase(DIRTY_COBBLESTONE.get()));

    public static final RegistryObject<Block> MOLTENROCK = BLOCKS.register("moltenrock", () -> new LuminousBlockBase(BlockProperties.MOLTENROCK));
    public static final RegistryObject<Item> MOLTENROCK_ITEM = ITEMS.register("moltenrock", () -> new BlockItemBase(MOLTENROCK.get()));


    //Custom Corals
    public static final RegistryObject<Block> SEAFOAM_CORAL_DEAD = BLOCKS.register("seafoam_coral_dead", () -> new LuminousBlockBase(BlockProperties.CORAL));
    public static final RegistryObject<Block> SEAFOAM_CORAL = BLOCKS.register("seafoam_coral", () -> new LuminousCoralBlockBase(SEAFOAM_CORAL_DEAD.get(), BlockProperties.CORAL.lightValue(9)));
    public static final RegistryObject<Block> SEAFOAM_CORAL_FAN_DEAD = BLOCKS.register("seafoam_coral_fan_dead", () -> new LuminousDeadCoralFanBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> SEAFOAM_CORAL_FAN = BLOCKS.register("seafoam_coral_fan", () -> new LuminousCoralFanBase(SEAFOAM_CORAL_FAN_DEAD.get(), BlockProperties.CORAL.lightValue(9).doesNotBlockMovement()));
    public static final RegistryObject<Block> SEAFOAM_CORAL_FAN_TOP_DEAD = BLOCKS.register("seafoam_coral_fan_top_dead", () -> new LuminousDeadCoralFanTopBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> SEAFOAM_CORAL_FAN_TOP = BLOCKS.register("seafoam_coral_fan_top", () -> new LuminousCoralFanTopBase(SEAFOAM_CORAL_FAN_TOP_DEAD.get(), BlockProperties.CORAL.doesNotBlockMovement()));
    public static final RegistryObject<Block> SEAFOAM_CORAL_TOP_DEAD = BLOCKS.register("seafoam_coral_top_dead", () -> new LuminousDeadCoralBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> SEAFOAM_CORAL_TOP = BLOCKS.register("seafoam_coral_top", () -> new LuminousCoralBase(SEAFOAM_CORAL_TOP_DEAD.get(), BlockProperties.CORAL.lightValue(9).doesNotBlockMovement()));

    public static final RegistryObject<Item> SEAFOAM_CORAL_ITEM = ITEMS.register("seafoam_coral", () -> new BlockItemBase(SEAFOAM_CORAL.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> SEAFOAM_CORAL_DEAD_ITEM = ITEMS.register("seafoam_coral_dead", () -> new BlockItemBase(SEAFOAM_CORAL_DEAD.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

   public static final RegistryObject<Item> SEAFOAM_CORAL_TOP_ITEM = ITEMS.register("seafoam_coral_top", () -> new BlockItemBase(SEAFOAM_CORAL_TOP.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
   public static final RegistryObject<Item> SEAFOAM_CORAL_TOP_DEAD_ITEM = ITEMS.register("seafoam_coral_top_dead", () -> new BlockItemBase(SEAFOAM_CORAL_TOP_DEAD.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> SEAFOAM_CORAL_FAN_ITEM = ITEMS.register("seafoam_coral_fan", () -> new WallOrFloorItem(SEAFOAM_CORAL_FAN_TOP.get(), SEAFOAM_CORAL_FAN.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> SEAFOAM_CORAL_FAN_DEAD_ITEM = ITEMS.register("seafoam_coral_fan_dead", () -> new WallOrFloorItem(SEAFOAM_CORAL_FAN_TOP_DEAD.get(), SEAFOAM_CORAL_FAN_DEAD.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Block> GLOW_CORAL_DEAD = BLOCKS.register("glow_coral_dead", () -> new LuminousBlockBase(BlockProperties.CORAL));
    public static final RegistryObject<Block> GLOW_CORAL = BLOCKS.register("glow_coral", () -> new LuminousCoralBlockBase(GLOW_CORAL_DEAD.get(), BlockProperties.CORAL.lightValue(15)));
    public static final RegistryObject<Block> GLOW_CORAL_FAN_DEAD = BLOCKS.register("glow_coral_fan_dead", () -> new LuminousDeadCoralFanBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> GLOW_CORAL_FAN = BLOCKS.register("glow_coral_fan", () -> new LuminousCoralFanBase(GLOW_CORAL_FAN_DEAD.get(), BlockProperties.CORAL.doesNotBlockMovement()));
    public static final RegistryObject<Block> GLOW_CORAL_FAN_TOP_DEAD = BLOCKS.register("glow_coral_fan_top_dead", () -> new LuminousDeadCoralFanTopBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> GLOW_CORAL_FAN_TOP = BLOCKS.register("glow_coral_fan_top", () -> new LuminousCoralFanTopBase(GLOW_CORAL_FAN_TOP_DEAD.get(), BlockProperties.CORAL.doesNotBlockMovement()));
    public static final RegistryObject<Block> GLOW_CORAL_TOP_DEAD = BLOCKS.register("glow_coral_top_dead", () -> new LuminousDeadCoralBase(BlockProperties.ROCK.doesNotBlockMovement()));
    public static final RegistryObject<Block> GLOW_CORAL_TOP = BLOCKS.register("glow_coral_top", () -> new LuminousCoralBase(GLOW_CORAL_TOP_DEAD.get(), BlockProperties.CORAL.doesNotBlockMovement()));

    public static final RegistryObject<Item> GLOW_CORAL_ITEM = ITEMS.register("glow_coral", () -> new BlockItemBase(GLOW_CORAL.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GLOW_CORAL_DEAD_ITEM = ITEMS.register("glow_coral_dead", () -> new BlockItemBase(GLOW_CORAL_DEAD.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> GLOW_CORAL_TOP_ITEM = ITEMS.register("glow_coral_top", () -> new BlockItemBase(GLOW_CORAL_TOP.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GLOW_CORAL_TOP_DEAD_ITEM = ITEMS.register("glow_coral_top_dead", () -> new BlockItemBase(GLOW_CORAL_TOP_DEAD.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));

    public static final RegistryObject<Item> GLOW_CORAL_FAN_ITEM = ITEMS.register("glow_coral_fan", () -> new WallOrFloorItem(GLOW_CORAL_FAN_TOP.get(), SEAFOAM_CORAL_FAN.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> GLOW_CORAL_FAN_DEAD_ITEM = ITEMS.register("glow_coral_fan_dead", () -> new WallOrFloorItem(GLOW_CORAL_FAN_TOP_DEAD.get(), GLOW_CORAL_FAN_DEAD.get(), (new Item.Properties()).group(ItemGroup.DECORATIONS)));




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
