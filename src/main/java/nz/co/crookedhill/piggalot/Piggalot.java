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
package nz.co.crookedhill.piggalot;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.block.GGPBlock;
import nz.co.crookedhill.piggalot.block.GGPOreGen;
import nz.co.crookedhill.piggalot.handler.GGPPlayerhandler;
import nz.co.crookedhill.piggalot.item.GGPItem;
import nz.co.crookedhill.piggalot.mobs.PMMobs;
import nz.co.crookedhill.piggalot.proxy.CommonProxy;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.EnumArmorMaterial;

@Mod(modid="piggalot",name="GnomGnom's Piggalot Mod",version="0.0.17.0")
@NetworkMod(clientSideRequired=true)
public class Piggalot {
	
	@Instance(value = "piggalot")
    public static Piggalot instance;
	
	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="nz.co.crookedhill.piggalot.proxy.ClientProxy", serverSide="nz.co.crookedhill.piggalot.proxy.CommonProxy")
    public static CommonProxy proxy;
	
	public static CreativeTabs piggalottab = new GGPCreativeTab("Piggalot Mod");
	public static EnumToolMaterial pigtiteMaterial = EnumHelper.addToolMaterial("PigtiteTool", EnumToolMaterial.EMERALD.getHarvestLevel()+1, EnumToolMaterial.EMERALD.getMaxUses(), (EnumToolMaterial.EMERALD.getEfficiencyOnProperMaterial()*3), 42F, 22);
	public static EnumArmorMaterial pigtiteAMaterial = EnumHelper.addArmorMaterial("PigtiteArmor", 10000, new int[] {4,8,7,4}, 30);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		ConfigManager.init(event);
		GGPBlock.init();
		PMMobs.init();
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new GGPOreGen());
		proxy.registerRenderers();
		GGPItem.init();
		GameRegistry.addSmelting(GGPBlock.pigtiteore.blockID, new ItemStack(GGPItem.pigtite), 5F);
		MinecraftForge.EVENT_BUS.register(GGPPlayerhandler.class);
	}
}
