package nz.co.crookedhill.piggalot.block;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class GGPOreGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
		IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId == 1) {
			generateSurface(world, random, chunkX, chunkZ);
		}

	}
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for(int i =0; i<10;i++){
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(20);
			(new WorldGenMinable(GGPBlock.pigtiteore.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
		}}
}
