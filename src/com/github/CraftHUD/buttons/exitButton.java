package com.github.CraftHUD.buttons;
import org.getspout.spoutapi.gui.GenericButton;

public class exitButton extends GenericButton
{
	/**The design for the exit button
	 * 
	 */
	public exitButton()
	{
		this.setText("EXIT");
		this.setWidth(60).setHeight(20);
		this.setDirty(true);
	}
}
