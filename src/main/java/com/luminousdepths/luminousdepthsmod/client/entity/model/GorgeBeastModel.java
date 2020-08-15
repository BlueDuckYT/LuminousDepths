package com.luminousdepths.luminousdepthsmod.client.entity.model;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.luminousdepths.luminousdepthsmod.entities.GorgeBeastEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GorgeBeastModel extends EntityModel<GorgeBeastEntity> {
    private final ModelRenderer head;
    private final ModelRenderer jaw;
    private final ModelRenderer bone2;
    private final ModelRenderer bone7;
    private final ModelRenderer bone6;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone5;
    private final ModelRenderer bone23;
    private final ModelRenderer bone24;
    private final ModelRenderer bone4;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone8;
    private final ModelRenderer bone9;
    private final ModelRenderer bone16;
    private final ModelRenderer bone15;
    private final ModelRenderer bone10;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone11;
    private final ModelRenderer bone20;
    private final ModelRenderer bone19;
    private final ModelRenderer bone12;
    private final ModelRenderer bone;
    private final ModelRenderer bone3;

    public GorgeBeastModel() {
        textureWidth = 256;
        textureHeight = 256;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 16.0F, -14.0F);
        head.setTextureOffset(0, 69).addBox(-10.0F, -14.0F, -28.0F, 20.0F, 17.0F, 28.0F, 0.0F, false);
        head.setTextureOffset(79, 123).addBox(-10.0F, 0.0F, -28.0F, 20.0F, 0.0F, 28.0F, 0.0F, false);

        jaw = new ModelRenderer(this);
        jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.addChild(jaw);
        jaw.setTextureOffset(96, 0).addBox(-10.0F, -1.0F, -28.0F, 20.0F, 6.0F, 28.0F, 0.0F, false);
        jaw.setTextureOffset(79, 123).addBox(-10.0F, 3.0F, -28.0F, 20.0F, 0.0F, 28.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone2.setTextureOffset(0, 0).addBox(-13.0F, -25.0F, -14.0F, 26.0F, 25.0F, 44.0F, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone7.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, -2.0944F);


        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone6.addChild(bone13);
        setRotationAngle(bone13, -0.2618F, 0.0F, -0.5236F);
        bone13.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, false);

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone6.addChild(bone14);
        setRotationAngle(bone14, -0.0873F, 0.0F, -0.5236F);
        bone14.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone7.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -1.0472F);


        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone5.addChild(bone23);
        setRotationAngle(bone23, -0.2618F, 0.0F, -0.5236F);
        bone23.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, false);

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone5.addChild(bone24);
        setRotationAngle(bone24, -0.0873F, 0.0F, -0.5236F);
        bone24.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone7.addChild(bone4);


        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone4.addChild(bone21);
        setRotationAngle(bone21, -0.2618F, 0.0F, -0.5236F);
        bone21.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, false);

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone4.addChild(bone22);
        setRotationAngle(bone22, -0.0873F, 0.0F, -0.5236F);
        bone22.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 24.0F, 0.0F);


        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone8.addChild(bone9);
        setRotationAngle(bone9, 0.0F, 0.0F, 2.0944F);


        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone9.addChild(bone16);
        setRotationAngle(bone16, -0.2618F, 0.0F, 0.5236F);
        bone16.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, true);

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone9.addChild(bone15);
        setRotationAngle(bone15, -0.0873F, 0.0F, 0.5236F);
        bone15.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, true);

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone8.addChild(bone10);
        setRotationAngle(bone10, 0.0F, 0.0F, 1.0472F);


        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone10.addChild(bone17);
        setRotationAngle(bone17, -0.2618F, 0.0F, 0.5236F);
        bone17.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, true);

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone10.addChild(bone18);
        setRotationAngle(bone18, -0.0873F, 0.0F, 0.5236F);
        bone18.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, true);

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, -13.0F, 27.0F);
        bone8.addChild(bone11);


        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone11.addChild(bone20);
        setRotationAngle(bone20, -0.2618F, 0.0F, 0.5236F);
        bone20.setTextureOffset(59, 77).addBox(-4.0F, 6.5911F, 3.1058F, 8.0F, 5.0F, 37.0F, 0.0F, true);

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone11.addChild(bone19);
        setRotationAngle(bone19, -0.0873F, 0.0F, 0.5236F);
        bone19.setTextureOffset(0, 114).addBox(-4.0F, 13.3764F, 37.7622F, 8.0F, 5.0F, 28.0F, 0.0F, true);

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(10.0F, 17.0F, 2.0F);
        setRotationAngle(bone12, 0.0F, -0.5236F, 0.7854F);
        bone12.setTextureOffset(112, 90).addBox(-2.7493F, -1.5858F, -8.9409F, 32.0F, 3.0F, 18.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-10.0F, 17.0F, 2.0F);
        setRotationAngle(bone, 0.0F, 0.5236F, -0.7854F);
        bone.setTextureOffset(112, 69).addBox(-29.2507F, -1.5858F, -8.9409F, 32.0F, 3.0F, 18.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, -2.0F, 19.0F);
        setRotationAngle(bone3, -0.5236F, 0.0F, 0.0F);
        bone3.setTextureOffset(0, 0).addBox(-1.0F, -4.7144F, -3.2641F, 2.0F, 8.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(GorgeBeastEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        bone2.render(matrixStack, buffer, packedLight, packedOverlay);
        bone7.render(matrixStack, buffer, packedLight, packedOverlay);
        bone8.render(matrixStack, buffer, packedLight, packedOverlay);
        bone12.render(matrixStack, buffer, packedLight, packedOverlay);
        bone.render(matrixStack, buffer, packedLight, packedOverlay);
        bone3.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}