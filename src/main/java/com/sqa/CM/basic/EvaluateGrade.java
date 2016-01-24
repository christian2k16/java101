/**
 *   File Name: EvaluateGrade.java<br>
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
 * EvaluateGrade //ADDD (description of class)
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
public class EvaluateGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create local variables
		String input;
		int gradeValue;
		// Create a Scanner objects and assign to variable scanner
		final Scanner scanner = new Scanner(System.in);
		// Request a grade value from the user
		System.out.println("Please input grade value (0-100) :");
		// Set user defined input to variable input
		input = scanner.nextLine();
		// Convert the string input to a number
		gradeValue = Integer.parseInt(input);
		// Evaluate if grade value
		if (gradeValue >= 90) {
			// Output that the grade is greater than or equal to 90
			System.out.println("Grade is an A");
		} else if (gradeValue >= 80) {
			// Output that the grade is greater than or equal to 80
			System.out.println("Grade is an B");
		} else if (gradeValue >= 70) {
			// Output that the grade is greater than or equal to 70
			System.out.println("Grade is an C");
		} else if (gradeValue >= 60) {
			// Output that the grade is greater than or equal to 60
			System.out.println("Grade is an D");
		} else {
			// Output that the grade is greater than or equal to 50
			System.out.println("Grade is an E");
		}

		// Exit the app
		System.out.println("Good Bye!");
		scanner.close();
	}

}
