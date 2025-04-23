package com.sel.day4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TESTNG2 {
	
	//usernam1 , username2, username
	@Test(dataProvider="dp",dataProviderClass=MyClassDp.class)
	public void test(String u,String p)
	{
		System.out.println("Open chrome");
		System.out.println("Url");
		System.out.println(u);
		System.out.println(p);
		System.out.println("login");
	}
	
	//paramer ... 
	//Project End to End(more ,push it on the github)
	// Every push (review session )
	// --> modify -> reason //logic 
	// merge in github
	// jenkins we will you through jenkins --> 
	//
	
	//Rest Assured 
	
}
