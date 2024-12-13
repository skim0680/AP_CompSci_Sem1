/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a temperature in Farenheit:");
		int F = sc.nextInt();
		double convert = 30.0;
		double convert2 = 2.0;
		System.out.println("Here is that approximate temperature in Celsius: " + (F - convert) / convert2);
		
		
	}
}
