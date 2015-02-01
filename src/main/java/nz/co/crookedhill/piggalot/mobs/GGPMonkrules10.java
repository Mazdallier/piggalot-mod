package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GGPMonkrules10 extends GGPMobNPC {
	ItemStack heldItem = new ItemStack(Item.swordDiamond);

	public GGPMonkrules10(World par1World) {
		super(par1World, "Monkrules10");
	}

	@Override
	protected int getDropItemId() {
		return Item.diamond.itemID;
	}
	@Override
	public ItemStack getHeldItem()
	{
		return heldItem;
	}
}
