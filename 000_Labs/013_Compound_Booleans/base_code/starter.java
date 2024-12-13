/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int one = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter another integer: ");
		int two = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter a third integer: ");
		int three = sc.nextInt();
		sc.nextLine();
		if(one>two && one>three){
			System.out.println(one + " is the greatest integer!");
		}
		else if(two>one && two>three){
			System.out.println(two + " is the greatest integer!");
		}
		else if(three>one && three>two){
			System.out.println(three + " is the greatest integer!");
		}
		else{
			System.out.println("Your numbers are equal!");
		}
		if(one<two && one<three){
			System.out.println(one + " is the smallest integer!");
		}
		else if(two<one && two<three){
			System.out.println(two + " is the smallest integer!");
		}
		else if(three<one && three<two){
			System.out.println(three + " is the smallest integer!");
		}
		
	}
}
