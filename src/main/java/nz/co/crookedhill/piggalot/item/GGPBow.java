package nz.co.crookedhill.piggalot.item;

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class GGPBow extends ItemBow {

	public GGPBow(int par1) {
		super(par1);
	}
	@Override
	public int getDamage(ItemStack itemstack)
	{
		return 10;
	}
}
