package com.github.CraftHUD;

//import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
//import org.getspout.spoutapi.SpoutManager;
//import org.getspout.spoutapi.gui.Color;
//import org.getspout.spoutapi.gui.GenericGradient;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;
//import org.getspout.spoutapi.gui.GenericTexture;
//import org.getspout.spoutapi.gui.RenderPriority;
//import org.getspout.spoutapi.gui.Widget;
import org.getspout.spoutapi.player.SpoutPlayer;

public class GUITest
{
	String playerName = null;

	
	public GUITest(Player player, CraftHUD plugin)
	{
		playerName = player.getName();
		SpoutPlayer splayer = (SpoutPlayer) player;
		GenericPopup somePopup = new GenericPopup();
		GenericLabel label = new GenericLabel("This is a label");
		somePopup.attachWidget(plugin, label);
		splayer.getMainScreen().attachPopupScreen(somePopup);
	}
}
