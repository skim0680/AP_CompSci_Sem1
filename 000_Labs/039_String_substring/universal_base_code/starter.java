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
		System.out.println("Enter a word!!!!");
		String a = sc.nextLine();
		System.out.println("Letter by letter:");
		for(int i = 0; i<a.length(); i++){
			System.out.println(i + " " + a.substring(i, i+1));
		}


		
	}
}
