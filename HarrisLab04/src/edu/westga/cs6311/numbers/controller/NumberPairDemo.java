package edu.westga.cs6311.numbers.controller;

import edu.westga.cs6311.numbers.model.NumberPair;

/**
 * This class is used to store methods that will test the 
 * NumberPair class.
 * 
 * @author Alyssa Harris
 * @version 9-29-20
 */
public class NumberPairDemo {
	private NumberPair newPair;
	
	/**
	 * Initializes the instance variable for the
	 * NumberPairDemo object.
	 */
	public NumberPairDemo() {
		this.newPair = new NumberPair(2, 4);
	}
  
	/**
    * This method:
    * prints the expected and actual sum of the NumberPair.
    */
	public void testNumberPair() {
		System.out.println(this.newPair.toString());
		System.out.println(" ");
    
		System.out.println("The expected sum is 6.");
		System.out.println("The actual sum is " + this.newPair.getSum());
    
		System.out.println(" ");
		System.out.println("The expected distance is 2.");
		System.out.println("The actual distance is " + this.newPair.getDistance());
    
		System.out.println(" ");
		System.out.println("The expected product is 8.");
		System.out.println("The actual product is " + this.newPair.getProduct());
    
		System.out.println(" ");
		System.out.println("The expected average is 3.0.");
		System.out.println("The actual average is " + this.newPair.getAverage());
    
		System.out.println(" ");
		System.out.println("The expected larger number is 4.");
		System.out.println("The actual larger number is " + this.newPair.getLarger());
    
		System.out.println(" ");
		System.out.println("The expected smaller number is 2.");
		System.out.println("The actual smaller number is " + this.newPair.getSmaller());
	}
  
}
