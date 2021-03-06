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

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPBacon extends ItemFood
{
	static int healAmount = 0;
	static int saturation = 20;
	static boolean wolfEats = true;
	public GGPBacon(int id) {
		super(id, healAmount, saturation, wolfEats);
		this.setAlwaysEdible();
		this.setTextureName("piggalot:food_bacon");
		this.setCreativeTab(Piggalot.piggalottab);
		this.setUnlocalizedName("ITEM_PIGTITE_BACON");
	}
	
	@Override
	public ItemStack onEaten(ItemStack ItemStack, World World, EntityPlayer EntityPlayer)
    {
        --ItemStack.stackSize;
        EntityPlayer.getFoodStats().addStats(this);
        World.playSoundAtEntity(EntityPlayer, "random.burp", 0.5F, World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(ItemStack, World, EntityPlayer);
        EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 2000, 1, false));
        EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 2000, 2, false));
        return ItemStack;
    }
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		par3List.add("Dave the pig: Plz don't eat me");
	}
}