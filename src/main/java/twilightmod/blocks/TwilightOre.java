package twilightmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TwilightOre extends BlockBase
{

	public TwilightOre(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.STONE);		
		setHardness(3.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}
	
	/*@Override
	 * public Item getItemDropped(IBlockState state, Random rand, int fortune)
	 * {
	 * 	return //item;
	 * }
	 */

}
