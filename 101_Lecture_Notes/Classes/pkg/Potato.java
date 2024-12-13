/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    // global variables
    String color;
    boolean isEdible;
    String type;
    double mass;
    // constructors
    public Potato(){
        color = "brown";
        isEdible = true;
        type = "french fry";
        mass = 170.5;
    }
    public Potato(String c, String t, double m){
        color = c;
        isEdible = false;
        type = t;
        mass = m;
    }
    public boolean getEdibility(){
        return isEdible;
    }
    public void eatPotato(){
        mass = 0;
    }
    
}