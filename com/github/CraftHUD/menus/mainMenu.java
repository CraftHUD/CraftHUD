package com.github.CraftHUD.menus;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;
import com.github.CraftHUD.screenElements.miningIcon;

import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.player.SpoutPlayer;



public class mainMenu extends GenericPopup
{	
	exitButton exit = null;
	friendsListButton friendsButton = null;
	miningIcon mine = null;
	CraftHUD plugin;
	
	
	
	
	/** Places the buttons for the player menu
	 * 
	 * @param SpoutPlayer, CraftHUD
	 */
	public mainMenu(SpoutPlayer sPlayer, CraftHUD plugin) 
	{	
		mine = new miningIcon();
		mine.setX(100).setY(100).setDirty(true);
			
		
		exit = new exitButton();
		exit.setX(360).setY(5).setDirty(true);
			
		friendsButton = new friendsListButton();	
		friendsButton.setX(30).setY(60).setDirty(true);
		
		this.attachWidgets(plugin, exit, friendsButton, mine);
	}
}
