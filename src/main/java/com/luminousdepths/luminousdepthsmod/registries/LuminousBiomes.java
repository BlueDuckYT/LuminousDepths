package com.luminousdepths.luminousdepthsmod.registries;


import com.luminousdepths.luminousdepthsmod.Blocks.BlackSand;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.biomes.DeepReef;
import com.luminousdepths.luminousdepthsmod.biomes.SeaBasin;
import com.luminousdepths.luminousdepthsmod.biomes.VolcanicZone;
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
    public static final RegistryObject<Biome> VOLCANIC_ZONE = BIOMES.register("volcanic_zone", () -> new VolcanicZone());


    public static void init() {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static void registerBiomes() {
        registerBiome(SEA_BASIN.get(), BiomeManager.BiomeType.COOL, BiomeDictionary.Type.OCEAN);
        registerBiome(DEEP_REEF.get(), BiomeManager.BiomeType.WARM, BiomeDictionary.Type.OCEAN);
        registerBiome(VOLCANIC_ZONE.get(), BiomeManager.BiomeType.WARM, BiomeDictionary.Type.OCEAN);
    }
    public static void registerBiome(Biome biome, BiomeManager.BiomeType type, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        //BiomeManager.addSpawnBiome(biome);
        BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.oceanBiomes.add(biome);

    }

}
