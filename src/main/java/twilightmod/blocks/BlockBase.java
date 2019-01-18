package twilightmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import twilightmod.Main;
import twilightmod.init.ModBlocks;
import twilightmod.init.ModItems;
import twilightmod.util.IHasModel;

public class BlockBase extends Block implements IHasModel
{
public BlockBase(String name, Material material)
{
	super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	ModBlocks.BLOCKS.add(this);
 	ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
 }
	public void registerModels() {
	Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	
	}


}