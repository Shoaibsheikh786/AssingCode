package com.sel.day4;

import org.testng.annotations.DataProvider;

public class MyClassDp {
	
	@DataProvider
	public String[][] dp()
	{
		String arr[][]= {
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"}
		};
		
		return arr;
	}


}
