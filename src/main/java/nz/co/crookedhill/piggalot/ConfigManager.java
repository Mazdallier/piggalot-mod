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
package nz.co.crookedhill.piggalot;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigManager {
	public static int helmet;
	public static int chestplate;
	public static int leggings;
	public static int boots;
	
	public static int pickaxe;
	public static int sword;
	public static int axe;
	public static int hoe;
	public static int shovel;
	public static int multi;
	
	public static int bow;
	
	public static int bacon;
	
	public static int pigtite;
	
	public static int ore;
	
	public static void init(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		helmet = config.getItem("pigtitehelmet", 2222).getInt();
		chestplate= config.getItem("pigtitechestplate", 2223).getInt();
		leggings= config.getItem("pigtiteleggings", 2224).getInt();
		boots= config.getItem("pigtiteboots", 2225).getInt();
		
		pickaxe= config.getItem("pigtitepickaxe", 2226).getInt();
		sword= config.getItem("pigtitesword", 2227).getInt();
		axe= config.getItem("pigtiteaxe", 2228).getInt();
		hoe= config.getItem("pigtitehoe", 2229).getInt();
		shovel= config.getItem("pigtiteshovel", 2230).getInt();
		multi= config.getItem("pigtitepaxel", 2232).getInt();
		
		bow = config.getItem("pigtitebow", 2233).getInt();
		
		
		pigtite = config.getItem("pigtite", 2231).getInt();
		
		bacon = config.getItem("bacon", 2234).getInt();
		
		ore = config.getBlock("pigtiteore", 2232).getInt();
		config.save();
	}
}
