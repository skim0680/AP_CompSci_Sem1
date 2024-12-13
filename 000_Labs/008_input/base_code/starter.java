/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("You are " + age + " years old!");
		System.out.print("Please enter your birthday month (word): ");
		String month = sc.nextLine();
		System.out.print("Please enter your birthday day (number): ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter your birth year (number): ");
		int year = sc.nextInt();
		sc.nextLine();
		System.out.println("You were born on " + month +  " " + day + ", " + year + "!");
		System.out.print("How much is a buck fifty? (number) ");
		double money = sc.nextDouble();
		System.out.println("A buck fifty is $" + money + "!");
	}
}
