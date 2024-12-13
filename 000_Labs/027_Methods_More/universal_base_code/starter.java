/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	myCharacter me = new myCharacter();
	me.myToString();
	System.out.println("What class would you like to be?");
	String role = sc.nextLine();
	me.setRole(role);
	me.sayRole();
	System.out.print("Strength: ");
	int a = sc.nextInt();
	me.setStrength(a);
	System.out.print("Dexterity: ");
	int b = sc.nextInt();
	me.setDexterity(b);
	System.out.print("Intelligence: ");
	int c = sc.nextInt();
	me.setIntelligence(c);
	System.out.print("Charisma: ");
	int d = sc.nextInt();
	me.setCharisma(d);
	me.setAll(role, a, b, c, d);
	me.myToString();

	}
}
