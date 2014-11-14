package nz.co.crookedhill.piggalot.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.client.renderer.texture.IconRegister;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPOrePigtite extends BlockOre{

	public GGPOrePigtite(int par1) {
		super(par1);
		this.setCreativeTab(Piggalot.piggalottab);
		this.setTextureName("piggalot:block_pigtite");
	}
	public int quantityDropped(Random random)
	{
	return 1;
	}
	public int idDropped(int par1, Random par2Random, int par3)
	{
	return GGPBlock.pigtiteore.blockID;
	}
}
