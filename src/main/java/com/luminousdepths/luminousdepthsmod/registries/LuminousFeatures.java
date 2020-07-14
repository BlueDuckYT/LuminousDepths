package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.features.DeepCoralTreeFeature;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;
import java.util.function.Function;

public class LuminousFeatures extends net.minecraftforge.registries.ForgeRegistryEntry<Feature<?>> {

    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, LuminousDepthsMod.MODID);

    public static final RegistryObject<Feature<NoFeatureConfig>> DEEP_CORAL_TREE = FEATURES.register("deep_coral_tree", () -> new DeepCoralTreeFeature(NoFeatureConfig::deserialize));
    //public static final Feature<NoFeatureConfig> DEEP_CORAL_MUSHROOM = register("deep_coral_mushroom", new CoralMushroomFeature(NoFeatureConfig::deserialize));
    //public static final Feature<NoFeatureConfig> DEEP_CORAL_CLAW = register("deep_coral_claw", new CoralClawFeature(NoFeatureConfig::deserialize));

    public LuminousFeatures() {
        super();
    }

    public static void init() {
        FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, key, value));
    }


}
