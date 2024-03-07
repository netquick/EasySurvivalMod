package ch.netquick.easysurvival.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import ch.netquick.easysurvival.world.inventory.TeleporterGUIMenu;

public class TeleporterGUIScreen extends AbstractContainerScreen<TeleporterGUIMenu> {
	private final static HashMap<String, Object> guistate = TeleporterGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_teleport;
	Button button_teleport1;

	public TeleporterGUIScreen(TeleporterGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("easysurvival:textures/screens/teleporter_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.easysurvival.teleporter_gui.label_teleport_1"), 6, 25, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.easysurvival.teleporter_gui.label_teleport_2"), 6, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.easysurvival.teleporter_gui.label_easyteleport"), 6, 7, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_teleport = Button.builder(Component.translatable("gui.easysurvival.teleporter_gui.button_teleport"), e -> {
		}).bounds(this.leftPos + 78, this.topPos + 25, 65, 20).build();
		guistate.put("button:button_teleport", button_teleport);
		this.addRenderableWidget(button_teleport);
		button_teleport1 = Button.builder(Component.translatable("gui.easysurvival.teleporter_gui.button_teleport1"), e -> {
		}).bounds(this.leftPos + 78, this.topPos + 52, 65, 20).build();
		guistate.put("button:button_teleport1", button_teleport1);
		this.addRenderableWidget(button_teleport1);
	}
}