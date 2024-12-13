/*
 *	Author: Sally Kim
 *  Date: 9/12/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		String btwn = new String(", ");
		System.out.print("Here are the next 5 numbers!\n");
		System.out.println(num + btwn + (num + 1) + btwn + (num + 2) + btwn + (num + 3) + btwn + (num + 4) + btwn + (num + 5));
		System.out.println("Here are the next 5 multiples of " + num + "!");
		System.out.println(num + btwn + (num*2) + btwn + (num*3) + btwn + (num*4) + btwn + (num*5) + btwn + (num*6));
		System.out.println("Here is " + num + " divided by 100!");
		System.out.println(num/100.0);
		System.out.println("Here is " + num + " divided by 10!");
		System.out.println(num/10.0);
		
		

	}
}
