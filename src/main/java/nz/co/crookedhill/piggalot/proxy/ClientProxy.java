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
package nz.co.crookedhill.piggalot.proxy;

import net.minecraft.client.model.ModelBiped;
import nz.co.crookedhill.piggalot.mobs.GGPBudder92;
import nz.co.crookedhill.piggalot.mobs.GGPGnomorian;
import nz.co.crookedhill.piggalot.mobs.GGPJo10Trot;
import nz.co.crookedhill.piggalot.mobs.GGPMIXERRULES;
import nz.co.crookedhill.piggalot.mobs.GGPMonkrules10;
import nz.co.crookedhill.piggalot.mobs.GGPdomonator12;
import nz.co.crookedhill.piggalot.renderer.GGPMobsRenderer;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenderers() {
		RenderingRegistry.addNewArmourRendererPrefix("PigtiteArmor");
		
		RenderingRegistry.registerEntityRenderingHandler(GGPGnomorian.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "Gnomorian"));
		RenderingRegistry.registerEntityRenderingHandler(GGPBudder92.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "Budder92"));
		RenderingRegistry.registerEntityRenderingHandler(GGPdomonator12.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "domonator12"));
		RenderingRegistry.registerEntityRenderingHandler(GGPJo10Trot.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "Jo10Trot"));
		RenderingRegistry.registerEntityRenderingHandler(GGPMIXERRULES.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "MIXERRULES"));
		RenderingRegistry.registerEntityRenderingHandler(GGPMonkrules10.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "Monkrules10"));
	}
}
