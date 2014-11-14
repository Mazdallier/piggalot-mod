package nz.co.crookedhill.piggalot.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import nz.co.crookedhill.piggalot.ConfigManager;

public class GGPBlock {
	
	public static Block pigtiteore;
	
	public static void init() {
		pigtiteore = new GGPOrePigtite(ConfigManager.ore).setUnlocalizedName("BLOCK_PIGTITE");
		
		GameRegistry.registerBlock(pigtiteore, pigtiteore.getUnlocalizedName());
		
		LanguageRegistry.addName(pigtiteore, "Pigtite Ore");
	}
}
