package exceptionhandling.com;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Testdemoex9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("******online student portal******");
try {
	String name = null;
	System.out.println("string length:"+name.length());
}catch(NullPointerException ne) {
	System.out.println("NullPointerException: String is null");
}
	
  try{
	  System.out.println("enter your age");
	  int age=sc.nextInt();
	  System.out.println("student age:"+age);
  }catch(InputMismatchException ex) {
	  System.out.println("InputMismatchException: Please enter a number");
  }
	
	try {
		int totalmarks=200;
		int subjects=0;
		int average = totalmarks / subjects;
		System.out.println("average marks:"+average);
	}catch(ArithmeticException e) {
		System.out.println("ArithmeticException:cannot divide by zero");
	}
	try {
		int[] marks = { 80, 75, 90 };
		System.out.println("marks: " + marks[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException: Invalid array index");
	}

	
	finally {
		System.out.println("finally block executed");
		System.out.println("student portal completed");
	}
}
}