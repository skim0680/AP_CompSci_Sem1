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
	public void sayRole(String role){
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
	}
}