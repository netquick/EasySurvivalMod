
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ch.netquick.easysurvival.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import ch.netquick.easysurvival.item.QuarzSwordItem;
import ch.netquick.easysurvival.item.QuarzShovelItem;
import ch.netquick.easysurvival.item.QuarzPickaxeItem;
import ch.netquick.easysurvival.item.QuarzHoeItem;
import ch.netquick.easysurvival.item.QuarzAxeItem;
import ch.netquick.easysurvival.item.PortableCraftingTableItem;
import ch.netquick.easysurvival.item.NetherrackSwordItem;
import ch.netquick.easysurvival.item.NetherrackShovelItem;
import ch.netquick.easysurvival.item.NetherrackPickaxeItem;
import ch.netquick.easysurvival.item.NetherrackHoeItem;
import ch.netquick.easysurvival.item.NetherrackAxeItem;
import ch.netquick.easysurvival.item.NetherrackArmorItem;
import ch.netquick.easysurvival.item.NetherStickItem;
import ch.netquick.easysurvival.item.BasaltSwordItem;
import ch.netquick.easysurvival.item.BasaltShovelItem;
import ch.netquick.easysurvival.item.BasaltPickaxeItem;
import ch.netquick.easysurvival.item.BasaltHoeItem;
import ch.netquick.easysurvival.item.BasaltAxeItem;
import ch.netquick.easysurvival.EasysurvivalMod;

public class EasysurvivalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EasysurvivalMod.MODID);
	public static final RegistryObject<Item> NETHER_STICK = REGISTRY.register("nether_stick", () -> new NetherStickItem());
	public static final RegistryObject<Item> CROP = block(EasysurvivalModBlocks.CROP);
	public static final RegistryObject<Item> NETHERRACK_PICKAXE = REGISTRY.register("netherrack_pickaxe", () -> new NetherrackPickaxeItem());
	public static final RegistryObject<Item> NETHERRACK_AXE = REGISTRY.register("netherrack_axe", () -> new NetherrackAxeItem());
	public static final RegistryObject<Item> NETHERRACK_SWORD = REGISTRY.register("netherrack_sword", () -> new NetherrackSwordItem());
	public static final RegistryObject<Item> NETHERRACK_SHOVEL = REGISTRY.register("netherrack_shovel", () -> new NetherrackShovelItem());
	public static final RegistryObject<Item> NETHERRACK_HOE = REGISTRY.register("netherrack_hoe", () -> new NetherrackHoeItem());
	public static final RegistryObject<Item> TREE_CROP = block(EasysurvivalModBlocks.TREE_CROP);
	public static final RegistryObject<Item> BASALT_PICKAXE = REGISTRY.register("basalt_pickaxe", () -> new BasaltPickaxeItem());
	public static final RegistryObject<Item> BASALT_AXE = REGISTRY.register("basalt_axe", () -> new BasaltAxeItem());
	public static final RegistryObject<Item> BASALT_SWORD = REGISTRY.register("basalt_sword", () -> new BasaltSwordItem());
	public static final RegistryObject<Item> BASALT_SHOVEL = REGISTRY.register("basalt_shovel", () -> new BasaltShovelItem());
	public static final RegistryObject<Item> BASALT_HOE = REGISTRY.register("basalt_hoe", () -> new BasaltHoeItem());
	public static final RegistryObject<Item> NETHERRACK_ARMOR_HELMET = REGISTRY.register("netherrack_armor_helmet", () -> new NetherrackArmorItem.Helmet());
	public static final RegistryObject<Item> NETHERRACK_ARMOR_CHESTPLATE = REGISTRY.register("netherrack_armor_chestplate", () -> new NetherrackArmorItem.Chestplate());
	public static final RegistryObject<Item> NETHERRACK_ARMOR_LEGGINGS = REGISTRY.register("netherrack_armor_leggings", () -> new NetherrackArmorItem.Leggings());
	public static final RegistryObject<Item> NETHERRACK_ARMOR_BOOTS = REGISTRY.register("netherrack_armor_boots", () -> new NetherrackArmorItem.Boots());
	public static final RegistryObject<Item> QUARZ_PICKAXE = REGISTRY.register("quarz_pickaxe", () -> new QuarzPickaxeItem());
	public static final RegistryObject<Item> QUARZ_AXE = REGISTRY.register("quarz_axe", () -> new QuarzAxeItem());
	public static final RegistryObject<Item> QUARZ_SWORD = REGISTRY.register("quarz_sword", () -> new QuarzSwordItem());
	public static final RegistryObject<Item> QUARZ_SHOVEL = REGISTRY.register("quarz_shovel", () -> new QuarzShovelItem());
	public static final RegistryObject<Item> QUARZ_HOE = REGISTRY.register("quarz_hoe", () -> new QuarzHoeItem());
	public static final RegistryObject<Item> SPAWNER_BLAZE = block(EasysurvivalModBlocks.SPAWNER_BLAZE);
	public static final RegistryObject<Item> SPAWNER_SLIME = block(EasysurvivalModBlocks.SPAWNER_SLIME);
	public static final RegistryObject<Item> SPAWNER_GHAST = block(EasysurvivalModBlocks.SPAWNER_GHAST);
	public static final RegistryObject<Item> EASY_ENCHANTMENT_TABLE = block(EasysurvivalModBlocks.EASY_ENCHANTMENT_TABLE);
	public static final RegistryObject<Item> EASY_ANVIL = block(EasysurvivalModBlocks.EASY_ANVIL);
	public static final RegistryObject<Item> EASY_FORGE = block(EasysurvivalModBlocks.EASY_FORGE);
	public static final RegistryObject<Item> TELEPORTER_PLATE = block(EasysurvivalModBlocks.TELEPORTER_PLATE);
	public static final RegistryObject<Item> PORTABLE_CRAFTING_TABLE = REGISTRY.register("portable_crafting_table", () -> new PortableCraftingTableItem());
	public static final RegistryObject<Item> EASY_FRIDGE = block(EasysurvivalModBlocks.EASY_FRIDGE);
	public static final RegistryObject<Item> SPAWNER_WITHER_SKELETT = block(EasysurvivalModBlocks.SPAWNER_WITHER_SKELETT);
	public static final RegistryObject<Item> EASY_SMELTER = block(EasysurvivalModBlocks.EASY_SMELTER);
	public static final RegistryObject<Item> SPAWNER_CREEPER = block(EasysurvivalModBlocks.SPAWNER_CREEPER);
	public static final RegistryObject<Item> EASY_SAW = block(EasysurvivalModBlocks.EASY_SAW);
	public static final RegistryObject<Item> SPAWNER_PILLAGER = block(EasysurvivalModBlocks.SPAWNER_PILLAGER);
	public static final RegistryObject<Item> SPAWNER_EVOKER = block(EasysurvivalModBlocks.SPAWNER_EVOKER);
	public static final RegistryObject<Item> EASY_INTAKE = block(EasysurvivalModBlocks.EASY_INTAKE);
	public static final RegistryObject<Item> EASY_FORGE_AUTO = block(EasysurvivalModBlocks.EASY_FORGE_AUTO);
	public static final RegistryObject<Item> EASY_CONVERTER = block(EasysurvivalModBlocks.EASY_CONVERTER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
