package com.github.CraftHUD.screenElements;

import org.getspout.spoutapi.gui.GenericTexture;
import org.getspout.spoutapi.gui.RenderPriority;

/**This is a test design for attaching a .png to the player screen, and is currently not functional
 * 
 */
public class miningIcon extends GenericTexture
{
	public miningIcon()
	{
		this.setWidth(40).setHeight(40);
		this.setUrl("64px-Mining.png");
		this.setPriority(RenderPriority.Highest);
        this.setDirty(true);  
	}
	
}
