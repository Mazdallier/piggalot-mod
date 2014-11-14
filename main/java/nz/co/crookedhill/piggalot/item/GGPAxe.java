package nz.co.crookedhill.piggalot.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class GGPAxe extends ItemAxe{

	public GGPAxe(int par1, EnumToolMaterial pigtiteMaterial) {
		super(par1, pigtiteMaterial);
		this.setTextureName("piggalot:pigtite_axe");
	}
}
