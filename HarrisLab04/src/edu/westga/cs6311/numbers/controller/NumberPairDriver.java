package edu.westga.cs6311.numbers.controller;

/**
 * This class will test the NumberPairDemo object.
 * @author Alyssa Harris
 * @version 9-29-20
 */
public class NumberPairDriver {

	/**
	 * This is the entry point to the application.
	 * @param args Not used.
	 */
	public static void main(String[] args) {
		NumberPairDemo myPair = new NumberPairDemo();
		myPair.testNumberPair();
    
		InteractiveDemo yourPair = new InteractiveDemo();
		yourPair.runNumberPair();
	}

}
