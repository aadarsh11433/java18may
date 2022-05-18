package com.aadarsh;

public class CheckWeather {
	
	static  void goOutOrNot(boolean s,boolean r,double t)
	{
	      if (s == true) {
	    	 
	    	  System.out.println("Let’s stay home.");
	    	  return;
	      }
	      else if(r == true) {
	    	
	    	  System.out.println("Let’s stay home.");
	    	  return;
	      }
	      
	      else if(t < 50.00) {
		    	
	    	  System.out.println("Let’s stay home.");
	    	  return;
	      }
	      else {
	    	  System.out.println("Let’s go out!");
	    	  return;
	      }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isSnowing = false;
		boolean isRaining = false;
		double temperature = 60;
		
		goOutOrNot(isSnowing,isRaining,temperature);
		
		//print "Let’s stay home." if its raining, snowing or
		//below 50 degrees and print "Let’s go out!" otherwise.
		
	}

}
