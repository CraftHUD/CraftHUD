package com.github.CraftHUD.screenElements;
import org.getspout.spoutapi.gui.GenericButton;

public class statButton extends GenericButton
{
	/**The design for the player statistics button
	 * 
	 */
	public statButton()
	{
		this.setText("Stats");
		this.setWidth(80).setHeight(20);
		this.setX(30).setY(90).setDirty(true);
	}
}
