package com.github.CraftHUD.listeners;


import java.util.logging.Logger;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.menus.mainMenu;
import com.github.CraftHUD.userData.UserData;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.event.input.KeyPressedEvent;
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
			mainMenu craftPop = new mainMenu(sPlayer, plugin);
			
			sPlayer.getMainScreen().attachPopupScreen(craftPop);
            sPlayer.getMainScreen().setDirty(true);
		}
	}
	
	
}
