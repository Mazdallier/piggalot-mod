/*
 *  Copyright 2015 William Cameron
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package nz.co.crookedhill.piggalot.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.ConfigManager;
import nz.co.crookedhill.piggalot.Piggalot;

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
		this.setCreativeTab(Piggalot.piggalottab);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
		if (stack.itemID == ConfigManager.helmet
				|| stack.itemID == ConfigManager.chestplate
				|| stack.itemID == ConfigManager.boots) {
			return "piggalot:textures/armor/PigtiteArmor_1.png";
		}
		if (stack.itemID == ConfigManager.leggings) {
			return "piggalot:textures/armor/PigtiteArmor_2.png";
		} else {
			return null;
		}

	}

}
