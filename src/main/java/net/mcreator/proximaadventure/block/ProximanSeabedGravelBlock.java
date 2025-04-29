
package net.mcreator.proximaadventure.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;

import com.mojang.serialization.MapCodec;

public class ProximanSeabedGravelBlock extends FallingBlock {
	public static final MapCodec<ProximanSeabedGravelBlock> CODEC = simpleCodec(ProximanSeabedGravelBlock::new);

	public MapCodec<ProximanSeabedGravelBlock> codec() {
		return CODEC;
	}

	public ProximanSeabedGravelBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SUSPICIOUS_GRAVEL).strength(0.6f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}
