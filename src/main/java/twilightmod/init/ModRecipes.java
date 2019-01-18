package twilightmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.TWILIGHT_ORE, new ItemStack(ModItems.TWILIGHT_INGOT,  1), 1.5f);
	}
}
