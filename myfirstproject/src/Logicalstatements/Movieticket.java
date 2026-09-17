package Logicalstatements;
import java.util.Scanner;
public class Movieticket {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the ticket type");
    System.out.println("1->silver=200");
    System.out.println("2->gold=300");
    System.out.println("3->platinum=500");
    System.out.println("enter your choice");
    int choice=sc.nextInt();
    switch(choice) {
    case 1:
    	System.out.println("enter your age");
    	int age1=sc.nextInt();
    	double silverprice=200;
    	if(age1>=60) {
    		silverprice=silverprice-(silverprice*10/100);
    		
    	}
    	System.out.println("silverprice:"+silverprice);
    	break;
    case 2:
    	System.out.println("enter your age");
    	int age2=sc.nextInt();
    	double goldprice=300;
    	if(age2>=60) {
    		goldprice=goldprice-(goldprice*10/100);
    		
    	}
    	System.out.println("goldprice:"+goldprice);
    	break;
    	default:
    		System.out.println("unknown or invalid !!try again");
    }
	}
	

}
