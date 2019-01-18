package twilightmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import twilightmod.blocks.BlockElectricSinteringFurnace;
import twilightmod.blocks.BlockPowerGenerator;
import twilightmod.blocks.TwilightBlock;
import twilightmod.blocks.TwilightOre;
import twilightmod.init.blocks.BlockEnergyStorage;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final TwilightBlock TWILIGHT_BLOCK = new TwilightBlock("twilight_block", Material.IRON);	
	public static final TwilightOre TWILIGHT_ORE = new TwilightOre("twilight_ore", Material.ROCK);
	public static final Block POWER_GENERATOR = new BlockPowerGenerator("power_generator");
	public static final Block ELECTRIC_SINTERING_FURNACE = new BlockElectricSinteringFurnace("electric_sintering_furnace");
	public static final Block ENERGY_STORAGE = new BlockEnergyStorage("energy_storage");
}
