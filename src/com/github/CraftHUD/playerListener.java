package com.github.CraftHUD;

import com.github.CraftHUD.playerMenu;
import java.util.logging.Logger;
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
	playerMenu gui = new playerMenu();
	
	
	/** Initializes the listener
	 */
	public playerListener(Plugin CraftHUD) {}
	
	
	/** On player login, a message will display informing the player of how to open their menu
	 *
	 */
	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		log.info("Player Joined");
		Player player = event.getPlayer();
		player.sendMessage("Press the 'J' key to access menu");
	}
	
	
	/** When the player presses the J key, it will bring up the menu
	 * 
	 */
	@EventHandler
	public void onKeyPressedEvent(KeyPressedEvent event) 
	{
		SpoutPlayer sPlayer = event.getPlayer();	
		
		if (event.getKey() == Keyboard.KEY_J) 
			gui.DisplayMenu(sPlayer);
	}
}
