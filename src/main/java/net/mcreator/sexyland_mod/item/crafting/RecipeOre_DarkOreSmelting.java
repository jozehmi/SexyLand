
package net.mcreator.sexyland_mod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.sexyland_mod.item.ItemOre_DarkGem;
import net.mcreator.sexyland_mod.block.BlockOre_DarkOre;
import net.mcreator.sexyland_mod.ElementsSexyland;

@ElementsSexyland.ModElement.Tag
public class RecipeOre_DarkOreSmelting extends ElementsSexyland.ModElement {
	public RecipeOre_DarkOreSmelting(ElementsSexyland instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockOre_DarkOre.block, (int) (1)), new ItemStack(ItemOre_DarkGem.block, (int) (1)), 25F);
	}
}
