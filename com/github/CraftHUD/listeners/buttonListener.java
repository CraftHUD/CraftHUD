package com.github.CraftHUD.listeners;



import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.menus.friendsList;
import com.github.CraftHUD.screenElements.addInputButton;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.player.SpoutPlayer;


public class buttonListener implements Listener
{
	CraftHUD plugin;	
	
	/** Initializes the listener
	 */
	public buttonListener(Plugin CraftHUD) {}

	
	/**Handels menu item selections
	 * 
	 * @param buttonClickEvent
	 */
	@EventHandler
	public void onButtonClick(ButtonClickEvent event) 
	{
		SpoutPlayer sPlayer = event.getPlayer();
		friendsList list = new friendsList(sPlayer, plugin);
		
		
		if (event.getButton() instanceof friendsListButton)
		{
			sPlayer.getMainScreen().closePopup();
			sPlayer.getMainScreen().attachPopupScreen(list);
			sPlayer.getMainScreen().setDirty(true);
		}
		else if (event.getButton() instanceof addInputButton)
		{
		}
		else if (event.getButton() instanceof exitButton) 
            sPlayer.getMainScreen().closePopup();
	}
}
