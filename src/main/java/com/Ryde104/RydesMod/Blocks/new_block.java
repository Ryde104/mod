package com.Ryde104.RydesMod.Blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class new_block extends BlockBase 
{
	public static final AxisAlignedBB NEW_BLOCK_AABB = new AxisAlignedBB(0.1875D, 0, 0.1875D, 0.625D, 2, 0.8125D);
	
	public new_block(String name) 
	{
		super(name, Material.CLOTH);
	}
	
	public boolean isOpaque(IBlockState state) {
		return false;
	}
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return NEW_BLOCK_AABB;
	}
	
}