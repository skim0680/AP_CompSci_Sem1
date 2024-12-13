/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What day is it (0-6)? ");
		int day = sc.nextInt();
		if(day==0||day==6){
			System.out.print("It's the weekend! It's 10AM!");
		}
		else if(day>0&&day<6){
			System.out.print("It's a weekday! Wake up! It's 7AM!");
		}
	}
}
