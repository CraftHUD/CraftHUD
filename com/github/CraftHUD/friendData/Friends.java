package com.github.CraftHUD.friendData;

import java.util.ArrayList;

public class Friends 
{
	ArrayList<String> friendArray = new ArrayList<String>();
	
	public void addFriend(String newFriend)
	{
		if(friendArray.contains(newFriend) != true)
		{
			friendArray.add(newFriend);
		}
	}	
}
