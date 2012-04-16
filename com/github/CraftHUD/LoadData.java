package com.github.CraftHUD;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.bukkit.Bukkit;


public class LoadData 
{
	static CraftHUD plugin = (CraftHUD) Bukkit.getServer().getPluginManager().getPlugin("craftHUD");
	
	public static void writeFile(String theFileName)
	{
	    try 
	    {
	        File currentFile = new File("plugins/CraftHUD/Resources/"+theFileName);
	        @SuppressWarnings("static-access")
	        JarFile jar = new JarFile(plugin.crafthud);
	        JarEntry entry = jar.getJarEntry("resources/"+theFileName);
	        InputStream is = jar.getInputStream(entry);
	        byte[] buf = new byte[2048];
	        int nbRead;
	        OutputStream os = new BufferedOutputStream(new FileOutputStream(currentFile));
	        while((nbRead = is.read(buf)) != -1) 
	        {
	            os.write(buf, 0, nbRead);
	        }
	        os.flush();
	        os.close();
	    }
	    catch (FileNotFoundException e) 
	    {
	        e.printStackTrace();
	    } 
	    catch (IOException e) 
	    {
	        e.printStackTrace();
	    }
	}
	
	public static void extractFiles()
	{
		new File("plugins/CraftHUD/Resources/").mkdir();
		writeFile("64px-Mining.png");
		
	}
	
}
