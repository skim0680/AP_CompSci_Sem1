/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------------");
		System.out.println();
		int money = 100;
		while(true){
		System.out.print("You have $" + money + ". Do you want to play the slot machine? (Yes/yes/Y/y): ");
		String ans = sc.nextLine();
		if(ans.equals("Y")||ans.equals("y")||ans.equals("Yes")||ans.equals("yes")){
			System.out.print("How much money do you wager? ");
			int wager = sc.nextInt();
			sc.nextLine();
			while(wager<0){
				System.out.println("NO CHEATING");
				System.out.print("How much money do you wager? ");
				wager = sc.nextInt();
				sc.nextLine();
			}
			while(wager>money){
				System.out.println("You don't have that much money!");
				System.out.print("How much money do you wager? ");
				wager = sc.nextInt();
				sc.nextLine();
			}
			System.out.println("You wager $" + wager + ". Good luck!");
			int x = (int)((Math.random()*9)+1);
			int y = (int)((Math.random()*9)+1);
			int z = (int)((Math.random()*9)+1);
			System.out.println();
			System.out.println("Your rolls are: ");
			System.out.println("__________________");
			System.out.println(" | " + x + " | " + y + " | " + z + " | ");
			System.out.println("__________________");
			if(x==y&&y==z){
				wager = wager*3;
				money = money + wager;
				System.out.println("Jackpot! Your wager has been tripled!");
			}
			else if(x==y||y==z||z==x){
				wager=wager*2;
				money = money + wager;
				System.out.println("You won! Your wager has been doubled!");
			}
			else{
				money = money - wager;
				System.out.println("You lost..");
			}
			if(money<=0){
				System.out.println("You're out of money haha");
				break;
			}
			System.out.println("You now have $" + money + "!");
			System.out.println();
			System.out.println("----------------------------------------------------------");
			System.out.println();
		}
		else{
			break;
		}
		
		
		}
		System.out.print("Game over.");
	}
}
