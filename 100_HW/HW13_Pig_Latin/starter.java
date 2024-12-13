/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	    System.out.println("Enter a sentence: ");
	    Scanner sc = new Scanner(System.in);
	    String sentence = sc.nextLine();
		while(true){
            if(sentence.indexOf(" ") == -1){
                System.out.println(pigLatin(sentence));
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            System.out.print(pigLatin(word) + " ");
            sentence = sentence.substring(space + 1);
        }
	}
	public static String pigLatin(String word){
	    if(word.indexOf("a") == 0 || word.indexOf("e") == 0 || word.indexOf("i") == 0 || word.indexOf("o") == 0 || word.indexOf("u") == 0){
	        word = word + "-way";
	    }
	    else if(word.indexOf("a") == 1 || word.indexOf("e") == 1 || word.indexOf("i") == 1 || word.indexOf("o") == 1 || word.indexOf("u") == 1){
	        String letter = word.substring(0, 1);
	        word = word.substring(1) + "-" + letter + "ay";
	    }
	    else if(word.indexOf("a") == 2 || word.indexOf("e") == 2 || word.indexOf("i") == 2 || word.indexOf("o") == 2 || word.indexOf("u") == 2){
	        String letters = word.substring(0, 2);
	        word = word.substring(2) + "-" + letters + "ay";
	    }
	    return word;
	}
}
