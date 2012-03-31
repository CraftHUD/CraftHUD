package com.github.CraftHUD;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class EGListener implements Listener
{

	private final CraftHUD plugin;

	/** Initializes the listener
	 * 
	 */
	public EGListener(final CraftHUD plugin)
	{
		this.plugin = plugin;
	}
	
	
	/** On player login, a message will display informing the player of how to open their menu
	 *
	 */
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event)
	{
		Player player = event.getPlayer();
		plugin.send(player, "PENIS!!!!");
//		GUITest samplePopup = new GUITest(player, this);
	}
}
