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
		System.out.println("Please enter a phrase:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("");
		System.out.println("Your phrase:");
		System.out.println(sentence);
		String reverse = "";
		while(true){
            if(sentence.indexOf(" ") == -1){
                reverse = sentence + " " + reverse;
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            reverse = word + " " + reverse;
            sentence = sentence.substring(space + 1);
        }
    System.out.println("");
	System.out.println("Your phrase reversed:");
	System.out.println(reverse);

		
	}
}
