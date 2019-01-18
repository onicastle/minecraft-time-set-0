package twilightmod.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import twilightmod.blocks.containers.ContainerElectricSinteringFurnace;
import twilightmod.blocks.containers.ContainerEnergyStorage;
import twilightmod.blocks.containers.ContainerPowerGenerator;
import twilightmod.blocks.guis.GuiElectricSinteringFurnace;
import twilightmod.blocks.guis.GuiEnergyStorage;
import twilightmod.blocks.guis.GuiPowerGenerator;
import twilightmod.blocks.tileentity.TileEntityElectricSinteringFurnace;
import twilightmod.blocks.tileentity.TileEntityEnergyStorage;
import twilightmod.blocks.tileentity.TileEntityPowerGenerator;
import twilightmod.util.Reference;

public class GuiHandler implements IGuiHandler{

	public Object getServerGuiElement(int ID, EntityPlayer player,World world, int x, int y, int z) {
		if(ID == Reference.GUI_POWER_GENERATOR) return new ContainerPowerGenerator(player.inventory, (TileEntityPowerGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ELECTRIC_SINTERING_FURNACE) return new ContainerElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ENERGY_STORAGE) return new ContainerEnergyStorage(player.inventory, (TileEntityEnergyStorage)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_POWER_GENERATOR) return new GuiPowerGenerator(player.inventory, (TileEntityPowerGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ENERGY_STORAGE) return new GuiEnergyStorage(player.inventory, (TileEntityEnergyStorage)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ELECTRIC_SINTERING_FURNACE) return new GuiElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
	return null;
	}
}
