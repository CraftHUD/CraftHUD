package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.GenericButton;

public class addInputButton extends GenericButton
{
	public addInputButton()
	{
		this.setText("Add");
		this.setWidth(50).setHeight(20);
		this.setDirty(true);
	}
}
