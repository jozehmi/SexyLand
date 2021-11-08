
package net.mcreator.sexyland_mod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.sexyland_mod.ElementsSexyland;

@ElementsSexyland.ModElement.Tag
public class ItemOre_DarkArmor extends ElementsSexyland.ModElement {
	@GameRegistry.ObjectHolder("sexyland_mod:ore_darkarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("sexyland_mod:ore_darkarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("sexyland_mod:ore_darkarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("sexyland_mod:ore_darkarmorboots")
	public static final Item boots = null;
	public ItemOre_DarkArmor(ElementsSexyland instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ORE_DARKARMOR", "sexyland_mod:ore_dark", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ore_darkarmorhelmet")
				.setRegistryName("ore_darkarmorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ore_darkarmorbody")
				.setRegistryName("ore_darkarmorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ore_darkarmorlegs")
				.setRegistryName("ore_darkarmorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ore_darkarmorboots")
				.setRegistryName("ore_darkarmorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("sexyland_mod:ore_darkarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("sexyland_mod:ore_darkarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("sexyland_mod:ore_darkarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("sexyland_mod:ore_darkarmorboots", "inventory"));
	}
}
