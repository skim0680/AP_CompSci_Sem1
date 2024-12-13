/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your base number?");
	int a = sc.nextInt();
	sc.nextLine();
	System.out.println("What is your exponent number?");
	int b = sc.nextInt();
	sc.nextLine();
	int power = pow(a, b);
	System.out.println("Your answer is: " + power);


		
	}
	public static int pow(int a, int b){
		int x = a;
		while(b>1){
		x = x*a;
		b--;
		}
		return x;
	}
}
