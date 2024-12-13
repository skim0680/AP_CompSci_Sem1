/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int number){
	int count = 2;
	int num = number;
		while(count<num){
			if(num%count!=0){
				count++;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void printPrimes(int a){
		int count = 2;
		int integer = a;
		while(count<integer){
			boolean x = checkPrime(count);
			if(x==true){
				System.out.println(count);
			}
			count++;
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number and we'll print out every prime until that number: ");
	int answer = sc.nextInt();
	printPrimes(answer);

	}
}
