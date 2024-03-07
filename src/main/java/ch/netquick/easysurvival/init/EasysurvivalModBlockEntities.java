
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import ch.netquick.easysurvival.block.entity.TreeCropBlockEntity;
import ch.netquick.easysurvival.block.entity.TeleporterPlateBlockEntity;
import ch.netquick.easysurvival.block.entity.EasySmelterBlockEntity;
import ch.netquick.easysurvival.block.entity.EasySawBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyIntakeBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyFridgeBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyForgeBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyForgeAutoBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyEnchantmentTableBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyConverterBlockEntity;
import ch.netquick.easysurvival.block.entity.EasyAnvilBlockEntity;
import ch.netquick.easysurvival.block.entity.CropBlockEntity;
import ch.netquick.easysurvival.EasysurvivalMod;

public class EasysurvivalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EasysurvivalMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CROP = register("crop", EasysurvivalModBlocks.CROP, CropBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TREE_CROP = register("tree_crop", EasysurvivalModBlocks.TREE_CROP, TreeCropBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_ENCHANTMENT_TABLE = register("easy_enchantment_table", EasysurvivalModBlocks.EASY_ENCHANTMENT_TABLE, EasyEnchantmentTableBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_ANVIL = register("easy_anvil", EasysurvivalModBlocks.EASY_ANVIL, EasyAnvilBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_FORGE = register("easy_forge", EasysurvivalModBlocks.EASY_FORGE, EasyForgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TELEPORTER_PLATE = register("teleporter_plate", EasysurvivalModBlocks.TELEPORTER_PLATE, TeleporterPlateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_FRIDGE = register("easy_fridge", EasysurvivalModBlocks.EASY_FRIDGE, EasyFridgeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_SMELTER = register("easy_smelter", EasysurvivalModBlocks.EASY_SMELTER, EasySmelterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_SAW = register("easy_saw", EasysurvivalModBlocks.EASY_SAW, EasySawBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_INTAKE = register("easy_intake", EasysurvivalModBlocks.EASY_INTAKE, EasyIntakeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_FORGE_AUTO = register("easy_forge_auto", EasysurvivalModBlocks.EASY_FORGE_AUTO, EasyForgeAutoBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EASY_CONVERTER = register("easy_converter", EasysurvivalModBlocks.EASY_CONVERTER, EasyConverterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
