package twilightmod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import twilightmod.Main;
import twilightmod.init.ModItems;
import twilightmod.util.IHasModel;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		ModItems.ITEMS.add(this);		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
