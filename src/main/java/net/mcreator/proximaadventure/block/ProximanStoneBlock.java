
package net.mcreator.proximaadventure.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ProximanStoneBlock extends Block {
	public ProximanStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.STONE).strength(1.5f, 6f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
