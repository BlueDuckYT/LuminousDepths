package com.luminousdepths.luminousdepthsmod.biomes;

import com.google.common.collect.Lists;
import com.luminousdepths.luminousdepthsmod.registries.LuminousBlocks;
import com.luminousdepths.luminousdepthsmod.registries.LuminousEntities;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class SeaBasin extends Biome {

    public SeaBasin() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRAVEL_CONFIG).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-1.9F).scale(0.1F).temperature(0.5F).downfall(0.5F).waterColor(3099551).waterFogColor(3099479).parent((String)null));

        this.addStructure(Feature.OCEAN_MONUMENT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(LuminousBlocks.HARDENED_BRINE.get().getDefaultState(), 3, 2, Lists.newArrayList(Blocks.GRAVEL.getDefaultState()))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));


        this.addSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(EntityType.SQUID, 1, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.DROWNED, 5, 1, 1));

    }

    public void addCreatureSpawn(EntityClassification classification, Biome.SpawnListEntry entry) {
        this.addSpawn(classification, entry);
    }

}
