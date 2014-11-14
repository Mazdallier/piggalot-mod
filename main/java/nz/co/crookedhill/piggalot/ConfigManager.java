package nz.co.crookedhill.piggalot;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigManager {
	public static int helmet = 2222;
	public static int chestplate = 2223;
	public static int leggings = 2224;
	public static int boots = 2225;
	
	public static int pickaxe = 2226;
	public static int sword = 2227;
	public static int axe = 2228;
	public static int hoe = 2229;
	public static int shovel = 2230;
	
	public static int pigtite = 2231;
	
	public static int ore = 2232;
	
	public static void init(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		int helmet = config.getItem("pigtitehelmet", 2222).getInt();
		int chestplate= config.getItem("pigtitechestplate", 2223).getInt();
		int leggings= config.getItem("pigtiteleggings", 2224).getInt();
		int boots= config.getItem("pigtiteboots", 2225).getInt();
		
		int pickaxe= config.getItem("pigtitepickaxe", 2226).getInt();
		int sword= config.getItem("pigtitesword", 2227).getInt();
		int axe= config.getItem("pigtiteaxe", 2228).getInt();
		int hoe= config.getItem("pigtitehoe", 2229).getInt();
		int shovel= config.getItem("pigtiteshovel", 2230).getInt();
		
		int pigtite = config.getItem("pigtite", 2231).getInt();
		
		int ore = config.getBlock("pigtiteore", 2232).getInt();
		config.save();
	}
}
