package exceptionhandling.com;

public class Testdemoex6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			int x=10/4;
			String str="srikanth";
		
			System.out.println(str.charAt(10));
		}catch(StringIndexOutOfBoundsException se) {
		System.out.println("main method ended");

	}

}
}