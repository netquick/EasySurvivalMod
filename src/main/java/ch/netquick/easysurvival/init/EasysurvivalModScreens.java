
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import ch.netquick.easysurvival.client.gui.TreeCropGUIScreen;
import ch.netquick.easysurvival.client.gui.TeleporterGUIScreen;
import ch.netquick.easysurvival.client.gui.TeleportSetGUIScreen;
import ch.netquick.easysurvival.client.gui.EasySmelterGUIScreen;
import ch.netquick.easysurvival.client.gui.EasySawGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyIntakeGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyFridgeGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyForgeGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyEnchantmentTableGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyConverterGUIScreen;
import ch.netquick.easysurvival.client.gui.EasyAnvilGUIScreen;
import ch.netquick.easysurvival.client.gui.DedicatedStorageGUIScreen;
import ch.netquick.easysurvival.client.gui.CropGUIScreen;
import ch.netquick.easysurvival.client.gui.CraftingStickGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EasysurvivalModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EasysurvivalModMenus.CROP_GUI.get(), CropGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.TREE_CROP_GUI.get(), TreeCropGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_ENCHANTMENT_TABLE_GUI.get(), EasyEnchantmentTableGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_ANVIL_GUI.get(), EasyAnvilGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.DEDICATED_STORAGE_GUI.get(), DedicatedStorageGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_FORGE_GUI.get(), EasyForgeGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.TELEPORT_SET_GUI.get(), TeleportSetGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.TELEPORTER_GUI.get(), TeleporterGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_SMELTER_GUI.get(), EasySmelterGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_SAW_GUI.get(), EasySawGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_FRIDGE_GUI.get(), EasyFridgeGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_INTAKE_GUI.get(), EasyIntakeGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.EASY_CONVERTER_GUI.get(), EasyConverterGUIScreen::new);
			MenuScreens.register(EasysurvivalModMenus.CRAFTING_STICK_GUI.get(), CraftingStickGUIScreen::new);
		});
	}
}
