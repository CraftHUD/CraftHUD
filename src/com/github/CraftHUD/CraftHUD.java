/**Enhanced GUI will add additional functionality to the Minecraft GUI
 * 
 * @author Douglas Rourke
 * @author Krzysztof Kotarba
 * @version 0.0.1
 */
package com.github.CraftHUD;

import java.io.File;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class CraftHUD extends JavaPlugin
{
	
	Logger log = Logger.getLogger("Minecraft");
	public static String maindirectory = "plugins" + File.separator + "CraftHUD";	
	
	
	
	/** Displays a message when the plugin is disabled
	 * 
	 * @see org.bukkit.plugin.java.JavaPlugin#onDisable()
	 */
	public void onDisable()
	{
		log.info("CraftHUD has been disabled");
	}

	
	/** When the plugin is enabled, it will:
	 *  -create a new instance 
	 *  -pull data from the config.yml file
	 *  -Initialize a listener
	 *  
	 * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	 */
	public void onEnable() 
	{
		log.info("CraftHUD has been enabled.");
		
		getServer().getPluginManager().registerEvents(new EGListener(this),this);
	}

	

	

	

	

}
