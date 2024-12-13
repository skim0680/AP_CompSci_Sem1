/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;
import java.util.Random;

class Character{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	public Character(){
		role = "wizard";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		charisma = 5;
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Character me = new Character();
	System.out.println("Your role is " + me.role);
	System.out.println("Your strength trait is " + me.strength);
	System.out.println("Your dexterity trait is " + me.dexterity);
	System.out.println("Your intelligence trait is " + me.intelligence);
	System.out.println("Your charisma trait is " + me.intelligence);
	
	


		
	}
}
