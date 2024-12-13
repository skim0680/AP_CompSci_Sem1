/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a decimal number: ");
		double x = sc.nextDouble();
		System.out.print("Please enter another decimal number: ");
		double y = sc.nextDouble();
		System.out.println("This is the greater number: " + Math.max(x, y));
		System.out.println("This is the square root of your second number: " + Math.sqrt(y));
		System.out.println("This is your first number to the power of your second number: " + Math.pow(x, y));
	}
}
