package myproject.loopstatements;

import java.util.Scanner;

public class Fibanacciprogram {

	public static void main(String[] args) {
      System.out.println("main method started");
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number how many tymes that u want to repeat");
      int n=sc.nextInt();
      FibanacciSeries(n);
      System.out.println("main method ended");
      
	}
	static void  FibanacciSeries( int n) { 
		int n1=0;
		int n2=1;
		System.out.println(n1 + " " + n2 + " ");
		int n3=0;
		for(int i=1;i<=n-2;i++) {
		n3=n1+n2;
		System.out.println(n3 + " ");
		n1=n2;
		n2=n3;

}
}
}