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

import java.util.HashMap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.ConfigManager;
import nz.co.crookedhill.piggalot.Piggalot;
import nz.co.crookedhill.piggalot.mobs.GGPBudder92;
import nz.co.crookedhill.piggalot.mobs.GGPGnomorian;
import nz.co.crookedhill.piggalot.mobs.GGPJo10Trot;
import nz.co.crookedhill.piggalot.mobs.GGPMIXERRULES;
import nz.co.crookedhill.piggalot.mobs.GGPMonkrules10;
import nz.co.crookedhill.piggalot.mobs.GGPdomonator12;
import nz.co.crookedhill.piggalot.mobs.GGPfameblue;
import nz.co.crookedhill.piggalot.mobs.GGPrducey99;
import nz.co.crookedhill.piggalot.mobs.GPPMyskitBread;
import nz.co.crookedhill.piggalot.mobs.GPPVinbullet;

public class GGPItem {
	private static HashMap<String, Item> itemMap = new HashMap();
	
	public static void init() {
		
		addItem(new String[] {"pigtite", "Pigtite"}, new GGPPigtite(ConfigManager.pigtite));
		addItem(new String[] {"axe", "Can I Axe you a question?"}, new GGPAxe(ConfigManager.axe, Piggalot.pigtiteMaterial), new Object[] {"pp ","ps "," s ",'p',getItem("pigtite"),'s',Item.stick});
		addItem(new String[] {"shovel", "Dave's Shovel"}, new GGPShovel(ConfigManager.shovel, Piggalot.pigtiteMaterial), new Object[] {" p "," s "," s ",'p',getItem("pigtite"),'s',Item.stick});
		addItem(new String[] {"pickaxe", "Jo10Trot's Mine'O'Matic"}, new GGPPickaxe(ConfigManager.pickaxe, Piggalot.pigtiteMaterial), new Object[] {"ppp"," s "," s ",'p',getItem("pigtite"),'s',Item.stick});
		addItem(new String[] {"hoe", "Gnomorian's Garden Tool"}, new GGPHoe(ConfigManager.hoe, Piggalot.pigtiteMaterial), new Object[] {"pp "," s "," s ",'p',getItem("pigtite"),'s',Item.stick});
		addItem(new String[] {"sword", "Defender of Piggalot"}, new GGPSword(ConfigManager.sword, Piggalot.pigtiteMaterial), new Object[] {" p "," p "," s ",'p',getItem("pigtite"),'s',Item.stick});
		addItem(new String[] {"multi", "MLG paxel for noscopeing"}, new GGPPaxel(ConfigManager.multi, 0, Piggalot.pigtiteMaterial, Block.blocksList));
		addItem(new String[] {"bow", "the cowscoper 3000"}, new GGPBow(ConfigManager.bow));
		
		addItem(new String[] {"helmet", "Pigtite Helmet"}, new GGUArmor(ConfigManager.helmet, Piggalot.pigtiteAMaterial, 5, 0).setUnlocalizedName("ITEM_PIGTITE_HELMET"), new Object[] {"ppp","p p",'p',getItem("pigtite")});
		addItem(new String[] {"chestplate", "Pigtite Chestplate"}, new GGUArmor(ConfigManager.chestplate, Piggalot.pigtiteAMaterial, 5, 1).setUnlocalizedName("ITEM_PIGTITE_CHESTPLATE"), new Object[] {"p p","ppp","ppp",'p',getItem("pigtite")});
		addItem(new String[] {"leggings", "Pigtite Leggings"}, new GGUArmor(ConfigManager.leggings, Piggalot.pigtiteAMaterial, 5, 2).setUnlocalizedName("ITEM_PIGTITE_LEGGINGS"), new Object[] {"ppp","p p","p p",'p',getItem("pigtite")});
		addItem(new String[] {"boots", "Pigtite Boots"}, new GGUArmor(ConfigManager.boots, Piggalot.pigtiteAMaterial, 5, 3).setUnlocalizedName("ITEM_PIGTITE_BOOTS"), new Object[] {"p p","p p",'p',getItem("pigtite")});
		
		addItem(new String[] {"bacon", "Bacon"}, new GGPBacon(ConfigManager.bacon));
		
		addItem(new String[] {"spawngnomorian", "Spawn Gnomorian"}, new GPPSpawnEgg(ConfigManager.spawnGnomorian, GGPGnomorian.class, "egg_Gnomorian"));
		addItem(new String[] {"spawnbudder92", "Spawn Budder92"}, new GPPSpawnEgg(ConfigManager.spawnBudder92, GGPBudder92.class, "egg_Budder92"));
		addItem(new String[] {"spawndomonator12", "Spawn domonator12"}, new GPPSpawnEgg(ConfigManager.spawndomonator12, GGPdomonator12.class, "egg_Domonator12"));
		addItem(new String[] {"spawnjo10trot", "Spawn jo10Trot"}, new GPPSpawnEgg(ConfigManager.spawnjo10Trot, GGPJo10Trot.class, "egg_Jo10trot"));
		addItem(new String[] {"spawnmonkrules10", "Spawn Monkrules10"}, new GPPSpawnEgg(ConfigManager.spawnMonkrules10, GGPMonkrules10.class, "egg_Monkrules10"));
		addItem(new String[] {"spawnmixerrules", "Spawn MIXERRULES"}, new GPPSpawnEgg(ConfigManager.spawnMIXERRULES, GGPMIXERRULES.class, "egg_MIXERRULES"));
		addItem(new String[] {"fameblue", "Spawn fameblue"}, new GPPSpawnEgg(ConfigManager.spawnfameblue, GGPfameblue.class, "egg_fameblue"));
		addItem(new String[] {"spawnMyskitBread", "Spawn MyskitBread"}, new GPPSpawnEgg(ConfigManager.spawnMyskitBread, GPPMyskitBread.class, "egg_myskitbread"));
		addItem(new String[] {"spawnrducey99", "Spawn rducey99"}, new GPPSpawnEgg(ConfigManager.spawnrducey99, GGPrducey99.class, "egg_rducey99"));
		addItem(new String[] {"spawnVinbullet", "Spawn Vinbullet"}, new GPPSpawnEgg(ConfigManager.spawnVinbullet, GPPVinbullet.class, "egg_Vinbullet"));
		
		/* Custom Crafted itemstack with enchantments */
		ItemStack craftMultitool = new ItemStack(getItem("multi"));
		craftMultitool.addEnchantment(Enchantment.fortune, 2);
		GameRegistry.addRecipe(craftMultitool, new Object[] {"ash","dpe","rvg",'a',getItem("axe"),'s',getItem("sword"),'h',getItem("hoe"),
			'd',Block.blockDiamond,'p',getItem("pickaxe"),'e',Block.blockEmerald,'r',Block.blockRedstone,'v',getItem("shovel"),'g',Block.blockGold});
		
		/* Custom Crafted itemstack with enchantments */
		ItemStack craftBow = new ItemStack(getItem("bow"));
		craftBow.addEnchantment(Enchantment.infinity, 1);
		craftBow.addEnchantment(Enchantment.punch, 2);
		GameRegistry.addRecipe(craftBow, new Object[] {" ps", "p s", " ps", 'p', getItem("pigtite"), 's', Item.silk});
	}
	
	/**
	 * add item to the hashmap
	 * @param name
	 * @param newItem
	 */
	private static void addItem(String[] name, Item newItem)
	{
		itemMap.put(name[0], newItem);
		GameRegistry.registerItem(newItem, newItem.getUnlocalizedName());
		LanguageRegistry.addName(newItem, name[1]);
	}
	
	/**
	 * add item to the hashMap, with a recipe, name[0]=search map name, name[1]=ingame name
	 * @param name
	 * @param newItem
	 * @param recipe
	 */
	private static void addItem(String[] name, Item newItem, Object[] recipe)
	{
		itemMap.put(name[0], newItem);
		GameRegistry.registerItem(newItem, newItem.getUnlocalizedName());
		LanguageRegistry.addName(newItem, name[1]);
		GameRegistry.addRecipe(new ItemStack(newItem), recipe);
	}
	
	public static Item getItem(String itemName)
	{
		return itemMap.get(itemName);
	}
}
