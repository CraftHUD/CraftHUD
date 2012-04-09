package com.github.CraftHUD.menus;

import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.player.SpoutPlayer;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;


public class playerMenu extends GenericPopup
{	
	exitButton exit = null;
	friendsListButton friendsButton = null;
	CraftHUD plugin;
	
	/** Places the buttons for the player menu
	 * 
	 * @param SpoutPlayer, CraftHUD
	 */
	public playerMenu(SpoutPlayer sPlayer, CraftHUD plugin) 
	{	
		exit = new exitButton();
		exit.setX(30).setY(30).setDirty(true);
			
		friendsButton = new friendsListButton();	
		friendsButton.setX(30).setY(60).setDirty(true);
		
		this.attachWidgets(plugin, exit, friendsButton);
	}
}
