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

public class GGPMonkrules10 extends GGPMobNPC {
	ItemStack heldItem = new ItemStack(Item.swordGold);

	public GGPMonkrules10(World par1World) {
		super(par1World, "Monkrules10");
		this.setCurrentItemOrArmor(0,heldItem);
	}

	@Override
	protected int getDropItemId() {
		return Item.diamond.itemID;
	}
	@Override
	public ItemStack getHeldItem()
	{
		return heldItem;
	}
	@Override
	protected void dropFewItems(boolean byPlayer, int lootingLevel)
	{
		if(byPlayer)
		{
			int drop = this.getDropItemId();
			if(drop != 0)
			this.dropItem(drop, 1);
		}
	}
}
