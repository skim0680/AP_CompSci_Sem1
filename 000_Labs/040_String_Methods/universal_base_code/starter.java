/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first and last name:");
		String name = sc.nextLine();
		int space1 = name.indexOf(" ");
		System.out.println(name.substring(space1+1));


		
	}
}
