/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int int1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter a larger integer: ");
		int int2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		System.out.println("Your range is " + int1 + " to " + int2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print(((int)((Math.random()*(int2-int1))+int1)) + ", " + ((int)((Math.random()*(int2-int1))+int1)) + ", " + ((int)((Math.random()*(int2-int1))+int1)) + ", " + ((int)((Math.random()*(int2-int1))+int1)) + ", " + ((int)((Math.random()*(int2-int1))+int1)));
		
	}
}
