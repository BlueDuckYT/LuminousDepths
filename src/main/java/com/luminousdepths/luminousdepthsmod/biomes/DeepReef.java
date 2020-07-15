package com.luminousdepths.luminousdepthsmod.biomes;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.luminousdepths.luminousdepthsmod.registries.LuminousBlocks;
import com.luminousdepths.luminousdepthsmod.registries.LuminousFeatures;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.SingleRandomFeature;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class DeepReef extends Biome {

    public DeepReef() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.SAND_CONFIG).precipitation(RainType.RAIN).category(Category.OCEAN).depth(-1.99F).scale(0.3F).temperature(0.5F).downfall(0.5F).waterColor(20383).waterFogColor(000030).parent((String)null));

        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);

        //this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(LuminousBlocks.HARDENED_BRINE.get().getDefaultState(), 3, 2, Lists.newArrayList(Blocks.GRAVEL.getDefaultState()))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));


        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 1, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.DROWNED, 5, 1, 1));
    }

}
