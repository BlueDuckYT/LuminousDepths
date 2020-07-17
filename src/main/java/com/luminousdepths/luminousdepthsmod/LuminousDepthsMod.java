package com.luminousdepths.luminousdepthsmod;

import com.google.common.collect.ImmutableList;
import com.luminousdepths.luminousdepthsmod.biomes.DeepReef;
import com.luminousdepths.luminousdepthsmod.biomes.SeaBasin;
import com.luminousdepths.luminousdepthsmod.client.entity.render.IsopodRenderer;
import com.luminousdepths.luminousdepthsmod.registries.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.EntityClassification;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.BlockBlobConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.SingleRandomFeature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidWithNoiseConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("luminousdepths")
public class LuminousDepthsMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static String MODID = "luminousdepths";

    public LuminousDepthsMod() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
       // FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        //LuminousBlocks.BLOCKS.register(bus);
        LuminousFeatures.init();
        LuminousBlocks.init();
        LuminousBiomes.init();
        LuminousLiquids.init();
        LuminousItems.init();
        LuminousEntities.init();


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        bus.addListener(this::setup);




    }



    private void setup(final FMLCommonSetupEvent event)
    {
        LuminousBiomes.DEEP_REEF.get().addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.SIMPLE_RANDOM_SELECTOR.withConfiguration(new SingleRandomFeature(ImmutableList.of(LuminousFeatures.DEEP_CORAL_TREE.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG), LuminousFeatures.DEEP_CORAL_CLAW.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG), LuminousFeatures.DEEP_CORAL_MUSHROOM.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)))).withPlacement(Placement.TOP_SOLID_HEIGHTMAP_NOISE_BIASED.configure(new TopSolidWithNoiseConfig(20, 400.0D, 0.0D, Heightmap.Type.OCEAN_FLOOR_WG))));
        LuminousBiomes.DEEP_REEF.get().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(LuminousBlocks.GLOW_ROCK.get().getDefaultState(), 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(2))));
        LuminousBiomes.DEEP_REEF.get().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(LuminousBlocks.CORALLINE_ALGAE.get().getDefaultState(), 0)).withPlacement(Placement.DARK_OAK_TREE.configure(new NoPlacementConfig())));

        LuminousBiomes.VOLCANIC_ZONE.get().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(LuminousBlocks.TUNGSTEN_DEPOSIT.get().getDefaultState(), 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(2))));
        LuminousBiomes.VOLCANIC_ZONE.get().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(LuminousBlocks.MOLTENROCK.get().getDefaultState(), 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(2))));
        LuminousBiomes.VOLCANIC_ZONE.get().addFeature(GenerationStage.Decoration.LOCAL_MODIFICATIONS, Feature.FOREST_ROCK.withConfiguration(new BlockBlobConfig(Blocks.OBSIDIAN.getDefaultState(), 0)).withPlacement(Placement.FOREST_ROCK.configure(new FrequencyConfig(3))));

        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_FAN.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_FAN_TOP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_FAN_DEAD.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_FAN_TOP_DEAD.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_TOP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(LuminousBlocks.SEAFOAM_CORAL_TOP_DEAD.get(), RenderType.getCutout());

        RenderingRegistry.registerEntityRenderingHandler(LuminousEntities.ISOPOD.get(), manager -> new IsopodRenderer(manager));

        ((SeaBasin)LuminousBiomes.SEA_BASIN.get()).addCreatureSpawn(EntityClassification.WATER_CREATURE, new Biome.SpawnListEntry(LuminousEntities.ISOPOD.get(), 5, 1, 1));

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("luminousdepths", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, modid = "luminousdepths")
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
        @SubscribeEvent
        public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
            LuminousBiomes.registerBiomes();
        }
    }
}
