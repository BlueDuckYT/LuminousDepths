package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.LuminousBlockBase;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.entities.IsopodEntity;
import com.luminousdepths.luminousdepthsmod.features.DeepCoralMushroomFeature;
import com.luminousdepths.luminousdepthsmod.features.DeepCoralTreeFeature;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.DeepCoralClawFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminousEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, LuminousDepthsMod.MODID);

    public static final RegistryObject<EntityType<IsopodEntity>> ISOPOD = ENTITIES.register("isopod", () -> EntityType.Builder.<IsopodEntity>create(IsopodEntity::new, EntityClassification.WATER_CREATURE).size(1.0F, 0.5F).build(new ResourceLocation("luminousdepths", "isopod").toString()));




    public LuminousEntities() {
        super();
    }

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}
