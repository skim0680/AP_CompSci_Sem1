/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int[] a = new int[100];
	for(int c=0; c<a.length; c++){
		a[c] = (int)(Math.random()*100+1);
	}
	toStringArray(a);
	System.out.println("The average of 100 random numbers is: " + getArrayAverage(a));
	System.out.println("The maximum of 100 random numbers is: " + getArrayMax(a));
	System.out.println("The minimum of 100 random numbers is: " + getArrayMin(a));

		
	}
	public static void toStringArray(int[] a){
		for(int i=0; i<a.length; i++){
		System.out.println(a[i]);
		}
	}
	public static int getArrayAverage(int[] a){
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum = sum + a[i];
		}
		return sum/a.length;
	}
	public static int getArrayMax(int[] a){
		int max = a[0];
		for(int i=0; i<a.length; i++){
			if(a[i]>max){
				max = a[i];
			}
		}
		return max;
	}
	public static int getArrayMin(int[] a){
		int min = a[0];
		for(int i=0; i<a.length; i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		return min;
	}
}
