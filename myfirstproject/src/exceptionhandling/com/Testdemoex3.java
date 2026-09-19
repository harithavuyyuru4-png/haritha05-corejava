package exceptionhandling.com;

public class Testdemoex3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("in catch");
		}
	}

}
