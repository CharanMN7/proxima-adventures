
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.proximaadventure.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.proximaadventure.ProximaAdventureMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ProximaAdventureModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProximaAdventureMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ProximaAdventureModBlocks.PROXIMAN_SOIL.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ProximaAdventureModItems.PROXIMA_B_DIMENSION.get());
		}
	}
}
