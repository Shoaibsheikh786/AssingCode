package com.swag_labs.tests;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ScreenRec {

	@Test
	public void countEachCharacter() {
		String str = "muneerahmadsheikh";
		HashMap<Character, Integer> data = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			data.put(str.charAt(i), data.getOrDefault(str.charAt(i), 0) + 1);
		}

		for (Entry<Character, Integer> e : data.entrySet()) {
			if(e.getValue()>1)
			{
				System.out.println(e.getKey() + "--> " + e.getValue());
			}
			
		}
	}

	@Test
	void sorting() {
		int arr[] = { 4, 2, 5, 8, 9, 7 };
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				
				if(arr[j]>arr[j+1])
				{    
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
	
				}

			}
		}
		
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	}
	
	@Test
	public void reverse()
	{
		int n=1234;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
	}
	
	

}
