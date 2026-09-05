package Logicalstatements;
import java.util.Scanner;
public class Employeesbonus {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the employee's bonus status");
    double salary=sc.nextDouble();
    String EmployeesBonus=(salary>=500000)?"eligible to get a bonus":"eligible for not getting a bonus";
    System.out.println("EmployeesBonus:"+EmployeesBonus);
	}

}
