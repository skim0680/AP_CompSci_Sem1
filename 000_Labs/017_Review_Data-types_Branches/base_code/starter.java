/*
 *	Author:  Sally Kim
 *  Date: 10/01/2024
 
 
 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.print("What is your title? Ex. Slayer of Dragons\n");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String role = sc.nextLine();
		if(role.equals("Wizard")||role.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		else if(role.equals("Warrior")||role.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if(role.equals("Rogue")||role.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else
		System.out.println("You choose your own path.");
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println();
		
		System.out.print("Strength (1-10): ");
		int strength = sc.nextInt();
		sc.nextLine();
		
		if(strength<=10&&strength>=0){
			int points = 20-strength;
			System.out.println("You have " + points + " points left to spend.");
			System.out.println();
			System.out.print("Dexterity (1-10): ");
			int dexterity = sc.nextInt();
			if(dexterity>=0&&dexterity<=10&&dexterity<=points){
				int points1 = points-dexterity;
				System.out.println("You have " + points1 + " points left to spend.");
				System.out.println();
				System.out.print("Intelligence (1-10): ");
				int intelligence = sc.nextInt();
				if(intelligence>=0&&intelligence<=10&&intelligence<=points1){
					int points2 = points1-intelligence;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
				else if(intelligence>points1||intelligence>10){
					System.out.print("Please input a smaller value: ");
					int intelligence1 = sc.nextInt();
					int points2 = points1-intelligence1;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
			}
			else if(dexterity>10||dexterity>points){
				System.out.print("Please input a smaller value: ");
				int dexterity1 = sc.nextInt();
				int points1 = points-dexterity1;
				System.out.println("You have " + points1 + " points left to spend.");
				System.out.println();
				System.out.print("Intelligence (1-10): ");
				int intelligence = sc.nextInt();
				if(intelligence>=0&&intelligence<=10&&intelligence<=points1){
					int points2 = points1-intelligence;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
				else if(intelligence>points1||intelligence>10){
					System.out.print("Please input a smaller value: ");
					int intelligence1 = sc.nextInt();
					int points2 = points1-intelligence1;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
			}
		}
		else if(strength>10){
			System.out.print("Please input a smaller value: ");
			int strength1 = sc.nextInt();
			int points = 20-strength1;
			System.out.println("You have " + points + " points left to spend.");
			System.out.println();
			System.out.print("Dexterity (1-10): ");
			int dexterity = sc.nextInt();
			if(dexterity>=0&&dexterity<=10&&dexterity<=points){
				int points1 = points-dexterity;
				System.out.println("You have " + points1 + " points left to spend.");
				System.out.println();
				System.out.print("Intelligence (1-10): ");
				int intelligence = sc.nextInt();
				if(intelligence>=0&&intelligence<=10&&intelligence<=points1){
					int points2 = points1-intelligence;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
				else if(intelligence>points1||intelligence>10){
					System.out.print("Please input a smaller value: ");
					int intelligence1 = sc.nextInt();
					int points2 = points1-intelligence1;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
			}
			else if(dexterity>10||dexterity>points){
				System.out.print("Please input a smaller value: ");
				int dexterity1 = sc.nextInt();
				int points1 = points-dexterity1;
				System.out.println("You have " + points1 + " points left to spend.");
				System.out.println();
				System.out.print("Intelligence (1-10): ");
				int intelligence = sc.nextInt();
				if(intelligence>=0&&intelligence<=10&&intelligence<=points1){
					int points2 = points1-intelligence;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
				else if(intelligence>points1||intelligence>10){
					System.out.print("Please input a smaller value: ");
					int intelligence1 = sc.nextInt();
					int points2 = points1-intelligence1;
					System.out.println("You have " + points2 + " points left to spend.");
					System.out.println();
					System.out.print("Charisma (1-10): ");
					int charisma = sc.nextInt();
					if(charisma>=0&&charisma<=10&&charisma<=points2){
						int points3 = points2-charisma;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
					else if(charisma>points2||charisma>10){
						System.out.print("Please input a smaller value: ");
						int charisma1 = sc.nextInt();
						int points3 = points2-charisma1;
						System.out.println("You have " + points3 + " points left.");
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS.");
						System.out.println("You're a " + role + " with the following stats!");
						System.out.println("Strength - " + strength1);
						System.out.println("Dexterity - " + dexterity1);
						System.out.println("Intelligence - " + intelligence1);
						System.out.println("Charisma - " + charisma1);
						System.out.println();
						System.out.println("Good luck on your quest " + name + "!");
					}
				}
			}
		}
	}
}
