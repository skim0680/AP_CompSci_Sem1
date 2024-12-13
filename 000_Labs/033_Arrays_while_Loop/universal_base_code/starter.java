/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] rand = new int[1000];
		int i = 0;
		while(i<1000){
			rand[i] = (int)(Math.random()*1000);
			i++;
		}
		
		int c = 0;
		while(c<1000){
		System.out.println(c + ": " + rand[c]);
		c++;
		}
		
	}
}
