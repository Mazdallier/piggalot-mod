package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.item.Item;
import net.minecraft.world.World;

public class GGPMIXERRULES extends GGPMobNPC{

	public GGPMIXERRULES(World par1World) {
		super(par1World, "MIXERRULES");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getDropItemId() {
		// TODO Auto-generated method stub
		return Item.beefCooked.itemID;
	}

}
