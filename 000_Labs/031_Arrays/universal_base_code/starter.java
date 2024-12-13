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
		int [] arr = new int[10];
		int c = 9;
		int r = 0;
		while(r<10){
			arr[r] = c;
			r++;
			c--;
		}
	int y = 0;
	while(y<10){
		System.out.println(y + ": " + arr[y]);
		y++;
	}

		
	}
}
