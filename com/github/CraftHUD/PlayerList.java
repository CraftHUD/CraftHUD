package com.github.CraftHUD;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.logging.Logger;

import org.bukkit.Bukkit;

public class PlayerList 
{
	Logger log = Logger.getLogger("Minecraft");
	private String playerName;
	String location = "plugins/CraftHUD/UserList.txt";
	
	public PlayerList(String name)
	{
		playerName = name;
		addPlayer();
	}
	
	public void addPlayer()
    {
		try 
		{
			FileWriter file = new FileWriter(location, true);
            BufferedWriter out = new BufferedWriter(file);           
            
            out.append(playerName);
            out.newLine();
			out.close();
        } 
		catch (Exception e) 
		{
            Bukkit.getLogger().severe("Exception while writing to " + location + " (Are you sure you formatted it correctly?)" + e.toString());
        }
    }	
}
