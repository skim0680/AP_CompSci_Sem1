/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)((Math.random()*1000)+1);
		System.out.print("Guess an integer between 1 and 1000! ");
		int y = sc.nextInt();
		if(x==y)
		System.out.println("Correct!");
		else{
		System.out.println("Incorrect!");
		System.out.print(x + " was the number!");
		}
	}
}
