package com.java.utils;

import java.util.Random;

import com.github.javafaker.Faker;

public class RandomData {
	
	static Faker faker;
  public static int genRandom()
  {
	  Random random = new Random();
      return random.nextInt(4) + 0; // Generates 0 to 4
  }
  
  public static double calculateTax(double amount) {
      double tax = amount * 0.08;
      return Math.round(tax * 100.0) / 100.0; // Rounds to 2 decimal places
  }
  
  public static String getFirstname()
  {
//	 return new Faker().name().firstName();
	  faker=new Faker();
	 String fname= faker.name().firstName();
	 return fname;
	  
  }
  
  public static String getLastName()
  {
	 return new Faker().name().lastName();	
  }
  
  public static String getPostalAddress()
  {
	  return new Faker().number().digits(6);
  }
  

  


}
