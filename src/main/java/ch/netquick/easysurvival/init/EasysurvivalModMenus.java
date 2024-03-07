
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import ch.netquick.easysurvival.world.inventory.TreeCropGUIMenu;
import ch.netquick.easysurvival.world.inventory.TeleporterGUIMenu;
import ch.netquick.easysurvival.world.inventory.TeleportSetGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasySmelterGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasySawGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyIntakeGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyFridgeGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyForgeGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyEnchantmentTableGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyConverterGUIMenu;
import ch.netquick.easysurvival.world.inventory.EasyAnvilGUIMenu;
import ch.netquick.easysurvival.world.inventory.DedicatedStorageGUIMenu;
import ch.netquick.easysurvival.world.inventory.CropGUIMenu;
import ch.netquick.easysurvival.world.inventory.CraftingStickGUIMenu;
import ch.netquick.easysurvival.EasysurvivalMod;

public class EasysurvivalModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EasysurvivalMod.MODID);
	public static final RegistryObject<MenuType<CropGUIMenu>> CROP_GUI = REGISTRY.register("crop_gui", () -> IForgeMenuType.create(CropGUIMenu::new));
	public static final RegistryObject<MenuType<TreeCropGUIMenu>> TREE_CROP_GUI = REGISTRY.register("tree_crop_gui", () -> IForgeMenuType.create(TreeCropGUIMenu::new));
	public static final RegistryObject<MenuType<EasyEnchantmentTableGUIMenu>> EASY_ENCHANTMENT_TABLE_GUI = REGISTRY.register("easy_enchantment_table_gui", () -> IForgeMenuType.create(EasyEnchantmentTableGUIMenu::new));
	public static final RegistryObject<MenuType<EasyAnvilGUIMenu>> EASY_ANVIL_GUI = REGISTRY.register("easy_anvil_gui", () -> IForgeMenuType.create(EasyAnvilGUIMenu::new));
	public static final RegistryObject<MenuType<DedicatedStorageGUIMenu>> DEDICATED_STORAGE_GUI = REGISTRY.register("dedicated_storage_gui", () -> IForgeMenuType.create(DedicatedStorageGUIMenu::new));
	public static final RegistryObject<MenuType<EasyForgeGUIMenu>> EASY_FORGE_GUI = REGISTRY.register("easy_forge_gui", () -> IForgeMenuType.create(EasyForgeGUIMenu::new));
	public static final RegistryObject<MenuType<TeleportSetGUIMenu>> TELEPORT_SET_GUI = REGISTRY.register("teleport_set_gui", () -> IForgeMenuType.create(TeleportSetGUIMenu::new));
	public static final RegistryObject<MenuType<TeleporterGUIMenu>> TELEPORTER_GUI = REGISTRY.register("teleporter_gui", () -> IForgeMenuType.create(TeleporterGUIMenu::new));
	public static final RegistryObject<MenuType<EasySmelterGUIMenu>> EASY_SMELTER_GUI = REGISTRY.register("easy_smelter_gui", () -> IForgeMenuType.create(EasySmelterGUIMenu::new));
	public static final RegistryObject<MenuType<EasySawGUIMenu>> EASY_SAW_GUI = REGISTRY.register("easy_saw_gui", () -> IForgeMenuType.create(EasySawGUIMenu::new));
	public static final RegistryObject<MenuType<EasyFridgeGUIMenu>> EASY_FRIDGE_GUI = REGISTRY.register("easy_fridge_gui", () -> IForgeMenuType.create(EasyFridgeGUIMenu::new));
	public static final RegistryObject<MenuType<EasyIntakeGUIMenu>> EASY_INTAKE_GUI = REGISTRY.register("easy_intake_gui", () -> IForgeMenuType.create(EasyIntakeGUIMenu::new));
	public static final RegistryObject<MenuType<EasyConverterGUIMenu>> EASY_CONVERTER_GUI = REGISTRY.register("easy_converter_gui", () -> IForgeMenuType.create(EasyConverterGUIMenu::new));
	public static final RegistryObject<MenuType<CraftingStickGUIMenu>> CRAFTING_STICK_GUI = REGISTRY.register("crafting_stick_gui", () -> IForgeMenuType.create(CraftingStickGUIMenu::new));
}
