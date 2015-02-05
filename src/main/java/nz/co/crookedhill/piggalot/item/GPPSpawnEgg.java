package nz.co.crookedhill.piggalot.item;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import nz.co.crookedhill.piggalot.Piggalot;

public class GPPSpawnEgg extends Item{
	private Class<?> toSpawn;
	private String name;

	public GPPSpawnEgg(int id, Class<?> entity, String name) {
		super(id);
		this.name = name;
		toSpawn = entity;
		this.setUnlocalizedName(name);
		this.setTextureName("piggalot:" + name);
		
		this.setCreativeTab(Piggalot.piggalottab);
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		Entity entity = null;
		
		try {
			Constructor constr = toSpawn.getConstructor(new Class[] {World.class});
			entity = (Entity)constr.newInstance(par3World);
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		if(entity != null)
		{
			par2EntityPlayer.worldObj.spawnEntityInWorld(entity);
			entity.setPosition(par4, par5+1.0d, par6);
		}
        return true;
    }
}
