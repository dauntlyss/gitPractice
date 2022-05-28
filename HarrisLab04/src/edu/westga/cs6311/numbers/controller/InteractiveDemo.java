package edu.westga.cs6311.numbers.controller;

import edu.westga.cs6311.numbers.model.NumberPair;
import java.util.Scanner;

/**
 * This class gets input from the user to use as the number pair.
 * 
 * @author Alyssa Harris
 * @version 9-29-2020
 */

public class InteractiveDemo {
	private Scanner input;
	private int number1;
	private int number2;
  
	/**
	 *  This methods initializes the Scanner.
	 */
	public InteractiveDemo() {
		this.input = new Scanner(System.in);  
	}
  
	/**
	 * This method:
	 * prompts user for each necessary value via the Scanner object,
	 * the prints the computations based on the new number pair.
	 */
	public void runNumberPair() {
		System.out.println(" ");
		System.out.println("~~~ Interactive Application Begins ~~~");
    
		System.out.println("Please enter the first number of your number pair");
		String number1 = this.input.nextLine();
		this.number1 = Integer.parseInt(number1);
    
		System.out.println("Please enter the second number of your number pair");
		String number2 = this.input.nextLine();
		this.number2 = Integer.parseInt(number2);
    
		NumberPair yourPair = new NumberPair(this.number1, this.number2);
		System.out.println(yourPair.toString());
    
		System.out.println(" ");
		System.out.println("The sum of your pair is " + yourPair.getSum());
    
		System.out.println(" ");
		System.out.println("The distance of your pair is " + yourPair.getDistance());
    
		System.out.println(" ");
		System.out.println("The product of your pair is " + yourPair.getProduct());
    
		System.out.println(" ");
		System.out.println("The average of your pair is " + yourPair.getAverage());
    
		System.out.println(" ");
		System.out.println("The larger number in your pair is " + yourPair.getLarger());
    
		System.out.println(" ");
		System.out.println("The smaller number in your pair is " + yourPair.getSmaller());
	}
}
