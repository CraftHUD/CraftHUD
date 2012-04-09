package com.github.CraftHUD.menus;

import org.bukkit.entity.Player;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;

import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.addInputButton;
import com.github.CraftHUD.screenElements.userTextInput;

public class friendsList extends GenericPopup
{
	CraftHUD plugin;
	GenericLabel playerName = new GenericLabel();
	userTextInput input = null;
	addInputButton add = null;
	

	public friendsList (Player player, CraftHUD plugin)
	{	
		String playerDisplayName = player.getDisplayName();
		
		playerName.setHeight(20).setWidth(100);
		playerName.setText(playerDisplayName + "'s Friends List");
		playerName.setX(10).setY(10).setDirty(true);
		
		input = new userTextInput();
		input.setX(10).setY(30);
		
		add = new addInputButton();
		add.setX(150).setY(30).setDirty(true);
		
		
		this.attachWidgets(plugin, playerName, input, add);
	}


	public String getText() 
	{
		return input.userTyped();
	}
}
