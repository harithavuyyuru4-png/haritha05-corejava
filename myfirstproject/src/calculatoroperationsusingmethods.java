import java.util.Scanner;

public class calculatoroperationsusingmethods {
	void add(double a,double b) {
		System.out.println("addition:"+(a+b));
	}
	void substract(double a,double b) {
			System.out.println("substract:"+(a-b));
			}
	void multiply(double a,double b) {
		System.out.println("multiply:"+(a*b));
	}
	void divide(double a,double b) {
		System.out.println("divide:"+(a/b));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		double a=sc.nextDouble();
		System.out.println("enter second number");
		double b=sc.nextDouble();
		calculatoroperationsusingmethods c=new calculatoroperationsusingmethods();
		c.add(a,b);
		c.substract(a, b);
		c.multiply(a, b);
		c.divide(a, b);
		
		

	}

}
