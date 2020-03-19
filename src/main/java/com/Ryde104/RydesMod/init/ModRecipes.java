package com.Ryde104.RydesMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{ 							//add Blocks. here to add vanilla blocks and Items to do items
		GameRegistry.addSmelting(ModBlocks.SHALE_BLOCK, new ItemStack(ModItems.ALUMINUM_NUGGET, 3), 3.5f);
	}
}
