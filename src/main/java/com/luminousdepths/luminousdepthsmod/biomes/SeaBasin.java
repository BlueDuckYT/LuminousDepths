package com.luminousdepths.luminousdepthsmod.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class SeaBasin extends Biome {

    public SeaBasin() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRAVEL_CONFIG).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(-2.6F).scale(0.1F).temperature(0.5F).downfall(0.5F).waterColor(65280).waterFogColor(329011).parent((String)null));

        this.addStructure(Feature.OCEAN_MONUMENT.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);
        DefaultBiomeFeatures.addOres(this);

        this.addSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(EntityType.SQUID, 1, 1, 1));
    }

}
