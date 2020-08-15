package com.luminousdepths.luminousdepthsmod.client.entity.render;

import com.luminousdepths.luminousdepthsmod.client.entity.model.GorgeBeastModel;
import com.luminousdepths.luminousdepthsmod.entities.GorgeBeastEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GorgeBeastRenderer extends MobRenderer<GorgeBeastEntity, GorgeBeastModel> {

    public GorgeBeastRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GorgeBeastModel(), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(GorgeBeastEntity entity) {
        return new ResourceLocation("luminousdepths", "textures/entities/gorge_beast.png");
    }
}
