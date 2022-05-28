package edu.westga.cs6311.numbers.model;

/**
 * This class represents a number pair that takes two numbers: 
 * first number and second number.
 * There will be several math functions you can do with the number pair.
 * 
 * @author Alyssa Harris
 * @version 9-22-20
 */
public class NumberPair {
	private int firstNum;
	private int secondNum;
  
	/**
	 * Initializes the instance variables for the NumberPair object.
	 * @param number1 the first number in the number pair
	 * @param number2 the second number in the number pair
	 */
	public NumberPair(int number1, int number2) {
		this.firstNum = number1;
		this.secondNum = number2;
	}
  
	/**
	 * This method gives a String representation of the object.
	 * @return toString()
	 */
	public String toString() {
		return "NumberPair object is storing values " + this.firstNum + " and " + this.secondNum;  
	}
  
	/**
	 * This method gives the sum of the two integers in the NumberPair.
	 * @return sum
	 */
	public int getSum() {
		int sum = this.firstNum + this.secondNum;
		return sum;
	}
  
	/**
	 * This method gives the distance between the two integers in the NumberPair.
	 * @return positiveDistance
	 */
	public int getDistance() {
		int distance = this.firstNum - this.secondNum;
		int positiveDistance = Math.abs(distance);
		return positiveDistance;
	}
  
	/**
	 * This method gives the product of the two integers in the NumberPair.
	 * @return product
	 */
	public int getProduct() {
		int product = this.firstNum * this.secondNum;
		return product;
	}
  
	/**
	 * This method gives the average of the two integers in the NumberPair.
	 * @return average
	 */
	public double getAverage() {
		double average = (this.firstNum + this.secondNum) / 2;
		return average;
	}
  
	/**
	 * This method gives the larger of the two integers in the NumberPair.
	 * @return larger
	 */
	public int getLarger() {
		int larger = Math.max(this.firstNum, this.secondNum);
		return larger;
	}
  
	/**
	 * This method gives the smaller of the two integers in the NumberPair.
	 * @return smaller
	 */
	public int getSmaller() {
		int smaller = Math.min(this.firstNum, this.secondNum);
		return smaller;
	}
  
}
