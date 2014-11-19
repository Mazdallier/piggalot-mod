package nz.co.crookedhill.piggalot.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class GGPMobsRenderer extends RenderLiving {
	
    private String name;
	private ResourceLocation texture;  //refers to:assets/yourmod/textures/entity/yourtexture.png
    public GGPMobsRenderer(ModelBase par1ModelBase, float par2, String texturename)
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
