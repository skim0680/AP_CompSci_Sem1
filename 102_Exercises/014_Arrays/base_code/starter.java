/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int i = 1;
		 arr[0] = 3;
		 while(i<1001){
		 	arr[i] = arr[i-1] + 3;
		 	i++;
		 }
		 int [] arr1 = new int [1001];
		 int j = 1;
		 arr1[0] = 1000;
		 while(j<1001){
		 	arr1[j] = arr1[j-1] - 1;
		 	j++;
		 }
		 System.out.println("Array 1:");
		 int x = 0;
		 while(x<1001){
		 	System.out.println(x + ": " + arr[x]);
		 	x++;
		 }
		 System.out.println("----------------------------------");
		 System.out.println("Array 2:"");
		 int y = 0;
		 while(y<1001){
		 	System.out.println(y + ": " + arr1[y]);
		 	y++;
		 }
		 System.out.println("----------------------------------");
	}
}
