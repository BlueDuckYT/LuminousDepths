package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.BlackSand;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.liquids.Brine;
import net.minecraft.block.Block;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.WaterFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminousLiquids  {

    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, LuminousDepthsMod.MODID);

    public static final RegistryObject<Fluid> BRINE = FLUIDS.register("brine", () -> new Brine.Source());
    public static final RegistryObject<Fluid> FLOWING_BRINE = FLUIDS.register("flowing_brine", () -> new Brine.Source());

    public static void init() {
        FLUIDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
