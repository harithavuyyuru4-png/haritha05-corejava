package exceptionhandling.com;

public class Testdemoex4 {

	public static void main(String[] args) {
System.out.println("main method started");
try {
	System.out.println("in try");
	System.out.println(10/0);
}catch(ArithmeticException ae) {
	System.out.println("in catch of AE");
}catch(NullPointerException ne) {
	System.out.println("in catch of NE");
}catch(NumberFormatException ne) {
	System.out.println("in catch of NE");
	
	
}
	}

}
