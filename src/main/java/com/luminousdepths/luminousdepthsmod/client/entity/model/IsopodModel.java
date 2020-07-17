package com.luminousdepths.luminousdepthsmod.client.entity.model;// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.luminousdepths.luminousdepthsmod.entities.IsopodEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class IsopodModel extends EntityModel<IsopodEntity> {
	private final ModelRenderer body;
	private final ModelRenderer unknown_bone;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer head;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer body2;

	public IsopodModel() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 21.0F, 6.0F);
		

		unknown_bone = new ModelRenderer(this);
		unknown_bone.setRotationPoint(0.0F, 3.0F, -6.0F);
		body.addChild(unknown_bone);
		unknown_bone.setTextureOffset(35, 35).addBox(2.0F, -1.0F, -14.0F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		unknown_bone.setTextureOffset(17, 34).addBox(-11.0F, -1.0F, -14.0F, 9.0F, 0.0F, 4.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 3.0F, -6.0F);
		body.addChild(bone);
		bone.setTextureOffset(0, 24).addBox(-8.0F, -2.0F, 8.0F, 16.0F, 0.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(0, 34).addBox(-4.0F, -4.0F, -12.0F, 8.0F, 4.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-7.0F, -6.0F, -8.0F, 14.0F, 6.0F, 18.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(7.0F, 2.0F, -11.0F);
		body.addChild(bone2);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-7.0F, 2.0F, -11.0F);
		body.addChild(bone3);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 3.0F, -6.0F);
		body.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.1745F);
		bone4.setTextureOffset(0, 0).addBox(1.4958F, -0.5519F, -10.6009F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(6.5511F, -1.3036F, 6.6732F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(5.7699F, -1.1299F, 5.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(5.7699F, -1.1299F, 2.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(5.7699F, -1.1299F, -1.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(5.7699F, -1.1299F, -4.0F, 5.0F, 0.0F, 2.0F, 0.0F, false);
		bone4.setTextureOffset(0, 0).addBox(6.5661F, -1.3036F, -5.8442F, 5.0F, 0.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 3.0F, -6.0F);
		body.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.1745F);
		bone5.setTextureOffset(0, 0).addBox(-6.4958F, -0.5519F, -10.6009F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-11.5511F, -1.3036F, 6.6732F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-10.7699F, -1.1299F, 5.0F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-10.7699F, -1.1299F, 2.0F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-10.7699F, -1.1299F, -1.0F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-10.7699F, -1.1299F, -4.0F, 5.0F, 0.0F, 2.0F, 0.0F, true);
		bone5.setTextureOffset(0, 0).addBox(-11.5661F, -1.3036F, -5.8442F, 5.0F, 0.0F, 2.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 19.0F, -10.0F);
		

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(3.5F, 22.0F, 11.0F);
		

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.5F, 22.0F, 11.0F);
		

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(5.0F, 21.0F, -4.0F);
		

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-5.0F, 21.0F, -4.0F);
		

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 21.0F, 6.0F);
		
	}

	@Override
	public void setRotationAngles(IsopodEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		bone4.rotateAngleZ = MathHelper.sin(ageInTicks) * 0.1f;
		bone5.rotateAngleZ = MathHelper.sin(ageInTicks) * -0.1f;
		unknown_bone.rotateAngleX = MathHelper.sin(limbSwing) * 0.2f;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}