/*
 *	Author: sally kim
 *  Date: 10/20/2024
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter a message you want to decipher:");
	String message = sc.nextLine();
	String decoded = Cipher.encode(message);
	/*String decoded = Cipher.keyedEncode(message, 29);
	int c = 1;
	while(c<37){
		System.out.println();
		System.out.print(c + ": ");
		String decoded = Cipher.keyedEncode(message, c);
		System.out.println(decoded);
		c++;
	}*/
	System.out.println();
	System.out.println("Your message encoded is:");
	System.out.println(decoded);
	}
}
