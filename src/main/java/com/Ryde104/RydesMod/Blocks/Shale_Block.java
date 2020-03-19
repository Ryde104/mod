package com.Ryde104.RydesMod.Blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Shale_Block extends BlockBase 
{

	public Shale_Block(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(0.7f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 1);
		//setLightLevel(20.0f);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}

	

	

}
