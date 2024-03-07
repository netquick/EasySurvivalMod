package ch.netquick.easysurvival.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

import ch.netquick.easysurvival.world.inventory.CropGUIMenu;

public class OpenCraftingGUIProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (!(entity instanceof Player))
            return;

        Player player = (Player) entity;
        BlockPos pos = new BlockPos((int) Math.floor(x), (int) Math.floor(y), (int) Math.floor(z)); // Convert doubles to integers

        player.openMenu(new MenuProvider() {
            @Override
            public Component getDisplayName() {
                return null; // You can return a custom display name if needed
            }

            @Override
            public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player player) {
                // Instantiate CropGUIMenu with proper constructor arguments
                return new CropGUIMenu(windowId, playerInventory, new FriendlyByteBuf(Unpooled.buffer()));
            }
        });
    }
}
