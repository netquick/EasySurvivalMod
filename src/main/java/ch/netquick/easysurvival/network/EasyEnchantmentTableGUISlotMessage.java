
package ch.netquick.easysurvival.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

import ch.netquick.easysurvival.world.inventory.EasyEnchantmentTableGUIMenu;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem9Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem8Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem7Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem6Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem5Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem4Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem3Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem2Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUItakeItem1Procedure;
import ch.netquick.easysurvival.procedures.EasyEnchantmentTableGUIresetProcedure;
import ch.netquick.easysurvival.EasysurvivalMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EasyEnchantmentTableGUISlotMessage {
	private final int slotID, x, y, z, changeType, meta;

	public EasyEnchantmentTableGUISlotMessage(int slotID, int x, int y, int z, int changeType, int meta) {
		this.slotID = slotID;
		this.x = x;
		this.y = y;
		this.z = z;
		this.changeType = changeType;
		this.meta = meta;
	}

	public EasyEnchantmentTableGUISlotMessage(FriendlyByteBuf buffer) {
		this.slotID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
		this.changeType = buffer.readInt();
		this.meta = buffer.readInt();
	}

	public static void buffer(EasyEnchantmentTableGUISlotMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.slotID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
		buffer.writeInt(message.changeType);
		buffer.writeInt(message.meta);
	}

	public static void handler(EasyEnchantmentTableGUISlotMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int slotID = message.slotID;
			int changeType = message.changeType;
			int meta = message.meta;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleSlotAction(entity, slotID, changeType, meta, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleSlotAction(Player entity, int slot, int changeType, int meta, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = EasyEnchantmentTableGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (slot == 0 && changeType == 1) {

			EasyEnchantmentTableGUIresetProcedure.execute(world, x, y, z);
		}
		if (slot == 0 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUIresetProcedure.execute(world, x, y, z);
		}
		if (slot == 1 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem1Procedure.execute(world, x, y, z);
		}
		if (slot == 1 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem1Procedure.execute(world, x, y, z);
		}
		if (slot == 2 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem2Procedure.execute(world, x, y, z);
		}
		if (slot == 2 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem2Procedure.execute(world, x, y, z);
		}
		if (slot == 3 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem3Procedure.execute(world, x, y, z);
		}
		if (slot == 3 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem3Procedure.execute(world, x, y, z);
		}
		if (slot == 4 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem4Procedure.execute(world, x, y, z);
		}
		if (slot == 4 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem4Procedure.execute(world, x, y, z);
		}
		if (slot == 5 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem5Procedure.execute(world, x, y, z);
		}
		if (slot == 5 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem5Procedure.execute(world, x, y, z);
		}
		if (slot == 6 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem6Procedure.execute(world, x, y, z);
		}
		if (slot == 6 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem6Procedure.execute(world, x, y, z);
		}
		if (slot == 7 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem7Procedure.execute(world, x, y, z);
		}
		if (slot == 7 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem7Procedure.execute(world, x, y, z);
		}
		if (slot == 8 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem8Procedure.execute(world, x, y, z);
		}
		if (slot == 8 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem8Procedure.execute(world, x, y, z);
		}
		if (slot == 9 && changeType == 1) {

			EasyEnchantmentTableGUItakeItem9Procedure.execute(world, x, y, z);
		}
		if (slot == 9 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUItakeItem9Procedure.execute(world, x, y, z);
		}
		if (slot == 10 && changeType == 1) {

			EasyEnchantmentTableGUIresetProcedure.execute(world, x, y, z);
		}
		if (slot == 10 && changeType == 2) {
			int amount = meta;

			EasyEnchantmentTableGUIresetProcedure.execute(world, x, y, z);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		EasysurvivalMod.addNetworkMessage(EasyEnchantmentTableGUISlotMessage.class, EasyEnchantmentTableGUISlotMessage::buffer, EasyEnchantmentTableGUISlotMessage::new, EasyEnchantmentTableGUISlotMessage::handler);
	}
}
