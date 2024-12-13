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
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
	}
	public String setRole(String rl){
		if(rl.equals("Wizard")||rl.equals("wizard")){
			role = "Wizard";
		}
		if(rl.equals("Warrior")||rl.equals("warrior")){
			role = "Warrior";
		}
		if(rl.equals("Rogue")||rl.equals("rogue")){
			role = "Rogue";
		}
		return role;
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
	public void myToString(){
		System.out.println("--------------------------------------");
		System.out.println("Your role is: " + role);
		System.out.println("Your strength trait is: " + strength);
		System.out.println("Your dexterity trait is: " + dexterity);
		System.out.println("Your intelligence trait is: " + intelligence);
		System.out.println("Your charisma trait is: " + charisma);
		System.out.println("--------------------------------------");
		return;
	}
	public int setStrength(int a){
		if(a<0){
			a=0;
		}
		strength = a;
		return strength;
	}
	public int setDexterity(int a){
		if(a<0){
			a = 0;
		}
		dexterity = a;
		return dexterity;
	}
	public int setIntelligence(int a){
		if(a<0){
			a = 0;
		}
		intelligence = a;
		return intelligence;
	}
	public int setCharisma(int a){
		if(a<0){
			a = 0;
		}
		charisma = a;
		return charisma;
	}
	public boolean setAll(String a, int b, int c, int d, int e){
		return true;
	}
}