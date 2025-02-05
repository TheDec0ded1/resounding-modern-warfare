// Date: 2/18/2019 6:18:31 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WhiteDeskMiddle extends ModelBase
{
  //fields
    ModelRenderer desk1;
  
  public WhiteDeskMiddle()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      desk1 = new ModelRenderer(this, 0, 0);
      desk1.addBox(0F, 0F, 0F, 16, 2, 13);
      desk1.setRotationPoint(-8F, 8F, -5F);
      desk1.setTextureSize(128, 128);
      desk1.mirror = true;
      setRotation(desk1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    desk1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
