package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.GenericTexture;
import org.getspout.spoutapi.gui.RenderPriority;

public class miningIcon extends GenericTexture
{
	public miningIcon()
	{
		//this.setWidth(40).setHeight(40);
		this.setUrl("64px-Mining.png");
		this.setPriority(RenderPriority.Highest);
        this.setDirty(true);  
	}
	
}
