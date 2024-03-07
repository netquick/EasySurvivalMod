
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import ch.netquick.easysurvival.block.TreeCropBlock;
import ch.netquick.easysurvival.block.TeleporterPlateBlock;
import ch.netquick.easysurvival.block.SpawnerWitherSkelettBlock;
import ch.netquick.easysurvival.block.SpawnerSlimeBlock;
import ch.netquick.easysurvival.block.SpawnerPillagerBlock;
import ch.netquick.easysurvival.block.SpawnerGhastBlock;
import ch.netquick.easysurvival.block.SpawnerEvokerBlock;
import ch.netquick.easysurvival.block.SpawnerCreeperBlock;
import ch.netquick.easysurvival.block.SpawnerBlazeBlock;
import ch.netquick.easysurvival.block.EasySmelterBlock;
import ch.netquick.easysurvival.block.EasySawBlock;
import ch.netquick.easysurvival.block.EasyIntakeBlock;
import ch.netquick.easysurvival.block.EasyFridgeBlock;
import ch.netquick.easysurvival.block.EasyForgeBlock;
import ch.netquick.easysurvival.block.EasyForgeAutoBlock;
import ch.netquick.easysurvival.block.EasyEnchantmentTableBlock;
import ch.netquick.easysurvival.block.EasyConverterBlock;
import ch.netquick.easysurvival.block.EasyAnvilBlock;
import ch.netquick.easysurvival.block.CropBlock;
import ch.netquick.easysurvival.EasysurvivalMod;

public class EasysurvivalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EasysurvivalMod.MODID);
	public static final RegistryObject<Block> CROP = REGISTRY.register("crop", () -> new CropBlock());
	public static final RegistryObject<Block> TREE_CROP = REGISTRY.register("tree_crop", () -> new TreeCropBlock());
	public static final RegistryObject<Block> SPAWNER_BLAZE = REGISTRY.register("spawner_blaze", () -> new SpawnerBlazeBlock());
	public static final RegistryObject<Block> SPAWNER_SLIME = REGISTRY.register("spawner_slime", () -> new SpawnerSlimeBlock());
	public static final RegistryObject<Block> SPAWNER_GHAST = REGISTRY.register("spawner_ghast", () -> new SpawnerGhastBlock());
	public static final RegistryObject<Block> EASY_ENCHANTMENT_TABLE = REGISTRY.register("easy_enchantment_table", () -> new EasyEnchantmentTableBlock());
	public static final RegistryObject<Block> EASY_ANVIL = REGISTRY.register("easy_anvil", () -> new EasyAnvilBlock());
	public static final RegistryObject<Block> EASY_FORGE = REGISTRY.register("easy_forge", () -> new EasyForgeBlock());
	public static final RegistryObject<Block> TELEPORTER_PLATE = REGISTRY.register("teleporter_plate", () -> new TeleporterPlateBlock());
	public static final RegistryObject<Block> EASY_FRIDGE = REGISTRY.register("easy_fridge", () -> new EasyFridgeBlock());
	public static final RegistryObject<Block> SPAWNER_WITHER_SKELETT = REGISTRY.register("spawner_wither_skelett", () -> new SpawnerWitherSkelettBlock());
	public static final RegistryObject<Block> EASY_SMELTER = REGISTRY.register("easy_smelter", () -> new EasySmelterBlock());
	public static final RegistryObject<Block> SPAWNER_CREEPER = REGISTRY.register("spawner_creeper", () -> new SpawnerCreeperBlock());
	public static final RegistryObject<Block> EASY_SAW = REGISTRY.register("easy_saw", () -> new EasySawBlock());
	public static final RegistryObject<Block> SPAWNER_PILLAGER = REGISTRY.register("spawner_pillager", () -> new SpawnerPillagerBlock());
	public static final RegistryObject<Block> SPAWNER_EVOKER = REGISTRY.register("spawner_evoker", () -> new SpawnerEvokerBlock());
	public static final RegistryObject<Block> EASY_INTAKE = REGISTRY.register("easy_intake", () -> new EasyIntakeBlock());
	public static final RegistryObject<Block> EASY_FORGE_AUTO = REGISTRY.register("easy_forge_auto", () -> new EasyForgeAutoBlock());
	public static final RegistryObject<Block> EASY_CONVERTER = REGISTRY.register("easy_converter", () -> new EasyConverterBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
