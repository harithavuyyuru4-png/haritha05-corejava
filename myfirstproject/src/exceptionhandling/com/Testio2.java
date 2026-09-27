package exceptionhandling.com;

import java.util.Scanner;

public class Testio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A number");
		int a=sc.nextInt();
		System.out.println("enter B number");
        int b=sc.nextInt();
        if(b!=0) {
        	System.out.println(a/b);
        	
        }else {
        	throw new ArithmeticException("babu pakkaki velli adukoo");
        }
	}

}
