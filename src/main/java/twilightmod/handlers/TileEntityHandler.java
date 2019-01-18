package twilightmod.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import twilightmod.blocks.tileentity.TileEntityElectricSinteringFurnace;
import twilightmod.blocks.tileentity.TileEntityPowerGenerator;
import twilightmod.util.Reference;

public class TileEntityHandler{
	public static void registerTileEntities() {//MODID
		GameRegistry.registerTileEntity(TileEntityPowerGenerator.class, new ResourceLocation(Reference.MOD_ID +":power_genetator"));
		GameRegistry.registerTileEntity(TileEntityElectricSinteringFurnace.class, new ResourceLocation(Reference.MOD_ID +":electric_furnace"));
	}

}
