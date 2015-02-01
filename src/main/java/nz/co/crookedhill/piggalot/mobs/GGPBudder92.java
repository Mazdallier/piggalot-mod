package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GGPBudder92 extends GGPMobNPC {
	ItemStack heldItem = new ItemStack(Item.swordDiamond);

	public GGPBudder92(World par1World) {
		super(par1World, "Budder92");
	}

	@Override
	protected int getDropItemId() {
		return Item.ingotGold.itemID;
	}
	@Override
	public ItemStack getHeldItem()
	{
		return heldItem;
	}

}
