package com.luminousdepths.luminousdepthsmod.client.entity.render;

import com.luminousdepths.luminousdepthsmod.client.entity.model.GlowPufferGlowLayer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.PufferfishRenderer;
import net.minecraft.client.renderer.entity.layers.SpiderEyesLayer;
import net.minecraft.entity.passive.fish.PufferfishEntity;
import net.minecraft.util.ResourceLocation;

public class GlowPufferRenderer extends PufferfishRenderer {

    private static final ResourceLocation PUFFERFISH_TEXTURES = new ResourceLocation("luminousdepths:textures/entities/glow_puffer.png");

    public GlowPufferRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
        this.addLayer(new GlowPufferGlowLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(PufferfishEntity entity) {
        return PUFFERFISH_TEXTURES;
    }
}
