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
	System.out.print("Guess a number between 1 and 1000! ");
	int y = sc.nextInt();
	if(x==y){
		System.out.print("Correct!");
	}
	else if(y>x){
		System.out.print("Your guess is higher than the number! The number is " + x + "!");
	}
	else if(y<x){
		System.out.print("Your guess is lower than the number! The number is " + x + "!");
	}
	}
}
