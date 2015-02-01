/*
 * Copyright (c) 2014, William <w.cameron@crookedhill.co.nz>
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package nz.co.crookedhill.piggalot.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.ConfigManager;
import nz.co.crookedhill.piggalot.Piggalot;

public class GGPItem {
	public static Item pigtite;
	public static Item axe;
	public static Item shovel;
	public static Item pickaxe;
	public static Item hoe;
	public static Item sword;
	public static Item multi;
	
	public static Item helmet;
	public static Item chestplate;
	public static Item leggings;
	public static Item boots;
	
	
	public static void init() {
		pigtite = new GGPPigtite(ConfigManager.pigtite).setUnlocalizedName("ITEM_PIGTITE").setCreativeTab(Piggalot.piggalottab);
		axe = new GGPAxe(ConfigManager.axe, Piggalot.pigtiteMaterial).setUnlocalizedName("ITEM_PIGTITE_AXE").setCreativeTab(Piggalot.piggalottab);
		shovel = new GGPShovel(ConfigManager.shovel, Piggalot.pigtiteMaterial).setUnlocalizedName("ITEM_PIGTITE_SHOVEL").setCreativeTab(Piggalot.piggalottab);
		pickaxe = new GGPPickaxe(ConfigManager.pickaxe, Piggalot.pigtiteMaterial).setUnlocalizedName("ITEM_PIGTITE_PICKAXE").setCreativeTab(Piggalot.piggalottab);
		hoe = new GGPHoe(ConfigManager.hoe, Piggalot.pigtiteMaterial).setUnlocalizedName("ITEM_PIGTITE_HOE").setCreativeTab(Piggalot.piggalottab);
		sword = new GGPSword(ConfigManager.sword, Piggalot.pigtiteMaterial).setUnlocalizedName("ITEM_PIGTITE_SWORD").setCreativeTab(Piggalot.piggalottab);
		
		multi = new GGPPaxel(ConfigManager.multi, 0, Piggalot.pigtiteMaterial, Block.blocksList).setUnlocalizedName("ITEM_PIGTITE_PAXEL").setCreativeTab(Piggalot.piggalottab);
		
		helmet = new GGUArmor(ConfigManager.helmet,Piggalot.pigtiteAMaterial,5,0).setUnlocalizedName("PIGTITE_HELMET").setCreativeTab(Piggalot.piggalottab);
		chestplate = new GGUArmor(ConfigManager.chestplate,Piggalot.pigtiteAMaterial,5,1).setUnlocalizedName("PIGTITE_CHESTPLATE").setCreativeTab(Piggalot.piggalottab);
		leggings = new GGUArmor(ConfigManager.leggings,Piggalot.pigtiteAMaterial,5,2).setUnlocalizedName("PIGTITE_LEGGINGS").setCreativeTab(Piggalot.piggalottab);
		boots = new GGUArmor(ConfigManager.boots,Piggalot.pigtiteAMaterial,5,3).setUnlocalizedName("PIGTITE_BOOTS").setCreativeTab(Piggalot.piggalottab);
		
		GameRegistry.registerItem(pigtite, pigtite.getUnlocalizedName());
		GameRegistry.registerItem(axe, axe.getUnlocalizedName());
		GameRegistry.registerItem(shovel, shovel.getUnlocalizedName());
		GameRegistry.registerItem(pickaxe, pickaxe.getUnlocalizedName());
		GameRegistry.registerItem(hoe, hoe.getUnlocalizedName());
		GameRegistry.registerItem(sword, sword.getUnlocalizedName());
		GameRegistry.registerItem(multi, multi.getUnlocalizedName());
		
		LanguageRegistry.addName(pigtite, "Pigtite");
		LanguageRegistry.addName(axe, "Can I Axe you a question?");
		LanguageRegistry.addName(shovel, "Dave's Shovel");
		LanguageRegistry.addName(pickaxe, "Jo10Trot's Mine'O'Matic");
		LanguageRegistry.addName(hoe, "Gnomorian's Garden Tool");
		LanguageRegistry.addName(sword, "Defender of Piggalot");
		LanguageRegistry.addName(multi, "MLG paxel for noscopeing");
		
		LanguageRegistry.addName(helmet, "Pigtite Helmet");
		LanguageRegistry.addName(chestplate, "Pigtite Chestplate");
		LanguageRegistry.addName(leggings, "Pigtite Leggings");
		LanguageRegistry.addName(boots, "Pigtite Boots");
		
		
		GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"ppp"," s "," s ",'p',pigtite,'s',Item.stick});
		GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"pp ","ps "," s ",'p',pigtite,'s',Item.stick});
		GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" p "," s "," s ",'p',pigtite,'s',Item.stick});
		GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"pp "," s "," s ",'p',pigtite,'s',Item.stick});
		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" p "," p "," s ",'p',pigtite,'s',Item.stick});
		
		ItemStack craftMultitool = new ItemStack(multi);
		craftMultitool.addEnchantment(Enchantment.fortune, 2);
		GameRegistry.addRecipe(craftMultitool, new Object[] {"ash","dpe","rvg",'a',axe,'s',sword,'h',hoe,
			'd',Block.blockDiamond,'p',pickaxe,'e',Block.blockEmerald,'r',Block.blockRedstone,'v',shovel,'g',Block.blockGold});
		
		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] {"ppp","p p",'p',pigtite});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] {"p p","ppp","ppp",'p',pigtite});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] {"ppp","p p","p p",'p',pigtite});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] {"p p","p p",'p',pigtite});
	}
}
