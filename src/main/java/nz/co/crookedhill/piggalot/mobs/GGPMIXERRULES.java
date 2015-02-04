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
package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nz.co.crookedhill.piggalot.item.GGPItem;

public class GGPMIXERRULES extends GGPMobNPC{
	
	ItemStack heldItem = new ItemStack(GGPItem.getItem("sword"));
	ItemStack headItem = new ItemStack(Item.helmetGold);

	public GGPMIXERRULES(World par1World) {
		super(par1World, "MIXERRULES");
		this.setCurrentItemOrArmor(0,heldItem);
		this.setCurrentItemOrArmor(4,headItem);
	}

	@Override
	protected int getDropItemId() {
		if(rand.nextFloat() <= 0.21f)
		{
			return rand.nextInt(1) > 0 ? heldItem.itemID : Item.helmetGold.itemID;
		}
		return 0;
	}

}
