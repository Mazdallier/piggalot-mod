package nz.co.crookedhill.piggalot;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nz.co.crookedhill.piggalot.block.GGPBlock;
import nz.co.crookedhill.piggalot.block.GGPOreGen;
import nz.co.crookedhill.piggalot.item.GGPItem;
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
import net.minecraft.item.EnumArmorMaterial;

@Mod(modid="piggalot",name="GnomGnom's Piggalot Mod",version="0.0.9.1")
@NetworkMod(clientSideRequired=true)
public class Piggalot {
	
	@Instance(value = "piggalot")
    public static Piggalot instance;
	
	// Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="nz.co.crookedhill.piggalot.ClientProxy", serverSide="nz.co.crookedhill.piggalot.CommonProxy")
    public static CommonProxy proxy;
	
	public static CreativeTabs piggalottab = new GGPCreativeTab("Piggalot Mod");
	public static EnumToolMaterial pigtiteMaterial = EnumHelper.addToolMaterial("PigtiteTool", EnumToolMaterial.EMERALD.getHarvestLevel()+1, EnumToolMaterial.EMERALD.getMaxUses(), (EnumToolMaterial.EMERALD.getEfficiencyOnProperMaterial()*3), 42F, 22);
	public static EnumArmorMaterial pigtiteAMaterial = EnumHelper.addArmorMaterial("PigtiteArmor", 10000, new int[] {4,8,7,4}, 30);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		ConfigManager.init(event);
		GGPBlock.init();	
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new GGPOreGen());
		proxy.registerRenderers();
		GGPItem.init();
		GameRegistry.addSmelting(GGPBlock.pigtiteore.blockID, new ItemStack(GGPItem.pigtite), 5F);
	}
}
