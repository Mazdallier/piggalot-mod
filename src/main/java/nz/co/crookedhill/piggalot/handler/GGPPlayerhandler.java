package nz.co.crookedhill.piggalot.handler;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import nz.co.crookedhill.piggalot.item.GGPItem;

public class GGPPlayerhandler {
	@ForgeSubscribe
	public void PlayerEvent(PlayerEvent event) {
		System.out.println("iv been called");
		if (event.entityPlayer.getHeldItem().itemID == GGPItem.pickaxe.itemID) {
			event.entityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1, 1, false));
		}
	}
	@ForgeSubscribe
	public void climbingEvent(LivingUpdateEvent event){
		System.out.println("i climbed a ladder");
	}
}
