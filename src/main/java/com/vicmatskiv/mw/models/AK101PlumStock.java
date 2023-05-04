// Made with Blockbench 3.9.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


public class AK101Stock extends EntityModel<Entity> {
	private final ModelRenderer gun233;
	private final ModelRenderer gun234;
	private final ModelRenderer gun235;
	private final ModelRenderer gun236;
	private final ModelRenderer gun237;
	private final ModelRenderer gun238;
	private final ModelRenderer gun239;
	private final ModelRenderer gun240;
	private final ModelRenderer gun241;
	private final ModelRenderer gun242;
	private final ModelRenderer gun243;
	private final ModelRenderer gun244;
	private final ModelRenderer gun245;
	private final ModelRenderer gun348;
	private final ModelRenderer gun349;
	private final ModelRenderer gun365;
	private final ModelRenderer gun366;

	public AK101Stock() {
		textureWidth = 85;
		textureHeight = 85;

		gun233 = new ModelRenderer(this);
		gun233.setRotationPoint(-3.5F, -10.9F, 3.5F);
		setRotationAngle(gun233, -0.1859F, 0.0F, 0.0F);
		gun233.setTextureOffset(0, 0).addBox(0.001F, 0.0F, 0.0F, 4.0F, 4.0F, 27.0F, 0.0F, false);

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-3.0F, -11.9F, 3.5F);
		setRotationAngle(gun234, -0.1859F, 0.0F, 0.0F);
		gun234.setTextureOffset(0, 54).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 11.0F, 0.0F, false);

		gun235 = new ModelRenderer(this);
		gun235.setRotationPoint(-3.5F, -8.3F, 8.5F);
		setRotationAngle(gun235, 0.4833F, 0.0F, 0.0F);
		gun235.setTextureOffset(10, 17).addBox(-0.001F, 0.0F, 2.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		gun236 = new ModelRenderer(this);
		gun236.setRotationPoint(-3.0F, -9.2F, 8.5F);
		setRotationAngle(gun236, 0.4833F, 0.0F, 0.0F);
		gun236.setTextureOffset(10, 10).addBox(-0.001F, 0.0F, 0.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		gun237 = new ModelRenderer(this);
		gun237.setRotationPoint(-3.0F, -11.5F, 12.95F);
		setRotationAngle(gun237, -0.0129F, 0.0F, 0.0F);
		gun237.setTextureOffset(26, 36).addBox(0.0F, 0.0F, 0.0F, 3.0F, 2.0F, 18.0F, 0.0F, false);

		gun238 = new ModelRenderer(this);
		gun238.setRotationPoint(-3.5F, -10.6F, 12.75F);
		setRotationAngle(gun238, -0.0129F, 0.0F, 0.0F);
		gun238.setTextureOffset(0, 31).addBox(0.0F, 0.0F, 0.0F, 4.0F, 5.0F, 18.0F, 0.0F, false);

		gun239 = new ModelRenderer(this);
		gun239.setRotationPoint(-3.5F, -9.6F, 3.5F);
		setRotationAngle(gun239, -0.2231F, 0.0F, 0.0F);
		gun239.setTextureOffset(50, 31).addBox(-0.001F, 2.0F, 0.0F, 4.0F, 1.0F, 11.0F, 0.0F, false);

		gun240 = new ModelRenderer(this);
		gun240.setRotationPoint(-3.5F, -5.7F, 26.4F);
		setRotationAngle(gun240, -0.1115F, 0.0F, 0.0F);
		gun240.setTextureOffset(0, 0).addBox(0.002F, -1.0F, 0.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		gun241 = new ModelRenderer(this);
		gun241.setRotationPoint(-3.5F, 0.1F, 28.6F);
		setRotationAngle(gun241, -0.1115F, 0.0F, 0.0F);
		gun241.setTextureOffset(14, 22).addBox(0.001F, -1.0F, 0.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		gun242 = new ModelRenderer(this);
		gun242.setRotationPoint(-2.9F, -9.9F, 30.8F);
		setRotationAngle(gun242, -0.0873F, 0.0F, 0.0F);
		gun242.setTextureOffset(0, 23).addBox(0.0F, -1.3008F, 0.0174F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		gun243 = new ModelRenderer(this);
		gun243.setRotationPoint(-3.4F, -8.9F, 29.7F);
		setRotationAngle(gun243, -0.0873F, 0.0F, 0.0F);
		gun243.setTextureOffset(0, 10).addBox(0.0F, -1.0996F, -0.0087F, 3.0F, 11.0F, 2.0F, 0.0F, false);

		gun244 = new ModelRenderer(this);
		gun244.setRotationPoint(-0.6F, -8.9F, 29.7F);
		setRotationAngle(gun244, -0.0873F, 0.0F, 0.0F);
		gun244.setTextureOffset(21, 0).addBox(0.0F, -1.0996F, -0.008F, 1.0F, 11.0F, 2.0F, 0.0F, false);

		gun245 = new ModelRenderer(this);
		gun245.setRotationPoint(-1.1F, -9.9F, 30.8F);
		setRotationAngle(gun245, -0.0873F, 0.0F, 0.0F);
		gun245.setTextureOffset(10, 10).addBox(0.0F, -1.301F, 0.018F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		gun348 = new ModelRenderer(this);
		gun348.setRotationPoint(-0.4F, -8.6F, 7.5F);
		setRotationAngle(gun348, -0.1859F, 0.0F, 0.0F);
		gun348.setTextureOffset(12, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		gun349 = new ModelRenderer(this);
		gun349.setRotationPoint(-0.1F, -9.5F, 8.5F);
		setRotationAngle(gun349, -0.1859F, 0.0F, 0.0F);
		gun349.setTextureOffset(0, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-2.5F, -12.0F, 3.5F);
		setRotationAngle(gun365, -0.1859F, 0.0F, 0.0F);
		gun365.setTextureOffset(6, 22).addBox(0.0F, 0.0F, 0.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-3.5F, -7.6F, 12.5F);
		setRotationAngle(gun366, -0.3346F, 0.0F, 0.0F);
		gun366.setTextureOffset(35, 0).addBox(-0.002F, 0.0F, 0.0F, 4.0F, 3.0F, 18.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		gun233.render(matrixStack, buffer, packedLight, packedOverlay);
		gun234.render(matrixStack, buffer, packedLight, packedOverlay);
		gun235.render(matrixStack, buffer, packedLight, packedOverlay);
		gun236.render(matrixStack, buffer, packedLight, packedOverlay);
		gun237.render(matrixStack, buffer, packedLight, packedOverlay);
		gun238.render(matrixStack, buffer, packedLight, packedOverlay);
		gun239.render(matrixStack, buffer, packedLight, packedOverlay);
		gun240.render(matrixStack, buffer, packedLight, packedOverlay);
		gun241.render(matrixStack, buffer, packedLight, packedOverlay);
		gun242.render(matrixStack, buffer, packedLight, packedOverlay);
		gun243.render(matrixStack, buffer, packedLight, packedOverlay);
		gun244.render(matrixStack, buffer, packedLight, packedOverlay);
		gun245.render(matrixStack, buffer, packedLight, packedOverlay);
		gun348.render(matrixStack, buffer, packedLight, packedOverlay);
		gun349.render(matrixStack, buffer, packedLight, packedOverlay);
		gun365.render(matrixStack, buffer, packedLight, packedOverlay);
		gun366.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}