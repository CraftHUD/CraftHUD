package com.github.CraftHUD.menus;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.addInputButton;
import com.github.CraftHUD.screenElements.exitButton;
import com.github.CraftHUD.screenElements.userTextInput;

import org.bukkit.entity.Player;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;


public class friendsList extends GenericPopup
{
	CraftHUD plugin;
	GenericLabel playerName = new GenericLabel();
	userTextInput input = null;
	addInputButton add = null;
	exitButton exit = null;
	

	public friendsList (Player player, CraftHUD plugin)
	{	
		String playerDisplayName = player.getDisplayName();
		
		playerName.setHeight(20).setWidth(100);
		playerName.setText(playerDisplayName + "'s Friends List");
		playerName.setX(10).setY(10).setDirty(true);
		
		input = new userTextInput();
		input.setX(10).setY(30);
		
		exit = new exitButton();
		exit.setX(360).setY(5).setDirty(true);
		
		add = new addInputButton();
		add.setX(150).setY(30).setDirty(true);
		
		
		this.attachWidgets(plugin, playerName, input, add, exit);
	}
}
