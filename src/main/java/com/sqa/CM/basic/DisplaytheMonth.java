/**
 *   File Name: DisplaytheMonth.java<br>
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
 * DisplaytheMonth //ADDD (description of class)
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
public class DisplaytheMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variable
		String user_input;
		int num;

		// capture user input from screen
		final Scanner scanner = new Scanner(System.in);
		// request for a number
		System.out.println("Please enter a number: ");
		// capture user input inside local variable name
		user_input = scanner.nextLine();
		// evaluate the number
		num = Integer.parseInt(user_input);

		switch (num) {
		case 1:
			System.out.println(num + " is January");
			break;
		case 2:
			System.out.println(num + " is February");
			break;
		case 3:
			System.out.println(num + " is March");
			break;
		case 4:
			System.out.println(num + " is April");
			break;
		case 5:
			System.out.println(num + " is May");
			break;
		case 6:
			System.out.println(num + " is June");
			break;
		case 7:
			System.out.println(num + " is July");
			break;
		case 8:
			System.out.println(num + " is August");
			break;
		case 9:
			System.out.println(num + " is September");
			break;
		case 10:
			System.out.println(num + " is October");
			break;
		case 11:
			System.out.println(num + " is November");
			break;
		case 12:
			System.out.println(num + " is December");
			break;
		default:
			System.out.println("Please enter a number from 1 to 12");
			break;

		}
		System.out.println("Good Bye!");
		scanner.close();
	}

}
