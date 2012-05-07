/**Enhanced GUI will add additional functionality to the Minecraft GUI
 * Copyright (C) 2012 Douglas Rourke, Krzysztof Kotarba
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.CraftHUD;

import java.io.File;
import java.util.logging.Logger;

import com.github.CraftHUD.listeners.buttonListener;
import com.github.CraftHUD.listeners.playerListener;
import com.github.CraftHUD.userData.LoadData;
import com.github.CraftHUD.userData.UserData;

import org.bukkit.plugin.java.JavaPlugin;



public class CraftHUD extends JavaPlugin
{
	Logger log = Logger.getLogger("Minecraft");
	public static File crafthud;
	public static String maindirectory = "plugins" + File.separator + "mcMMO";

	/** When the plugin is enabled, it will:
	 *  -create a new instance 
	 *  -pull data from the config.yml file
	 *  -Initialize a listener
	 *  
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */
	public void onEnable() 
	{
        crafthud = this.getFile();
        new File(maindirectory).mkdir();
		
		log.info("CraftHUD has been enabled.");		
		
		UserData.getInstance().loadUsers();
		LoadData.extractFiles();
		
		getServer().getPluginManager().registerEvents(new playerListener(this),this);
		getServer().getPluginManager().registerEvents(new buttonListener(this),this);
	}

	
	/** Displays a message when the plugin is disabled
	 * 
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 */
	public void onDisable()
	{
		log.info("CraftHUD has been disabled");
	}	
}
