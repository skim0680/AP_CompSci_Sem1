/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[20];
		for(int i = 0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*10+1);
		}
		System.out.println("-----------------------------------");
		System.out.println("These are the 20 numbers");
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		int num = (int)(Math.random()*10+1);
		System.out.println("The random number to look for is " + num);
		int dup = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]==num){
				System.out.println("Duplicate found at index " + i);
				dup = dup + 1;
			}
		}
		System.out.println("Total number of duplicates for " + num + " is " + dup);
		System.out.println("-----------------------------------");
		System.out.println("Looking for two in a row:");
		for(int i = 1; i<arr.length; i++){
			if(arr[i]==arr[i-1]){
				System.out.println("Two in a row found at indexes " + i + " and " + (i - 1) + ". The number is " + arr[i]);
			}
		}
	}
}
