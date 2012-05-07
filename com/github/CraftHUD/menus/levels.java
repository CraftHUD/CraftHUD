package com.github.CraftHUD.menus;


import com.github.CraftHUD.CraftHUD;
import com.github.CraftHUD.screenElements.exitButton;
import com.gmail.nossr50.datatypes.PlayerProfile;
import com.gmail.nossr50.datatypes.SkillType;
import com.gmail.nossr50.util.Users;

import org.bukkit.entity.Player;
import org.getspout.spoutapi.gui.GenericLabel;
import org.getspout.spoutapi.gui.GenericPopup;

/**A menu to allow the player to see their in game stats, the numbers come from mcMMO
 * 
 */
public class levels extends GenericPopup
{
	CraftHUD plugin;
	GenericLabel playerName = new GenericLabel();
	exitButton exit = null;
	
	GenericLabel mining = new GenericLabel();
	GenericLabel woodcutting = new GenericLabel();
	GenericLabel fishing = new GenericLabel();
	GenericLabel acrobatics = new GenericLabel();
	GenericLabel archery = new GenericLabel();
	GenericLabel axes = new GenericLabel();
	GenericLabel excavation = new GenericLabel();
	GenericLabel herbalism = new GenericLabel();
	GenericLabel repair = new GenericLabel();
	GenericLabel swords = new GenericLabel();
	GenericLabel taming = new GenericLabel();
	GenericLabel unarmed = new GenericLabel();
	
	
	/**Creates a list of the players levels in a GUI
	 * 
	 * @param player, plugin
	 */
	public levels (Player player, CraftHUD plugin)
	{	
		String playerDisplayName = player.getDisplayName();
		PlayerProfile PP = Users.getProfile(player);
				
		playerName.setHeight(20).setWidth(100);
		playerName.setText(playerDisplayName + "'s Levels");
		playerName.setX(10).setY(10).setDirty(true);
		
		mining.setHeight(20).setWidth(100);
		mining.setText("Mining: " + PP.getSkillLevel(SkillType.MINING));
		mining.setX(10).setY(40).setDirty(true);
		
		woodcutting.setHeight(20).setWidth(100);
		woodcutting.setText("Woodcutting: " + PP.getSkillLevel(SkillType.WOODCUTTING));
		woodcutting.setX(10).setY(50).setDirty(true);

		fishing.setHeight(20).setWidth(100);
		fishing.setText("Fishing: " + PP.getSkillLevel(SkillType.FISHING));
		fishing.setX(10).setY(60).setDirty(true);
		
		acrobatics.setHeight(20).setWidth(100);
		acrobatics.setText("Acrobatics: " + PP.getSkillLevel(SkillType.ACROBATICS));
		acrobatics.setX(10).setY(70).setDirty(true);

		archery.setHeight(20).setWidth(100);
		archery.setText("Archery: " + PP.getSkillLevel(SkillType.ARCHERY));
		archery.setX(10).setY(80).setDirty(true);

		axes.setHeight(20).setWidth(100);
		axes.setText("Axes: " + PP.getSkillLevel(SkillType.AXES));
		axes.setX(10).setY(90).setDirty(true);
		
		excavation.setHeight(20).setWidth(100);
		excavation.setText("Excavation: " + PP.getSkillLevel(SkillType.EXCAVATION));
		excavation.setX(10).setY(100).setDirty(true);

		herbalism.setHeight(20).setWidth(100);
		herbalism.setText("Herbalism: " + PP.getSkillLevel(SkillType.HERBALISM));
		herbalism.setX(10).setY(110).setDirty(true);
		
		repair.setHeight(20).setWidth(100);
		repair.setText("Repair: " + PP.getSkillLevel(SkillType.REPAIR));
		repair.setX(10).setY(120).setDirty(true);

		swords.setHeight(20).setWidth(100);
		swords.setText("Swords: " + PP.getSkillLevel(SkillType.SWORDS));
		swords.setX(10).setY(130).setDirty(true);
		
		taming.setHeight(20).setWidth(100);
		taming.setText("Taming: " + PP.getSkillLevel(SkillType.TAMING));
		taming.setX(10).setY(140).setDirty(true);
		
		unarmed.setHeight(20).setWidth(100);
		unarmed.setText("Unarmed: " + PP.getSkillLevel(SkillType.UNARMED));
		unarmed.setX(10).setY(150).setDirty(true);

		
		exit = new exitButton();
		exit.setX(360).setY(5).setDirty(true);
		
				
		this.attachWidgets(plugin, playerName, mining, woodcutting, fishing, acrobatics, 
				repair, swords, taming, unarmed, archery, axes, excavation, herbalism, exit);
	}
	
}
