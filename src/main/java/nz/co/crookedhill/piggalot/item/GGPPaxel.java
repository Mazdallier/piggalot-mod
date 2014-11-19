package nz.co.crookedhill.piggalot.item;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.ForgeHooks;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPPaxel extends ItemPickaxe{
	
	public float efficiencyOnProperMaterial = Piggalot.pigtiteMaterial.getEfficiencyOnProperMaterial();
	private Block[] blocksEffectiveAgainst;

	protected GGPPaxel(int par1, float par2,
			EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock) {
		super(par1, par3EnumToolMaterial);
		this.setTextureName("piggalot:pigtite_paxel");
		this.blocksEffectiveAgainst = par4ArrayOfBlock;
		
	}
	@Override
	public float getStrVsBlock(ItemStack stack, Block block, int meta) 
    {
            return efficiencyOnProperMaterial;
        
    }

}
