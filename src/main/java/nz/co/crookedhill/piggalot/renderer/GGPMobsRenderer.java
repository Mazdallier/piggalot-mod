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
package nz.co.crookedhill.piggalot.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GGPMobsRenderer extends RenderBiped {
	
    private String name;
	private ResourceLocation texture;  //refers to:assets/yourmod/textures/entity/yourtexture.png
    public GGPMobsRenderer(ModelBiped par1ModelBase, float par2, String texturename)
    {
        super(par1ModelBase, par2);
        texture = new ResourceLocation("piggalot:textures/mobs/"+texturename+".png");
    }
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return texture;
    }
}
