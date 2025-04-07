package com.java.utils;

import java.util.Random;

public class RandomData {
	
  public static int genRandom()
  {
	  Random random = new Random();
      return random.nextInt(4) + 0; // Generates 0 to 4
  }
  
  public static double calculateTax(double amount) {
      double tax = amount * 0.08;
      return Math.round(tax * 100.0) / 100.0; // Rounds to 2 decimal places
  }
  


}
