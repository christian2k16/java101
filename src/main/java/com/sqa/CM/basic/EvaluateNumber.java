/**
 *   File Name: EvaluateNumber.java<br>
 *
 *   Mallapre, Christian<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 23, 2016
 *
 */

package com.sqa.CM.basic;

import java.util.Scanner;

/**
 * EvaluateNumber //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mallapre, Christian
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EvaluateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variable
		int num;
		// capture user input from screen
		final Scanner scanner = new Scanner(System.in);
		// request for a number
		System.out.println("Please enter a whole number: ");
		// capture user input inside local variable name
		num = scanner.nextInt();
		// evaluate the number
		if (num < 10) {
			System.out.println(num + " is a whole number smaller than 10");
		} else if (num == 10) {
			System.out.println(num + " is a whole number equal to 10");
		} else {
			System.out.println(num + " is a whole number greater than 10");
		}
		scanner.close();
	}

}
