/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//Employee michael = new Employee();
		//michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee bob = new Employee(1111, "Bob", "Bib", 1000);
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		bob.employeeToString();
		dwight.raiseSalary(3);
		jim.raiseSalary(5);
		pam.raiseSalary(10);
		bob.raiseSalary(2);
		System.out.println("Everyone gets a raise!!!");
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("Dwight's salary: $" + dwight.getSalary());
		System.out.println("Annual salary: $" + dwight.getAnnualSalary());
		System.out.println("------------------------------");
		System.out.println("Jim's salary: $" + jim.getSalary());
		System.out.println("Annual salary: $" + jim.getAnnualSalary());
		System.out.println("------------------------------");
		System.out.println("Pam's salary: $" + pam.getSalary());
		System.out.println("Annual salary: $" + pam.getAnnualSalary());
		System.out.println("------------------------------");
		System.out.println("Bob's salary: $" + bob.getSalary());
		System.out.println("Annual salary: $" + bob.getAnnualSalary());
	}
}
