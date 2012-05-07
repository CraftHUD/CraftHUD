package com.github.CraftHUD.listeners;



import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.friendData.FriendMap;
import com.github.CraftHUD.menus.friendsList;
import com.github.CraftHUD.menus.levels;
import com.github.CraftHUD.screenElements.addInputButton;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;
import com.github.CraftHUD.screenElements.statButton;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.event.screen.TextFieldChangeEvent;
import org.getspout.spoutapi.player.SpoutPlayer;

/**This listener handles all button inputs from the player
 * 
 */
public class buttonListener implements Listener
{
	CraftHUD plugin;	
	String friendname = null;
	/** Initializes the listener
	 */
	public buttonListener(Plugin CraftHUD) {}

	
	/**Handles menu item selections
	 * 
	 * @param buttonClickEvent
	 */
	@EventHandler
	public void onButtonClick(ButtonClickEvent event) 
	{
		SpoutPlayer sPlayer = event.getPlayer();
		friendsList list = new friendsList(sPlayer, plugin);
		levels stats = new levels(sPlayer, plugin);
		
		if (event.getButton() instanceof friendsListButton)
		{
			sPlayer.getMainScreen().closePopup();
			sPlayer.getMainScreen().attachPopupScreen(list);			
			sPlayer.getMainScreen().setDirty(true);
		}
		
		else if (event.getButton() instanceof addInputButton)
		{
			sPlayer.sendMessage(friendname);
			FriendMap.addnewFriend(event.getPlayer(), friendname);
		}
		
		else if (event.getButton() instanceof statButton)
		{
			sPlayer.getMainScreen().closePopup();
			sPlayer.getMainScreen().attachPopupScreen(stats);
			sPlayer.getMainScreen().setDirty(true);
		}
		
		else if (event.getButton() instanceof exitButton) 
		{
			sPlayer.getMainScreen().closePopup();
		}
	}
	
	/**Stores player input in the custom text field as a string, which is accessed by addInputButton
	 * 
	 */
	@EventHandler
	public void inputListener(TextFieldChangeEvent event)
	{
		friendname = event.getTextField().getText();
	}
}
