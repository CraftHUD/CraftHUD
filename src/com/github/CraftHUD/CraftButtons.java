package com.github.CraftHUD;

import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.player.SpoutPlayer;
import com.github.CraftHUD.buttons.*;


public class CraftButtons extends GenericPopup
{	
	exitButton exit = null;
	friendsListButton friends = null;
	CraftHUD plugin;
	
	/** Places the buttons for the player menu
	 * 
	 * @param SpoutPlayer, CraftHUD
	 */
	public CraftButtons(SpoutPlayer sPlayer, CraftHUD plugin) 
	{
		exit = new exitButton();
		exit.setX(50).setY(50).setDirty(true);
		
		
		friends = new friendsListButton();	
		friends.setX(50).setY(80).setDirty(true);
		

		this.attachWidgets(plugin, exit, friends);
	}
}
