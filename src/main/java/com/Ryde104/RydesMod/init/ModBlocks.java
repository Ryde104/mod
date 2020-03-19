package com.Ryde104.RydesMod.init;


import java.util.ArrayList;
import java.util.List;

import com.Ryde104.RydesMod.Blocks.BlockBase;
import com.Ryde104.RydesMod.Blocks.Shale_Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SHALE_BLOCK = new Shale_Block("shale_block", Material.IRON);
	
	public static final Block NEW_BLOCK = new Shale_Block("new_block", Material.IRON);
}
