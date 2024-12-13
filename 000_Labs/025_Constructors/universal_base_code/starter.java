/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	myCharacter one = new myCharacter();
	System.out.println("Your role is " + one.role);
	System.out.println("Your strength trait is " + one.strength);
	System.out.println("Your dexterity trait is " + one.dexterity);
	System.out.println("Your intelligence trait is " + one.intelligence);
	System.out.println("Your charisma trait is " + one.intelligence);
	System.out.println("------------------------------------------------------------------");
	Scanner sc = new Scanner(System.in);
	System.out.println("What class do you want to be?");
	String role = sc.nextLine();
	myCharacter two = new myCharacter(role);
	two.sayRole(role);
	System.out.println("Your strength trait is " + two.strength);
	System.out.println("Your dexterity trait is " + two.dexterity);
	System.out.println("Your intelligence trait is " + two.intelligence);
	System.out.println("Your charisma trait is " + two.intelligence);
	}
}
