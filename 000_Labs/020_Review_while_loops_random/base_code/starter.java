/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int secret = (int)(Math.random()*1000);
		System.out.print("Guess a number between 0 and 1000: ");
		int guess = sc.nextInt();
			while(guess!=secret){
				System.out.print("Incorrect! Guess again: ");
				guess= sc.nextInt();
				
			}
			System.out.print("Correct!");
		
	}
}
