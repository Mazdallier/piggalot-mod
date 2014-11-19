package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;

public class GGPGnomorian extends GGPMobNPC {

	public GGPGnomorian(World par1World) {
		super(par1World, "Gnomorian");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getDropItemId() {
		// TODO Auto-generated method stub
		return Block.blockSnow.blockID;
	}

}
