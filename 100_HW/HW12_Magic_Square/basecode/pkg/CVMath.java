package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int n){
		int c = 0;
		int x = 1;
		while(c<n){
			int sum = 0;
			if(Math.pow((int)(Math.sqrt(x)), 2) == x){
				for(int i = 0; i<=x; i++){
					sum = sum + i;
					if(sum == x){
						break;
					}
				}
				if(sum == x){
				System.out.println(x);
				c++;
				}
			}
			x++;
		}
		
	} 
}
