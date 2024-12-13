/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter another integer: ");
		int y = sc.nextInt();
		sc.nextLine();
		if(x!=y){
			System.out.print("The two integers are different!");
		}
	}
}
