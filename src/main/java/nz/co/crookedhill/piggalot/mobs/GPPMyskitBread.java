package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.world.World;

public class GPPMyskitBread extends GGPMobNPC{

	public GPPMyskitBread(World par1World) {
		super(par1World, "MyskitBread");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getDropItemId() {
		return Item.Bread.itemID;
	}

}
