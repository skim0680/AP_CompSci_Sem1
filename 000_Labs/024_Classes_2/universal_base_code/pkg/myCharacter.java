/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int charisma;
	public myCharacter(){
		role = "No role";
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		charisma = 5;
	}
	public myCharacter(String role){
		if(role.equals("Wizard")||role.equals("wizard")){
			role = "Wizard";
		}
		if(role.equals("Warrior")||role.equals("warrior")){
			role = "Warrior";
		}
		if(role.equals("Rogue")||role.equals("rogue")){
			role = "Rogue";
		}
	}
	public void sayRole(){
		if(role.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if(role.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		if(role.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
	}
	
}