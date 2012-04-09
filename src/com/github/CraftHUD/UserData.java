package com.github.CraftHUD;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.bukkit.entity.Player;



public class UserData 
{
	String location = "plugins/CraftHUD/UserList.txt";
    String directory = "plugins/CraftHUD/";
    private static volatile UserData instance;
    public static HashMap<Player, PlayerList> players = new HashMap<Player, PlayerList>();
    
    
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
    
    
    public static void addUser(Player player) 
    {
        if (!players.containsKey(player)) 
            players.put(player, new PlayerList(player.getName()));
    }
       
    
    public static boolean PlayerExists(Player player)
    {
    	if(players.get(player) != null)
    		return true;
    	return false;  	
    }
    
    
    public static UserData getInstance() 
    {
        if (instance == null) 
            instance = new UserData();
        return instance;
    }
}
