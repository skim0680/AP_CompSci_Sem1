/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        greeting("bob");
        double newSalary = raise(100000.62, 3);
        System.out.println(newSalary);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
        newSalary = raise(newSalary, 6);
        System.out.println(newSalary);
	}
	public static void greeting(String name){
	    System.out.println("Hello " + name + "!");
	}
	private static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	public static void printAnimal(){
	    System.out.println(" ,_");
	    System.out.println(">' )");
	    System.out.println("( ( \\ ");
	    System.out.println(" ''|\\");
	}
}