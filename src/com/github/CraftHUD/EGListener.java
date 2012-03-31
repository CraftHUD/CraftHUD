package github.CraftHUD;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class EGListener implements Listener
{
	/** Initializes the listener
	 * 
	 */
	public EGListener(CraftHUD plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	/** On player login, a message will display informing the player of how to open their menu
	 *
	 */
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event)
	{
		Player player = event.getPlayer();
		send(player, "PENIS!!!!");
//		GUITest samplePopup = new GUITest(player, this);
	}


	/**Allows the player to be sent a message in game
	 * 
	 */
	public void send(Player player, String message, ChatColor color) 
	{
		player.sendMessage(color + message);
	}
	public void send(Player player, String message) 
	{
		send(player, message, ChatColor.AQUA);
	}
}
