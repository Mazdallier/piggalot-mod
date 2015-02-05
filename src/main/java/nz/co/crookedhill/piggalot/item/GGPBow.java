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

import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPBow extends ItemBow 
{

	public GGPBow(int par1) 
	{
		super(par1);
		this.setCreativeTab(Piggalot.piggalottab);
		this.setUnlocalizedName("ITEM_PIGTITE_BOW");
		this.setTextureName("piggalot:food_bacon");
	}
	@Override
	public int getDamage(ItemStack itemstack)
	{
		return 10;
	}
}
