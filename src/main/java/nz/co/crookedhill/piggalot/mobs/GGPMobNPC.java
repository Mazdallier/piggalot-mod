package nz.co.crookedhill.piggalot.mobs;

import java.util.Random;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class GGPMobNPC extends EntityVillager{

	public GGPMobNPC(World par1World, String customName) {
		super(par1World);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(9, new EntityAIWander(this, 0.6D));
		this.setCustomNameTag(customName);
		
	}
	protected abstract int getDropItemId();
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.5D);
    }
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		return false; 
	}
	@Override
    public boolean getCanSpawnHere()
    {
     if(worldObj.villageCollectionObj.getVillageList().iterator().hasNext() && worldObj.villageCollectionObj.findNearestVillage((int)this.posX, (int)this.posY, (int)this.posZ, 10) == null)
        {
         return false;
        }
     return true;
    }

    protected boolean canDespawn()
    {
     return true;
    }
    protected String getLivingSound()
    {
        return null;
    }
}
