package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.Color;
import org.getspout.spoutapi.gui.GenericTextField;

/**The design for the textfield on the friendslist
 * 
 */
public class userTextInput extends GenericTextField
{
	public userTextInput()
	{
		this.setFieldColor(new Color(1.0F, 1.0F, 1.0F, 1.0F));
		this.setBorderColor(new Color(0, 0, 0, 1.0F));
		this.setMaximumCharacters(10);
		this.setHeight(15).setWidth(100);
		this.setX(10).setY(30);
		this.setDirty(true);
	}
}
