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
package nz.co.crookedhill.piggalot.proxy;

import net.minecraft.client.model.ModelBiped;
import nz.co.crookedhill.piggalot.mobs.GGPBudder92;
import nz.co.crookedhill.piggalot.mobs.GGPGnomorian;
import nz.co.crookedhill.piggalot.mobs.GGPJo10Trot;
import nz.co.crookedhill.piggalot.mobs.GGPMIXERRULES;
import nz.co.crookedhill.piggalot.mobs.GGPMonkrules10;
import nz.co.crookedhill.piggalot.mobs.GGPThajmar;
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
		RenderingRegistry.registerEntityRenderingHandler(GGPThajmar.class, new GGPMobsRenderer(new ModelBiped(), 0.4F, "Thajmar"));
	}
}
