
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.proximaadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.proximaadventure.block.ProximanStoneBlock;
import net.mcreator.proximaadventure.block.ProximanSoilBlock;
import net.mcreator.proximaadventure.block.ProximanSeabedGravelBlock;
import net.mcreator.proximaadventure.block.ProximanLeavesBlock;
import net.mcreator.proximaadventure.block.ProximaLogBlock;
import net.mcreator.proximaadventure.block.ProximaBDimensionPortalBlock;
import net.mcreator.proximaadventure.ProximaAdventureMod;

import java.util.function.Function;

public class ProximaAdventureModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ProximaAdventureMod.MODID);
	public static final DeferredBlock<Block> PROXIMAN_SOIL = register("proximan_soil", ProximanSoilBlock::new);
	public static final DeferredBlock<Block> PROXIMAN_STONE = register("proximan_stone", ProximanStoneBlock::new);
	public static final DeferredBlock<Block> PROXIMAN_SEABED_GRAVEL = register("proximan_seabed_gravel", ProximanSeabedGravelBlock::new);
	public static final DeferredBlock<Block> PROXIMA_LOG = register("proxima_log", ProximaLogBlock::new);
	public static final DeferredBlock<Block> PROXIMAN_LEAVES = register("proximan_leaves", ProximanLeavesBlock::new);
	public static final DeferredBlock<Block> PROXIMA_B_DIMENSION_PORTAL = register("proxima_b_dimension_portal", ProximaBDimensionPortalBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
