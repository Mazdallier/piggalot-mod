package nz.co.crookedhill.piggalot.item;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class GGPShovel extends ItemSpade{

	public GGPShovel(int par1, EnumToolMaterial pigtiteMaterial) {
		super(par1, pigtiteMaterial);
		this.setTextureName("piggalot:pigtite_shovel");
	}
}
