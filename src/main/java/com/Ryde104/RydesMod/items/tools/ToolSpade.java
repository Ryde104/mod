package com.Ryde104.RydesMod.items.tools;

import com.Ryde104.RydesMod.Main;
import com.Ryde104.RydesMod.init.ModItems;
import com.Ryde104.RydesMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ToolSpade extends ItemSpade implements IHasModel
{
	public ToolSpade(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
	 Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}