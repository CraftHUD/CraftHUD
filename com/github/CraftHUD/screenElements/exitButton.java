package com.github.CraftHUD.screenElements;
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
		this.setX(360).setY(5).setDirty(true);
	}
}
