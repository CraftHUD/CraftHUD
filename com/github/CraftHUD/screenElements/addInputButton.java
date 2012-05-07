package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.GenericButton;

/**The design for the add button
 * 
 */
public class addInputButton extends GenericButton
{
	public addInputButton()
	{
		this.setText("Add");
		this.setWidth(50).setHeight(20);
		this.setX(150).setY(30).setDirty(true);
	}
}
