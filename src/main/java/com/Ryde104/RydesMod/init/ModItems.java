package com.Ryde104.RydesMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Ryde104.RydesMod.items.ItemBase;
import com.Ryde104.RydesMod.items.ItemCombat;
import com.Ryde104.RydesMod.items.tools.ToolSpade;
import com.Ryde104.RydesMod.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//materials 
	public static final ToolMaterial MATERIAL_ALUMINUM = EnumHelper.addToolMaterial("material_aluminum", 2, 200, 4.5F, 1.5F, 9);
	public static final ToolMaterial MASTER = EnumHelper.addToolMaterial("master", 3, 2000, 8.0F, 3.0F, 10);
	public static final ToolMaterial MEGA_ITEMS = EnumHelper.addToolMaterial("mega_items", 3, 3004, 15.0F, 22.0F, 20);
	
	
	//public static final Item PEN = new ItemCombat("pen");
	public static final Item ALUMINUM_NUGGET = new ItemBase("aluminum_nugget");
	public static final Item ALUMINUM_Bar = new ItemBase("aluminum_bar");
	
	//Tools
	public static final ItemSword MASTER_SWORD = new ToolSword("master_sword", MASTER);
	
	public static final ItemSword MEGA_SWORD = new ToolSword("mega_sword", MEGA_ITEMS);
	
	public static final ItemSpade R_STONE_SHOVEL = new ToolSpade("r_stone_shovel", MATERIAL_ALUMINUM);
	
	//public static final ItemSword RS = new ToolSword("rs", MATERIAL_ALUMINUM);
}
