package Logicalstatements;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		System.out.println("welcome to vcube matrimony");
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name:");
		String name=sc.nextLine();
		System.out.println("nice to meet you mr."+name);
		System.out.println("can you add your assets");
		double assets=sc.nextDouble();
		System.out.println("can you please tell me your salary");
		double salary=sc.nextDouble();
		if(assets>=50000000&&salary>=100000) {
			System.out.println("okay good to go");
		}else {
			System.out.println("you can leave for the day");
		}
		System.out.println("tell me your height");
		float height=sc.nextFloat();
		System.out.println("tell me your weight");
		float weight=sc.nextFloat();
		if(height>=6&&weight>=60) {
			System.out.println("you can match her");
		}else {
			System.out.println("you can not match her");
		}
		System.out.println("can you please tell me your age");
		int age=sc.nextInt();
		if(age>=27&&age<=29) {
			System.out.println("your age is matchable");
		}else {
			System.out.println("your age is not matchable and can leave");
		}
        boolean habstatus=sc.nextBoolean();
        if(!habstatus) {
        	 System.out.println("you are good");
        }else {
        	System.out.println("you are not good");
        }
        boolean siblings=sc.nextBoolean();
        if(!siblings) {
        	System.out.println("thank you i will marry you");
        }else {
        	System.out.println("you can leave for the day i wont marry you");
        }
	}

}
