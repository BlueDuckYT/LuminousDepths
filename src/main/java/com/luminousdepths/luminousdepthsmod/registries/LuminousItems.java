package com.luminousdepths.luminousdepthsmod.registries;

import com.luminousdepths.luminousdepthsmod.Blocks.BlockItemBase;
import com.luminousdepths.luminousdepthsmod.Blocks.ItemBase;
import com.luminousdepths.luminousdepthsmod.LuminousDepthsMod;
import com.luminousdepths.luminousdepthsmod.entities.IsopodEntity;
import com.luminousdepths.luminousdepthsmod.liquids.Brine;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class LuminousItems {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, LuminousDepthsMod.MODID);

    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ESCA = ITEMS.register("esca", () -> new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> ISOCARAPACE = ITEMS.register("isocarapace", () -> new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CORALLINE_ALGAE_GROWTH = ITEMS.register("coralline_algae_growth", () -> new ItemBase(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ISOPOD_SPAWN_EGG = ITEMS.register("isopod_spawn_egg", () -> new SpawnEggItem(LuminousEntities.ISOPOD.get(),11022961, 11035249, new Item.Properties().group(ItemGroup.MATERIALS)));



    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

}
