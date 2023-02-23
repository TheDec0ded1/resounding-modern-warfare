package com.vicmatskiv.mw.creativetab;

import com.vicmatskiv.mw.wearables.Bullets;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AmmoTab extends CreativeTabs {

	public AmmoTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack getTabIconItem() {
		return new ItemStack(Bullets.Bullet556x45);
	}
}
