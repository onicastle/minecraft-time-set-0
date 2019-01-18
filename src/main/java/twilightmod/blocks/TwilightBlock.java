package twilightmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TwilightBlock extends BlockBase 
{

	public TwilightBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);		
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(15.0f);
		//setLightOpacity(10);
		//setBlockUnbreakable();
		
	}

}
