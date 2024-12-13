package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	public Dog() {
		name = "Clifford";
		age =  1;
		breed = "dog dog";
	}
	public Dog(String nm, String brd){
		name = nm;
		age = 1;
		breed = brd;
	}
	public Dog(String nm, int ag){
		name = nm;
		age = ag;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int a){
		age = a;
		return;
	}
	public void setBreed(String a){
		breed = a;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int prob = (int)(Math.random()*2);
		return prob == 0;
	}
	public void bark(){
		System.out.println(name + " barks!");
	}

}
