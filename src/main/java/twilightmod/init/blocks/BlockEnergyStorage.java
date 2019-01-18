package twilightmod.init.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import twilightmod.Main;
import twilightmod.blocks.BlockBase;
import twilightmod.blocks.tileentity.TileEntityEnergyStorage;
import twilightmod.util.Reference;

public class BlockEnergyStorage extends BlockBase {

	public BlockEnergyStorage(String name) {
		super(name, Material.IRON);
	}
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityEnergyStorage();
	}
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.openGui(Main.instance, Reference.GUI_ENERGY_STORAGE, worldIn, pos.getX(), pos.getY(), pos.getZ());
		}
		
		return true;
	}

}
