package com.github.CraftHUD;

import org.bukkit.entity.Player;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
import org.getspout.spoutapi.player.SpoutPlayer;

public class playerMenu
{	
	private CraftHUD plugin;
	
	/** Initializes the players menu
	 */
	public playerMenu() {}

	
	/** Public method that calls initializeDisplay
	 * 
	 * @param Player
	 */
	public void DisplayMenu(Player player)
	{
		initializeMenu(SpoutManager.getPlayer(player));
	}
	
	
	/** Sets the design for the menu
	 * 
	 * @parm SpoutPlayer
	 */
	private void initializeMenu(SpoutPlayer sPlayer)
	{
		GenericPopup somePopup = new GenericPopup();
		GenericLabel label = new GenericLabel("This is a label");
		
		somePopup.attachWidget(plugin, label);
		sPlayer.getMainScreen().attachPopupScreen(somePopup);
		
		sPlayer.getMainScreen().setDirty(true);
	}
}
