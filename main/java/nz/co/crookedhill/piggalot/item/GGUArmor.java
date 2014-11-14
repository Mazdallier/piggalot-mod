package nz.co.crookedhill.piggalot.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.ConfigManager;

public class GGUArmor extends ItemArmor{

	public GGUArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		if(par1==ConfigManager.helmet)
			this.setTextureName("piggalot:pigtite_helmet");
		if(par1==ConfigManager.chestplate)
			this.setTextureName("piggalot:pigtite_chestplate");
		if(par1==ConfigManager.boots)
			this.setTextureName("piggalot:pigtite_boots");
		if(par1==ConfigManager.leggings)
			this.setTextureName("piggalot:pigtite_leggings");
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
			if (stack.itemID == GGPItem.helmet.itemID
			|| stack.itemID == GGPItem.chestplate.itemID
			|| stack.itemID == GGPItem.boots.itemID) {
			return "piggalot:textures/armor/PigtiteArmor_1.png";
			}
			if (stack.itemID == GGPItem.leggings.itemID) {
			return "piggalot:textures/armor/PigtiteArmor_2.png";
			} else {
			return null;
			}

			}

}
