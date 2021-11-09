
package net.mcreator.sexyland_mod.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.sexyland_mod.ElementsSexyland;

@ElementsSexyland.ModElement.Tag
public class LootTableLootinfernal extends ElementsSexyland.ModElement {
	public LootTableLootinfernal(ElementsSexyland instance) {
		super(instance, 24);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("sexyland_mod", "lootinfernal"));
	}
}
