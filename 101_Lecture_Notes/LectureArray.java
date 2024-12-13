/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 5, 9, 8, 8, 3, 8, 8};
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        /*int dupeCheck = 8;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == dupeCheck){
                System.out.println(i);
            }
        }*/
        System.out.println("");
        for(int i = 0; i<arr.length-1; i++){
            //if(arr[i] == arr[i+1]){
            //System.out.println(i);
            //}
            if(Math.abs(arr[i]-arr[i+1])==3){
                System.out.println(i);
            }
        }
        int [] are = {6, 2, 3, 7, 2, 4, 5, 0, 9};
        for(int i = 0; i<are.length-1; i++){
            if(are[i]%2==0){
                are[i] = are[i]-are[i+1];
            }
        }
        for(int i = 0; i<are.length; i++){
            System.out.print(are[i] + " ");
        }
	}
}