package com.luminousdepths.luminousdepthsmod.client.entity.render;

import com.luminousdepths.luminousdepthsmod.client.entity.model.IsopodModel;
import com.luminousdepths.luminousdepthsmod.entities.IsopodEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class IsopodRenderer extends MobRenderer<IsopodEntity, IsopodModel> {

    public IsopodRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new IsopodModel(), 0.9F);
    }

    @Override
    public ResourceLocation getEntityTexture(IsopodEntity entity) {
        return new ResourceLocation("luminousdepths", "textures/entities/isopod.png");
    }
}
