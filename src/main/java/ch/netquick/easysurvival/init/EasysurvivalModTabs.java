
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import ch.netquick.easysurvival.EasysurvivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EasysurvivalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EasysurvivalMod.MODID);
	public static final RegistryObject<CreativeModeTab> EASY_SURVIVAL = REGISTRY.register("easy_survival",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.easysurvival.easy_survival")).icon(() -> new ItemStack(Blocks.JUNGLE_SAPLING)).displayItems((parameters, tabData) -> {
				tabData.accept(EasysurvivalModBlocks.CROP.get().asItem());
				tabData.accept(EasysurvivalModBlocks.TREE_CROP.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_ENCHANTMENT_TABLE.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_ANVIL.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_FORGE.get().asItem());
				tabData.accept(EasysurvivalModItems.PORTABLE_CRAFTING_TABLE.get());
				tabData.accept(EasysurvivalModBlocks.EASY_FRIDGE.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_SMELTER.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_SAW.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_INTAKE.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_FORGE_AUTO.get().asItem());
				tabData.accept(EasysurvivalModBlocks.EASY_CONVERTER.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EasysurvivalModBlocks.SPAWNER_BLAZE.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_SLIME.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_GHAST.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_WITHER_SKELETT.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_CREEPER.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_PILLAGER.get().asItem());
			tabData.accept(EasysurvivalModBlocks.SPAWNER_EVOKER.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(EasysurvivalModBlocks.TELEPORTER_PLATE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EasysurvivalModItems.NETHERRACK_SWORD.get());
			tabData.accept(EasysurvivalModItems.BASALT_SWORD.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_ARMOR_HELMET.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_ARMOR_CHESTPLATE.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_ARMOR_LEGGINGS.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_ARMOR_BOOTS.get());
			tabData.accept(EasysurvivalModItems.QUARZ_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EasysurvivalModItems.NETHER_STICK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EasysurvivalModItems.NETHERRACK_PICKAXE.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_AXE.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_SHOVEL.get());
			tabData.accept(EasysurvivalModItems.NETHERRACK_HOE.get());
			tabData.accept(EasysurvivalModItems.BASALT_PICKAXE.get());
			tabData.accept(EasysurvivalModItems.BASALT_AXE.get());
			tabData.accept(EasysurvivalModItems.BASALT_SHOVEL.get());
			tabData.accept(EasysurvivalModItems.BASALT_HOE.get());
			tabData.accept(EasysurvivalModItems.QUARZ_PICKAXE.get());
			tabData.accept(EasysurvivalModItems.QUARZ_AXE.get());
			tabData.accept(EasysurvivalModItems.QUARZ_SHOVEL.get());
			tabData.accept(EasysurvivalModItems.QUARZ_HOE.get());
		}
	}
}
