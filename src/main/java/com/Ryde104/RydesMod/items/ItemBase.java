package com.Ryde104.RydesMod.items;

import com.Ryde104.RydesMod.Main;
import com.Ryde104.RydesMod.init.ModItems;
import com.Ryde104.RydesMod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
	 Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}
