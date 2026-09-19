package exceptionhandling.com;

public class Testdemoex5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
			System.out.println(10/0);
			String s=null;
			System.out.println(s.length());
		}catch(ArithmeticException ae) {
			System.out.println("in catch of AE");
		}catch(NullPointerException ne) {
			System.out.println("in catch of NE");
		}catch(NumberFormatException ne) {
			System.out.println("in catch of NE");
			
			
		}
			}

	
	}


