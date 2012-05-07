package com.github.CraftHUD.screenElements;
import org.getspout.spoutapi.gui.GenericButton;

public class friendsListButton extends GenericButton
{
	/**The design for the friends list button
	 * 
	 */
	public friendsListButton()
	{
		this.setText("Friends List");
		this.setWidth(80).setHeight(20);
		this.setX(30).setY(60).setDirty(true);
	}
}
