package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.world.World;

public class GPPVinbullet extends GGPMobNPC{

	public GPPVinbullet(World par1World) {
		super(par1World, "Vinbullet");
		this.targetTasks.addTask(4, new EntityAITargetNonTamed(this, GGPfameblue.class, 200, false));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getDropItemId() {
		// TODO Auto-generated method stub
		return 0;
	}

}
