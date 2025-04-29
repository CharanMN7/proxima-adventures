package net.mcreator.proximaadventure.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.proximaadventure.network.ProximaAdventureModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ShowBiomeTipsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		double fireHeight = 0;
		double tipCooldown = 0;
		double random_lesson_id = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("proxima_adventure:planet_proxima_b"))) {
			if (ProximaAdventureModVariables.WorldVariables.get(world).tip_cooldown > 0) {
				ProximaAdventureModVariables.WorldVariables.get(world).tip_cooldown = ProximaAdventureModVariables.WorldVariables.get(world).tip_cooldown - 1;
				ProximaAdventureModVariables.WorldVariables.get(world).syncData(world);
			} else {
				ProximaAdventureModVariables.WorldVariables.get(world).tip_cooldown = 600;
				ProximaAdventureModVariables.WorldVariables.get(world).syncData(world);
				random_lesson_id = Mth.nextInt(RandomSource.create(), 1, 7);
				if (random_lesson_id == 1) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList()
								.broadcastSystemMessage(Component.literal("The sky looks reddish-orange because the star of this planet, Proxima Centauri, is a red dwarf star which is many times smaller and dimmer than the sun"), false);
				} else if (random_lesson_id == 2) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
								"The trees and grass, all of them have darker color of leaves because the light from the star is very dim and most of the light emitted lies in the infrared spectrum. So, in order to capture maximum energy from the light they recieve, they have dark leaves."),
								false);
				} else if (random_lesson_id == 3) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
								"This planet most likely doesn't have a moon (although yoou see it here) becuase it is very close to it's star (roughly 5% of Earth's distance from the Sun) and there likely isn't enough material in the planetary disc for a moon to form."),
								false);
				} else if (random_lesson_id == 4) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
								"Proxima Centauri B is most likely tidally locked because of how close it is to it's star, which means that it is always showing the same face to it's star. If this is the case, the planet might not sustain liquid water, an atomsphere, or even a magnetic field, all of which are crucial for life to exist as we know it. However, there is one interesting possibility (while extremely unlikely) that life might exist in the area between the day and night sides of the planet, in case it's tidally locked."),
								false);
				} else if (random_lesson_id == 5) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
								"The exact age of the planet is unknow but it is relavtively close to how old earth is. So, there might be complex life that has evolved on the planet if all the ideal conditions are checked and sustained atleast as long as that of earth's but it is very unlikely and currently no instrument to properly verify this claim. But it's exciting, isn't it?"),
								false);
				} else if (random_lesson_id == 6) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Trees are likely to be tall and can be seen not very close to each other in order shadowing from others and to receive as much light as possible."),
								false);
				} else if (random_lesson_id == 7) {
					if (!world.isClientSide() && world.getServer() != null)
						world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(
								"Animal life here is most likely to use infrared vision along with being able to see some light of the visible spectrum to view thier environment clearly as the nights can get extremely dark and the days are not as bright as they are here on earth."),
								false);
				}
			}
		}
	}
}
