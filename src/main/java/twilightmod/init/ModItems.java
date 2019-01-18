package twilightmod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import twilightmod.items.ItemBase;

import twilightmod.items.armor.ArmorBase;
import twilightmod.items.tools.ToolAxe;
import twilightmod.items.tools.ToolHoe;
import twilightmod.items.tools.ToolPickaxe;
import twilightmod.items.tools.ToolSpade;
import twilightmod.items.tools.ToolSword;
import twilightmod.util.Reference;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	//Materials
	public static final ToolMaterial MATERIAL_TWILIGHT = EnumHelper.addToolMaterial("material_twilight", 3, 2000, 10.0f, 3.5f, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_TWILIGHT = EnumHelper.addArmorMaterial("armor_material_twilight", Reference.MOD_ID + ":twilight", 16, new int[] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
	
	//Items
	public static final Item TWILIGHT_INGOT = new ItemBase("twilight_ingot", CreativeTabs.MATERIALS);

	//Tools
	public static final ItemSword TWILIGHT_SWORD = new ToolSword("twilight_sword", MATERIAL_TWILIGHT, CreativeTabs.COMBAT);
	public static final ItemSpade TWILIGHT_SPADE = new ToolSpade("twilight_shovel", MATERIAL_TWILIGHT, CreativeTabs.TOOLS);
	public static final ItemPickaxe TWILIGHT_PICKAXE = new ToolPickaxe("twilight_pickaxe", MATERIAL_TWILIGHT, CreativeTabs.TOOLS);
	public static final ItemAxe TWILIGHT_AXE = new ToolAxe("twilight_axe", MATERIAL_TWILIGHT, CreativeTabs.TOOLS);
	public static final ItemHoe TWILIGHT_HOE = new ToolHoe("twilight_hoe", MATERIAL_TWILIGHT, CreativeTabs.TOOLS);
	
	//Armor
	public static final Item TWILIGHT_HELMET = new ArmorBase("twilight_helmet", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.HEAD);
	public static final Item TWILIGHT_CHESTPLATE = new ArmorBase("twilight_chestplate", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.CHEST);
	public static final Item TWILIGHT_LEGGINS = new ArmorBase("twilight_leggins", ARMOR_MATERIAL_TWILIGHT, 2, EntityEquipmentSlot.LEGS);
	public static final Item TWILIGHT_BOOTS = new ArmorBase("twilight_boots", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.FEET);
	
}
