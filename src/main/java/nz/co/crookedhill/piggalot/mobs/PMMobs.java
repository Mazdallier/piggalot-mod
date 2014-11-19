package nz.co.crookedhill.piggalot.mobs;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PMMobs {
	public static void init() {
		//REGISTER ENTITIES
		EntityRegistry.registerGlobalEntityID(GGPGnomorian.class, "Gnomorian", 103, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPBudder92.class, "Budder92", 104, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPdomonator12.class, "domonator12", 105, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPJo10Trot.class, "Jo10Trot", 106, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPMIXERRULES.class, "MIXERRULES", 107, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPMonkrules10.class, "Monkrules10", 108, 113213, 3523523);
		EntityRegistry.registerGlobalEntityID(GGPThajmar.class, "Thajmar", 109, 113213, 3523523);
		
		//REGISTER LANGUAGE
		LanguageRegistry.instance().addStringLocalization("entity.Gnomorian.name", "en_US", "Gnomorian");
		LanguageRegistry.instance().addStringLocalization("entity.Budder92.name", "en_US", "Budder92");
		LanguageRegistry.instance().addStringLocalization("entity.domonator12.name", "en_US", "domonator12");
		LanguageRegistry.instance().addStringLocalization("entity.Jo10Trot.name", "en_US", "Jo10Trot");
		LanguageRegistry.instance().addStringLocalization("entity.MIXERRULES.name", "en_US", "MIXERRULES");
		LanguageRegistry.instance().addStringLocalization("entity.Monkrules10.name", "en_US", "Monkrules10");
		LanguageRegistry.instance().addStringLocalization("entity.Thajmar.name", "en_US", "Thajmar");
		
		//REGISTER SPAWNS
		EntityRegistry.addSpawn(GGPGnomorian.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPBudder92.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPdomonator12.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPJo10Trot.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPMIXERRULES.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPMonkrules10.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
		EntityRegistry.addSpawn(GGPThajmar.class, 10, 2, 6, EnumCreatureType.ambient, BiomeGenBase.plains, BiomeGenBase.desert);
	}

}