package ch.netquick.easysurvival.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

import ch.netquick.easysurvival.world.inventory.TeleportSetGUIMenu;

public class TeleportSetGUIScreen extends AbstractContainerScreen<TeleportSetGUIMenu> {
	private final static HashMap<String, Object> guistate = TeleportSetGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox TeleportName;
	Button button_set;

	public TeleportSetGUIScreen(TeleportSetGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("easysurvival:textures/screens/teleport_set_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		TeleportName.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (TeleportName.isFocused())
			return TeleportName.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		TeleportName.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.easysurvival.teleport_set_gui.label_set_teleport"), 56, 15, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		TeleportName = new EditBox(this.font, this.leftPos + 28, this.topPos + 62, 118, 18, Component.translatable("gui.easysurvival.teleport_set_gui.TeleportName")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.easysurvival.teleport_set_gui.TeleportName").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.easysurvival.teleport_set_gui.TeleportName").getString());
				else
					setSuggestion(null);
			}
		};
		TeleportName.setSuggestion(Component.translatable("gui.easysurvival.teleport_set_gui.TeleportName").getString());
		TeleportName.setMaxLength(32767);
		guistate.put("text:TeleportName", TeleportName);
		this.addWidget(this.TeleportName);
		button_set = Button.builder(Component.translatable("gui.easysurvival.teleport_set_gui.button_set"), e -> {
		}).bounds(this.leftPos + 66, this.topPos + 106, 40, 20).build();
		guistate.put("button:button_set", button_set);
		this.addRenderableWidget(button_set);
	}
}
