
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.proximaadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.proximaadventure.item.ProximaBDimensionItem;
import net.mcreator.proximaadventure.ProximaAdventureMod;

import java.util.function.Function;

public class ProximaAdventureModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ProximaAdventureMod.MODID);
	public static final DeferredItem<Item> PROXIMAN_SOIL = block(ProximaAdventureModBlocks.PROXIMAN_SOIL);
	public static final DeferredItem<Item> PROXIMAN_STONE = block(ProximaAdventureModBlocks.PROXIMAN_STONE);
	public static final DeferredItem<Item> PROXIMAN_SEABED_GRAVEL = block(ProximaAdventureModBlocks.PROXIMAN_SEABED_GRAVEL);
	public static final DeferredItem<Item> PROXIMA_LOG = block(ProximaAdventureModBlocks.PROXIMA_LOG);
	public static final DeferredItem<Item> PROXIMAN_LEAVES = block(ProximaAdventureModBlocks.PROXIMAN_LEAVES);
	public static final DeferredItem<Item> PROXIMA_B_DIMENSION = register("proxima_b_dimension", ProximaBDimensionItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
