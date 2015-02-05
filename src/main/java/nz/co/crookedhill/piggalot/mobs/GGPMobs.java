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

import java.util.HashMap;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import nz.co.crookedhill.piggalot.Piggalot;
import nz.co.crookedhill.piggalot.renderer.GGPMobsRenderer;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GGPMobs {
	
	public static void init() {
		
		//REGISTER ENTITIES
		registerMob("Gnomorian", GGPGnomorian.class, 103);
		registerMob("Budder92", GGPBudder92.class, 104);
		registerMob("domonator12", GGPdomonator12.class, 105);
		registerMob("Jo10Trot", GGPJo10Trot.class, 106);
		registerMob("MIXERRULES", GGPMIXERRULES.class, 107);
		registerMob("Monkrules10", GGPMonkrules10.class, 108);
		registerMob("fameblue", GGPfameblue.class, 109);
		registerMob("MyskitBread", GPPMyskitBread.class, 110);
		registerMob("rducey99", GGPrducey99.class, 111);
		registerMob("Vinbullet", GPPVinbullet.class, 112);
		
		/*//REGISTER SPAWNS
		EntityRegistry.addSpawn(GGPGnomorian.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPBudder92.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPdomonator12.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPJo10Trot.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPMIXERRULES.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPMonkrules10.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);*/
		
	}
	/**
	 * register an entity to the hashmap
	 * @param name name that will be used to lookup the entity
	 * @param mobClass
	 * @param localization {"entity.entityname.name", "en_us", "Ingame Name"}
	 */
	private static void registerMob(String name, Class mobClass, int id)
	{
		EntityRegistry.registerGlobalEntityID(mobClass, name, id);
		LanguageRegistry.instance().addStringLocalization("entity." + name + ".name", "en_US", name);
		Piggalot.proxy.registerNPC(mobClass, new GGPMobsRenderer(new ModelBiped(), 0.4F, name));
		
		EntityRegistry.addSpawn(mobClass, 10, 1, 1, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.beach);
	}

}
