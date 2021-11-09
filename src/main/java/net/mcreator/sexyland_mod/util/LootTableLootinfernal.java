
package net.mcreator.sexyland_mod.util;

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
