package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.LuminousBlockBase;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.entities.GlowPufferEntity;
import com.luminousdepths.luminousdepthsmod.entities.GorgeBeastEntity;
import com.luminousdepths.luminousdepthsmod.entities.IsopodEntity;
import com.luminousdepths.luminousdepthsmod.features.DeepCoralMushroomFeature;
import com.luminousdepths.luminousdepthsmod.features.DeepCoralTreeFeature;
import com.luminousdepths.luminousdepthsmod.items.LuminousFishBucket;
import com.luminousdepths.luminousdepthsmod.items.LuminousSpawnEgg;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
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

import java.util.function.Supplier;

public class LuminousEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES = new DeferredRegister<>(ForgeRegistries.ENTITIES, LuminousDepthsMod.MODID);


    public static final RegistryObject<EntityType<IsopodEntity>> ISOPOD = ENTITIES.register("isopod", () -> EntityType.Builder.<IsopodEntity>create(IsopodEntity::new, EntityClassification.WATER_CREATURE).size(1.0F, 0.5F).build(new ResourceLocation("luminousdepths", "isopod").toString()));

    public static final RegistryObject<EntityType<GlowPufferEntity>> GLOWPUFFER = ENTITIES.register("glow_puffer", () -> EntityType.Builder.<GlowPufferEntity>create(GlowPufferEntity::new, EntityClassification.WATER_CREATURE).size(0.4F, 0.4F).build(new ResourceLocation("luminousdepths", "glow_puffer").toString()));
    public static final RegistryObject<EntityType<GorgeBeastEntity>> GORGE_BEAST = ENTITIES.register("gorge_beast", () -> EntityType.Builder.<GorgeBeastEntity>create(GorgeBeastEntity::new, EntityClassification.WATER_CREATURE).size(5.0F, 1.2F).build(new ResourceLocation("luminousdepths", "gorge_beast").toString()));



    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LuminousDepthsMod.MODID);

    public static final RegistryObject<Item> ISOPOD_SPAWN_EGG = ITEMS.register("isopod_spawn_egg", () -> new LuminousSpawnEgg(() -> ISOPOD.get(),11022961, 11035249, new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> ISOPOD_BUCKET = ITEMS.register("isopod_bucket", () -> new LuminousFishBucket(() -> ISOPOD.get(), new Item.Properties().group(ItemGroup.MISC)));


    public static final RegistryObject<Item> GLOW_PUFFER_SPAWN_EGG = ITEMS.register("glow_puffer_spawn_egg", () -> new LuminousSpawnEgg(() -> GLOWPUFFER.get(),3612, 14225045, new Item.Properties().group(ItemGroup.MISC)));


    public LuminousEntities() {
        super();
    }

    public static void init() {
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}
