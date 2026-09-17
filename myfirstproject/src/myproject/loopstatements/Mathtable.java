package myproject.loopstatements;

import java.util.Scanner;

public class Mathtable {
//9 X 1 = 9
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to proceed");
		int n=sc.nextInt();
		System.out.println("enter how many tymes that you want to print");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			System.out.println(n + "X" + i + "=" + (n*i)  );
			
		}

	}

}
