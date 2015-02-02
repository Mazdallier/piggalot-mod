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
package nz.co.crookedhill.piggalot.handler;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import nz.co.crookedhill.piggalot.item.GGPItem;

public class GGPPlayerhandler {
	@ForgeSubscribe
	public void PlayerEvent(PlayerEvent event) 
	{
		if (event.entityPlayer.getHeldItem() != null && event.entityPlayer.getHeldItem().itemID == GGPItem.multi.itemID) 
		{
			event.entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 1, false));
			event.entityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1, 1, false));
		}
	}
	@ForgeSubscribe
	public void climbingEvent(LivingUpdateEvent event)
	{
		//System.out.println("i climbed a ladder");
	}
}
