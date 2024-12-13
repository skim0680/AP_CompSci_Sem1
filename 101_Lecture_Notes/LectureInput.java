/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Please enter a number:");
        int number1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Please enter a number:");
        int number2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these numbers is: " + (number1 + number2));
        
        System.out.println("Please enter your favorite food:");
        String food = sc.nextLine();
        
	}
}