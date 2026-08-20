package arrays.com;

import java.util.Scanner;

public class Arraysize {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size");
		int size=sc.nextInt();
		int[]numbers=new int[size];
		System.out.println("enter the elements");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
			
		}
		

	}

}
