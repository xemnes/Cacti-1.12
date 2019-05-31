package com.pau101.cacti.gui;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class CactiGuiFactory implements IModGuiFactory {
	@Override
	public void initialize(Minecraft mc) {}

	@Override
	public boolean hasConfigGui() {
		return GuiConfigCacti.class != null;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
		return null;
	}

	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return null;
	}
}
