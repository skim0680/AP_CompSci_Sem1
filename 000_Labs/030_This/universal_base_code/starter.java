/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf one= new PooleDwarf();
		one.setName(randName());
		one.setAge((int)(Math.random()*50));
		PooleDwarf two = new PooleDwarf();
		two.setName(randName());
		two.setAge((int)(Math.random()*50));
		PooleDwarf thr = new PooleDwarf();
		thr.setName(randName());
		thr.setAge((int)(Math.random()*50));
		PooleDwarf fou = new PooleDwarf();
		fou.setName(randName());
		fou.setAge((int)(Math.random()*50));
		PooleDwarf fiv = new PooleDwarf();
		fiv.setName(randName());
		fiv.setAge((int)(Math.random()*50));
		PooleDwarf six = new PooleDwarf();
		six.setName(randName());
		six.setAge((int)(Math.random()*50));
		PooleDwarf sev = new PooleDwarf();
		sev.setName(randName());
		sev.setAge((int)(Math.random()*50));
	
		int dup = 0;
		if(one.isSameName(two.getName()))
			dup = dup + 1;
		if(one.isSameName(thr.getName()))
			dup = dup + 1;
		if(one.isSameName(fou.getName()))
			dup = dup + 1;
		if(one.isSameName(fiv.getName()))
			dup = dup + 1;
		if(one.isSameName(six.getName()))
			dup = dup + 1;	
		if(one.isSameName(sev.getName()))
			dup = dup + 1;
			
		System.out.println(one.getName() + " was the name with " + dup + " match(es)!");
		System.out.println(one.getName() + two.getName() + thr.getName() + fou.getName() + fiv.getName() + six.getName() + sev.getName());
	}
}
