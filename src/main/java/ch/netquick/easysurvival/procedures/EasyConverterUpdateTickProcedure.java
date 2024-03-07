package ch.netquick.easysurvival.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public class EasyConverterUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack InputStack = ItemStack.EMPTY;
		ItemStack OutputStack = ItemStack.EMPTY;
		double StackSize = 0;
		double Amount = 0;
		double InAmount = 0;
		InputStack = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 0));
		if (InputStack.getItem() == Blocks.OAK_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_OAK_WOOD.asItem()) {
			StackSize = 64;
			Amount = 4;
			InAmount = 1;
			OutputStack = new ItemStack(Blocks.OAK_PLANKS);
		}
		if (InputStack.getItem() == Blocks.SPRUCE_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_SPRUCE_WOOD.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.SPRUCE_PLANKS);
		}
		if (InputStack.getItem() == Blocks.BIRCH_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_BIRCH_LOG.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.BIRCH_PLANKS);
		}
		if (InputStack.getItem() == Blocks.JUNGLE_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_JUNGLE_LOG.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.JUNGLE_PLANKS);
		}
		if (InputStack.getItem() == Blocks.ACACIA_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_ACACIA_LOG.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.ACACIA_PLANKS);
		}
		if (InputStack.getItem() == Blocks.DARK_OAK_LOG.asItem() || InputStack.getItem() == Blocks.STRIPPED_DARK_OAK_LOG.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.DARK_OAK_PLANKS);
		}
		if (InputStack.getItem() == Blocks.WARPED_STEM.asItem() || InputStack.getItem() == Blocks.STRIPPED_WARPED_STEM.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.WARPED_PLANKS);
		}
		if (InputStack.getItem() == Blocks.CRIMSON_STEM.asItem() || InputStack.getItem() == Blocks.STRIPPED_CRIMSON_STEM.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 4;
			OutputStack = new ItemStack(Blocks.CRIMSON_PLANKS);
		}
		if (InputStack.getItem() == Blocks.BONE_BLOCK.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 9;
			OutputStack = new ItemStack(Items.BONE_MEAL);
		}
		if (InputStack.getItem() == Items.BONE) {
			StackSize = 64;
			InAmount = 1;
			Amount = 3;
			OutputStack = new ItemStack(Items.BONE_MEAL);
		}
		if (InputStack.is(ItemTags.create(new ResourceLocation("forge:planks")))) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COAL);
		}
		if (InputStack.getItem() == Items.GOLD_NUGGET) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Items.GOLD_INGOT);
		}
		if (InputStack.getItem() == Blocks.GOLD_ORE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.GOLD_INGOT);
		}
		if (InputStack.getItem() == Blocks.NETHER_GOLD_ORE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.GOLD_INGOT);
		}
		if (InputStack.getItem() == Blocks.IRON_ORE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.IRON_INGOT);
		}
		if (InputStack.getItem() == Items.IRON_NUGGET) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Items.IRON_INGOT);
		}
		if (InputStack.getItem() == Items.IRON_INGOT) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.IRON_BLOCK);
		}
		if (InputStack.getItem() == Items.GOLD_INGOT) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.GOLD_BLOCK);
		}
		if (InputStack.getItem() == Items.COAL) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.COAL_BLOCK);
		}
		if (InputStack.getItem() == Items.DIAMOND) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.DIAMOND_BLOCK);
		}
		if (InputStack.getItem() == Items.NETHERITE_INGOT) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.NETHERITE_BLOCK);
		}
		if (InputStack.getItem() == Items.REDSTONE) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.REDSTONE_BLOCK);
		}
		if (InputStack.getItem() == Items.LAPIS_LAZULI) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.LAPIS_BLOCK);
		}
		if (InputStack.getItem() == Items.WATER_BUCKET) {
			StackSize = 64;
			InAmount = 0;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.PACKED_ICE);
		}
		if (InputStack.getItem() == Blocks.PACKED_ICE.asItem()) {
			StackSize = 16;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.SNOWBALL);
		}
		if (InputStack.getItem() == Items.SNOWBALL) {
			StackSize = 64;
			InAmount = 4;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.SNOW_BLOCK);
		}
		if (InputStack.getItem() == Blocks.NETHERRACK.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.COBBLESTONE);
		}
		if (InputStack.getItem() == Blocks.COBBLESTONE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.STONE);
		}
		if (InputStack.getItem() == Blocks.STONE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.SMOOTH_STONE);
		}
		if (InputStack.getItem() == Items.QUARTZ) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.IRON_INGOT);
		}
		if (InputStack.getItem() == Blocks.ANCIENT_DEBRIS.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.NETHERITE_SCRAP);
		}
		if (InputStack.getItem() == Items.WHEAT) {
			StackSize = 64;
			InAmount = 3;
			Amount = 1;
			OutputStack = new ItemStack(Items.BREAD);
		}
		if (InputStack.getItem() == Items.GLOWSTONE_DUST) {
			StackSize = 64;
			InAmount = 9;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.GLOWSTONE);
		}
		if (InputStack.getItem() == Items.POTATO) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.BAKED_POTATO);
		}
		if (InputStack.getItem() == Items.PORKCHOP) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_PORKCHOP);
		}
		if (InputStack.getItem() == Items.BEEF) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_BEEF);
		}
		if (InputStack.getItem() == Items.CHICKEN) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_CHICKEN);
		}
		if (InputStack.getItem() == Items.MUTTON) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_MUTTON);
		}
		if (InputStack.getItem() == Items.RABBIT) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_RABBIT);
		}
		if (InputStack.getItem() == Items.SALMON) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_SALMON);
		}
		if (InputStack.getItem() == Items.COD) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COOKED_COD);
		}
		if (InputStack.getItem() == Blocks.SAND.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.GLASS);
		}
		if (InputStack.getItem() == Items.CHORUS_FRUIT) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.POPPED_CHORUS_FRUIT);
		}
		if (InputStack.getItem() == Blocks.SUGAR_CANE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.PAPER);
		}
		if (InputStack.getItem() == Blocks.END_STONE.asItem()) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Blocks.END_STONE_BRICKS);
		}
		if (InputStack.getItem() == Items.RAW_IRON) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.IRON_INGOT);
		}
		if (InputStack.getItem() == Items.RAW_COPPER) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.COPPER_INGOT);
		}
		if (InputStack.getItem() == Items.RAW_GOLD) {
			StackSize = 64;
			InAmount = 1;
			Amount = 1;
			OutputStack = new ItemStack(Items.GOLD_INGOT);
		}
		if (((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == Blocks.AIR.asItem() || (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == OutputStack.getItem() && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 1) <= StackSize - Amount) && new Object() {
			public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicInteger _retval = new AtomicInteger(0);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
				return _retval.get();
			}
		}.getAmount(world, BlockPos.containing(x, y, z), 0) >= InAmount) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 1;
					final ItemStack _setstack = OutputStack.copy();
					_setstack.setCount((int) (new Object() {
						public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
							AtomicInteger _retval = new AtomicInteger(0);
							BlockEntity _ent = world.getBlockEntity(pos);
							if (_ent != null)
								_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
							return _retval.get();
						}
					}.getAmount(world, BlockPos.containing(x, y, z), 1) + Amount));
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable)
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
					});
				}
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				if (_ent != null) {
					final int _slotid = 0;
					final int _amount = (int) InAmount;
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							ItemStack _stk = capability.getStackInSlot(_slotid).copy();
							_stk.shrink(_amount);
							((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
						}
					});
				}
			}
		}
	}
}
