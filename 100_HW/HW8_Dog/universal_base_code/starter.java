/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog bow = new Dog();
		bow.setName("bow");
		bow.setAge(2);
		Dog jim = new Dog("jim", "poodle");
		
		boolean a = bow.isSleeping();
		if(a==true){
			System.out.println("bow is asleep.");
		}
		else if(a==false){
			bow.bark();
		}
		
		boolean b = jim.isSleeping();
		if(b==true&&a==false){
			jim.bark();
		}
		else if(b==false&&a==false){
			jim.bark();
		}
	}
}
