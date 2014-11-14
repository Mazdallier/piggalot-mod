package nz.co.crookedhill.piggalot.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class GGPSword extends ItemSword {

	public GGPSword(int par1, EnumToolMaterial pigtiteMaterial) {
		super(par1, pigtiteMaterial);
		this.setTextureName("piggalot:pigtite_sword");
	}
}
