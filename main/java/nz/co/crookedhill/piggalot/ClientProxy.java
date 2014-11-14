package nz.co.crookedhill.piggalot;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers() {
		RenderingRegistry.addNewArmourRendererPrefix("PigtiteArmor");
		
	}
}
