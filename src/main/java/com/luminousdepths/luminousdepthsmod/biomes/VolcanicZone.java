package com.luminousdepths.luminousdepthsmod.biomes;

import com.luminousdepths.luminousdepthsmod.registries.LuminousBlocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class VolcanicZone extends Biome {

    public VolcanicZone() {
        super((new Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(LuminousBlocks.BLACK_SAND.get().getDefaultState(), LuminousBlocks.BLACK_SAND.get().getDefaultState(), LuminousBlocks.BLACK_SAND.get().getDefaultState())).precipitation(RainType.RAIN).category(Category.OCEAN).depth(-1.9F).scale(0.7F).temperature(0.5F).downfall(0.5F).waterColor(3104968).waterFogColor(3093055).parent((String)null));

        DefaultBiomeFeatures.addOceanCarvers(this);
        DefaultBiomeFeatures.addStructures(this);

        //this.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.DISK.withConfiguration(new SphereReplaceConfig(LuminousBlocks.HARDENED_BRINE.get().getDefaultState(), 3, 2, Lists.newArrayList(Blocks.GRAVEL.getDefaultState()))).withPlacement(Placement.COUNT_TOP_SOLID.configure(new FrequencyConfig(1))));


        this.addSpawn(EntityClassification.WATER_CREATURE, new SpawnListEntry(EntityType.SQUID, 1, 1, 1));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.DROWNED, 5, 1, 1));
    }

}
