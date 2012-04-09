package com.github.CraftHUD;

import com.github.CraftHUD.menus.friendsList;
import com.github.CraftHUD.menus.playerMenu;
import com.github.CraftHUD.screenElements.addInputButton;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.friendsListButton;


import java.util.logging.Logger;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
import org.getspout.spoutapi.event.screen.ButtonClickEvent;
import org.getspout.spoutapi.keyboard.Keyboard;
import org.getspout.spoutapi.player.SpoutPlayer;


public class playerListener implements Listener
{
	Logger log = Logger.getLogger("Minecraft");
	CraftHUD plugin;	
	
	/** Initializes the listener
	 */
	public playerListener(Plugin CraftHUD) {}
	
	
	/** On player login, a message will display informing the player of how to open their menu
	 *
	 * @param PlayerJoinEvent
	 */
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		log.info("Player Joined");
		Player player = event.getPlayer();
		String name = player.getDisplayName();
		
		if (!UserData.PlayerExists(player))
			UserData.addUser(player);
		else
			player.sendMessage("Welcome back " +name+ "!");
		player.sendMessage("Press the 'J' key to access menu");
	}
	
	
	/** When the player presses the J key, it will bring up the menu
	 * 
	 * @param KeyPressedEvent
	 */
	@EventHandler
	public void onKeyPressedEvent(KeyPressedEvent event) 
	{
		SpoutPlayer sPlayer = event.getPlayer();	
		
		if (event.getKey() == Keyboard.KEY_J) 
		{
			playerMenu craftPop = new playerMenu(sPlayer, plugin);
			
			sPlayer.getMainScreen().attachPopupScreen(craftPop);
            sPlayer.getMainScreen().setDirty(true);
		}
	}
	
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
			//Will be pressed to add a name from the text field
		}
		else if (event.getButton() instanceof exitButton) 
            sPlayer.getMainScreen().closePopup();
	}
}
