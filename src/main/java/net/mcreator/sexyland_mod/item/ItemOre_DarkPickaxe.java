
package net.mcreator.sexyland_mod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.sexyland_mod.ElementsSexyland;

import java.util.Set;
import java.util.HashMap;

@ElementsSexyland.ModElement.Tag
public class ItemOre_DarkPickaxe extends ElementsSexyland.ModElement {s
	@GameRegistry.ObjectHolder("sexyland_mod:ore_darkpickaxe")
	public static final Item block = null;
	public ItemOre_DarkPickaxe(ElementsSexyland instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("ORE_DARKPICKAXE", 4, 500, 12f, 4f, 14)) {
			{
				this.attackSpeed = -4f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("ore_darkpickaxe").setRegistryName("ore_darkpickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("sexyland_mod:ore_darkpickaxe", "inventory"));
	}
}
