/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String line){
		System.out.println(line);
		return;
	}
	public static void toStringCombined(String line, String line2){
		System.out.println(line + " " + line2);
		return;
	}
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence! ");
	String line = sc.nextLine();
	System.out.println("Enter a sentence! ");
	String line2 = sc.nextLine();
	System.out.println();
	toString(line);
	toStringCombined(line, line2);

		
	}
}
