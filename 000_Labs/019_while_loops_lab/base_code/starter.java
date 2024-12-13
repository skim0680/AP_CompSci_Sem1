/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a name: ");
	String name = sc.nextLine();
	System.out.print("How many times should this name be printed? ");
	int times = sc.nextInt();
	int c = 0;
	while(c<times){
		System.out.println(name);
		c=c+1;
	}
	}
}
