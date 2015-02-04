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
package nz.co.crookedhill.piggalot.mobs;

import java.util.Random;
import java.util.UUID;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public abstract class GGPMobNPC extends EntityVillager{
	
	protected static Random rand = new Random(UUID.randomUUID().getMostSignificantBits());

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
