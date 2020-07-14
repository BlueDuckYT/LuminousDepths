package com.luminousdepths.luminousdepthsmod.registries;


import com.luminousdepths.luminousdepthsmod.Blocks.BlackSand;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.biomes.DeepReef;
import com.luminousdepths.luminousdepthsmod.biomes.SeaBasin;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminousBiomes {

    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, LuminousDepthsMod.MODID);

    public static final RegistryObject<Biome> SEA_BASIN = BIOMES.register("sea_basin", () -> new SeaBasin());
    public static final RegistryObject<Biome> DEEP_REEF = BIOMES.register("deep_reef", () -> new DeepReef());


    public static void init() {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void registerBiomes() {
        registerBiome(SEA_BASIN.get(), BiomeDictionary.Type.OCEAN);
        registerBiome(DEEP_REEF.get(), BiomeDictionary.Type.OCEAN);
    }
    public static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        //BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 20));

    }

}
