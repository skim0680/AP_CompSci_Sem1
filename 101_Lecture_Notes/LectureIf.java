/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You're at the airport, ready to go on a trip:");
        System.out.println("Where do you go?");
        System.out.println("1. A tropical island known for its stunning beaches.");
        System.out.println("2. A bustling city famous for its art and culture.");
        System.out.println("3. A remote mountain village with breathtaking views.");
        int answer = sc.nextInt();
        sc.nextLine();
        if(answer==1){
            System.out.println("You arrive at the tropical island, greeted by the warm sun and the sound of waves. As you explore, you come across:");
            System.out.println("1. A hidden cove perfect for swimming and snorkeling.");
            System.out.println("2. A local market filled with colorful crafts and deliciou food.");
            System.out.println("3. A hiking trail leading up to a breathtaking viewpoint");
            System.out.println("What will you do next?");
            int answer1 = sc.nextInt();
            sc.nextLine();
            if(answer1==1){
                System.out.print("You go to the hidden cove!");
            }
            else if(answer1==2)
                System.out.print("You go to the local market!");
            else if(answer1==3)
                System.out.print("You go to the hiking trail!");
        }
        else if(answer==2){
            System.out.println("As you land and step into the vibrant streets, you're surrounded by colorful murals and the hum of conversation. You decide to explore and soon discover:");
            System.out.println("1. An art gallery showcasing local artists' work.");
            System.out.println("2. A lively street market filled with unique food and crafts.");
            System.out.println("3. A historic theater offering live performances");
            System.out.println("What will you choose to do?");
            int answer2 = sc.nextInt();
            sc.nextLine();
            if(answer2==1){
                System.out.print("You go to the art gallery!");
            }
            else if(answer2==2){
                System.out.print("You go to the lively street!");
            }
            else if(answer2==3){
                System.out.print("You go to the historic theater!");
            }
            
        }
        else if(answer==3){
            System.out.println("After a scenic flight and a winding bus ride, you arrive, greeted by charming cottages and towering peaks. As you settle in, you discover:");
            System.out.println("1. A local hiking trail that leads to a stunning waterfall.");
            System.out.println("2. A cozy café where villagers gather to share stories and homemade pastries.");
            System.out.println("3. An artisan shop selling handmade crafts and souvenirs.");
            System.out.println("What will you explore first?");
            int answer3 = sc.nextInt();
             if(answer3==1){
                System.out.print("You go to the hiking trail!");
            }
            else if(answer3==2){
                System.out.print("You go to the cafe!");
            }
            else if(answer3==3){
                System.out.print("You go to the artisan shop!");
            }
            
        }
        else{
            System.out.print("You decide not to go on a trip!");
        }
        
	}
}