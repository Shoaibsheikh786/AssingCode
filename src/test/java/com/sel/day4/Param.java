package com.sel.day4;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {
	
	@Test
	@Parameters("username")
   public void login(String username)
   {
		System.out.println("opne chorm");
		System.out.println("value "+username);
   }

}
