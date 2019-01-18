package twilightmod.blocks.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import twilightmod.energy.CustomEnergyStorage;

public class TileEntityPowerGenerator extends TileEntity implements ITickable
{
	public ItemStackHandler handler = new ItemStackHandler(1);
	private CustomEnergyStorage storage = new CustomEnergyStorage(100000);
	public int energy = storage.getEnergyStored();
	public int cookTime;
	
	@Override
	public void update() 
	{
		if(!handler.getStackInSlot(0).isEmpty() && isItemFuel(handler.getStackInSlot(0)))
		{
			cookTime++;
			if(cookTime == 25)
			{
				energy += getFuelValue(handler.getStackInSlot(0));
				handler.getStackInSlot(0).shrink(1);
				cookTime = 0;
			}
		}
	}
	
	private boolean isItemFuel(ItemStack stack) 
	{
		return getFuelValue(stack) > 0;
	}
	
	private int getFuelValue(ItemStack stack) 
	{
		if(TileEntityFurnace.isItemFuel(stack)) 
			{
				return TileEntityFurnace.getItemBurnTime(stack);
			}

		else 
			{
				return 0;
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) 
	{
		if(capability == CapabilityEnergy.ENERGY)
			{
				return (T)this.storage;
			}
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) 
			{
				return (T)this.handler;
			}
		return super.getCapability(capability, facing);
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) 
	{
		if(capability == CapabilityEnergy.ENERGY) return true;
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
		return super.hasCapability(capability, facing);
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) 
	{
		super.writeToNBT(compound);
		compound.setTag("Inventory", this.handler.serializeNBT());
		compound.setInteger("CookTime", this.cookTime);
		compound.setInteger("GuiEnergy", this.energy);
		compound.setString("Name", getDisplayName().toString());
		this.storage.writeToNBT(compound);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) 
	{
		super.readFromNBT(compound);
		this.handler.deserializeNBT(compound.getCompoundTag("Inventory"));
		this.cookTime = compound.getInteger("CookTime");
		this.energy = compound.getInteger("GuiEnergy");
		compound.getString("Name");
		this.storage.readFromNBT(compound);
	}
	
	@Override
	public ITextComponent getDisplayName()
	{
		return new TextComponentTranslation("container.power_generator");
	}
	
	public int getEnergyStored()
	{
		return this.energy;
	}
	
	public int getMaxEnergyStored()
	{
		return this.storage.getMaxEnergyStored();
	}
	
	public int getField(int id)
	{
		switch(id)
		{
		case 0:
			return this.energy;
		case 1:
			return this.cookTime;
		default:
			return 0;
		}
	}
	
	public void setField(int id, int value)
	{
		switch(id)
		{
		case 0:
			this.energy = value;
		case 1:
			this.cookTime = value;
		}
	}
	
	public boolean isUsableByPlayer(EntityPlayer player) 
	{
		return this.world.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
	}	
	
	
}