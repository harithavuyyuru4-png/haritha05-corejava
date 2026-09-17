package operators.java.com;
import java.util.Scanner;
public class Ternaryexample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter operator(+ or -)");
		char op=sc.next().charAt(0);
		int result=(op=='+')?num1+num2:num1-num2;
		System.out.println("the result:"+result);  

	}

}
