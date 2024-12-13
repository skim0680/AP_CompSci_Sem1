/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Warrior[] wrr = new Warrior[100];
	for(int c = 0; c<wrr.length; c++){
		wrr[c] = new Warrior();
	}
	Wizard[] wzd = new Wizard[100];
	for(int c = 0; c<wzd.length; c++){
		wzd[c] = new Wizard();
	}
	int z = 0;
	int r = 0;
	while(r<wrr.length && z<wzd.length){
		wzd[z].attack(wrr[r]);
		if(wrr[r].isDead()){
			r++;
		}
		if(r>=wrr.length){
			break;
		}
		wrr[r].attack(wzd[z]);
		if(wzd[z].isDead()){
			z++;
		}
	}
	if(r>z){
		System.out.println("Wizards won with " + (99-z) + " left in their army.");
	}
	else if(z>r){
		System.out.println("Warriors won with " + (99-r) + " left in their army.");
	}
	
	}
}
