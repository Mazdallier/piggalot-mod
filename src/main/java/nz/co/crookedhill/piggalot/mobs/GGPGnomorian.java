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

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.world.World;

public class GGPGnomorian extends GGPMobNPC {

	public GGPGnomorian(World par1World) {
		super(par1World, "Gnomorian");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getDropItemId() {
		// TODO Auto-generated method stub
		return Block.blockSnow.blockID;
	}

}
