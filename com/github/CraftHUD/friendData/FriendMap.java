package com.github.CraftHUD.friendData;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**Maintains a hash map for the friends list
 * 
 */
public class FriendMap extends JavaPlugin implements Listener
{
	 public static Map<Player, Friends> friendsMap = new HashMap<Player,  Friends>();
	 
	 
	    @EventHandler
	    public void onPlayerLogin(PlayerLoginEvent event)
	    {
	    	Friends friendlist = new Friends();
	        if(!friendsMap.containsKey(event.getPlayer().getName()))
	        {	        	
	            friendsMap.put(event.getPlayer(), friendlist);
	        }
	        
	    }
	    
	    public static void addnewFriend(Player player, String newFriend)
	    {
	    	friendsMap.get(player).addFriend(newFriend);
	    	try 
	    	{
				SLAPI.save(friendsMap,"plugins/CraftHUD/Resources/");
			} 
	    	catch (Exception e) 
	    	{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	   

}
