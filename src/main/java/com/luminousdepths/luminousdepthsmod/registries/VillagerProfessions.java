package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.biomes.DeepReef;
import com.luminousdepths.luminousdepthsmod.biomes.SeaBasin;
import com.luminousdepths.luminousdepthsmod.biomes.VolcanicZone;
import net.minecraft.block.Blocks;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VillagerProfessions {

    public static final DeferredRegister<VillagerProfession> PROFESSIONS = new DeferredRegister<>(ForgeRegistries.PROFESSIONS, LuminousDepthsMod.MODID);

    //public static final RegistryObject<Biome> DEEP_SEA_FISHERMAN = PROFESSIONS.register(new VillagerProfession("deep_sea_fisherman", new PointOfInterestType("deep_sea_fisherman", LuminousBlocks.GLOW_ROCK.get().getDefaultState(), 1, 1)));


}
