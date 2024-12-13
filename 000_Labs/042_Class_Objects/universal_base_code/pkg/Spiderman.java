/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String actor;
	int age;
	String villain;
	
	public Spiderman() {
		actor = "Miles Morales";
		age = 13;
		villain = "King Pin";
	}
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "None";
	}
	public Spiderman(String a, int b){
		actor = a;
		age = b;
		villain = "None";
	}
	public Spiderman(String a, String b){
		actor = a;
		age = 0;
		villain = b;
	}
	
	public void print(){
		System.out.println("--------------------------------");
		System.out.println("The actor " + actor + " is " + age + " years old.");
		System.out.println("They play Spiderman whose villain is " + villain + ".");
		System.out.println("--------------------------------");
	}
	public void setAge(int a){
		age = a;
	}
	public void setVillain(String a){
		villain = a;
	}
	
}
