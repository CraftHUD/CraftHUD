package com.github.CraftHUD.userData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.bukkit.entity.Player;


/**Creates a list to keep track of which players have been on the server
 * 
 */
public class UserData 
{
	String location = "plugins/CraftHUD/UserList.txt";
    String directory = "plugins/CraftHUD/";
    private static volatile UserData instance;
    public static HashMap<Player, PlayerList> players = new HashMap<Player, PlayerList>();
    
    /**Creates the files to store data
     * @throws IOException
     */
    public void loadUsers() 
    {
        new File(directory).mkdir();
        File theDir = new File(location);

        if (!theDir.exists()) 
        {
            try 
            {
                FileWriter writer = new FileWriter(theDir);
                writer.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
    /**Adds a user to the list
     * @param player
     * 
     */
    public static void addUser(Player player) 
    {
        if (!players.containsKey(player)) 
            players.put(player, new PlayerList(player.getName()));
    }
       
    /**Checks if the player name exists in the list
     * @param player
     * @return true if player has been on the server
     */
    public static boolean PlayerExists(Player player)
    {
    	if(players.get(player) != null)
    		return true;
    	return false;  	
    }
    
    /**Returns a new instance of userData if it is null
     * 
     */
    public static UserData getInstance() 
    {
        if (instance == null) 
            instance = new UserData();
        return instance;
    }
}
