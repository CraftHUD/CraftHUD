package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.Color;
import org.getspout.spoutapi.gui.GenericTextField;

public class userTextInput extends GenericTextField
{
	public userTextInput()
	{
		this.setText("Friend Name...");
		this.setFieldColor(new Color(1.0F, 1.0F, 1.0F, 1.0F));
		this.setBorderColor(new Color(0, 0, 0, 1.0F));
		this.setMaximumCharacters(10);
		this.setHeight(15).setWidth(100);
		this.setDirty(true);
	}
	public String userTyped()
	{
		return this.getText();
	}
}
