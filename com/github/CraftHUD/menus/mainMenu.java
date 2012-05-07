package com.github.CraftHUD.menus;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;
import com.github.CraftHUD.screenElements.statButton;

import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.player.SpoutPlayer;


/**Creates the main menu for CraftHUD
 * 
 */
public class mainMenu extends GenericPopup
{	
	exitButton exit = null;
	friendsListButton friendsButton = null;
	statButton statsMenu = null;
	CraftHUD plugin;
		
	/** Places the buttons for the player menu
	 * 
	 * @param SpoutPlayer, CraftHUD
	 */
	public mainMenu(SpoutPlayer sPlayer, CraftHUD plugin) 
	{				
		exit = new exitButton();		
		friendsButton = new friendsListButton();		
		statsMenu = new statButton();	
		
		this.attachWidgets(plugin, exit, friendsButton, statsMenu);
	}
}
