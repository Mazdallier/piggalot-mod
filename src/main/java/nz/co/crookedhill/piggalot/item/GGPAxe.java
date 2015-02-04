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

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPAxe extends ItemAxe{

	public GGPAxe(int par1, EnumToolMaterial pigtiteMaterial) {
		super(par1, pigtiteMaterial);
		this.setTextureName("piggalot:pigtite_axe");
		this.setUnlocalizedName("ITEM_PIGTITE_AXE");
		this.setCreativeTab(Piggalot.piggalottab);
	}
}
