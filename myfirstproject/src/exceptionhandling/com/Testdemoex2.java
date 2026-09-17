package exceptionhandling.com;

public class Testdemoex2 {

	public static void main(String[] args) {
		String s=null;
		String s1=null;
		String s2="hello";
		System.out.println("main method started");
		System.out.println(s2.length());
		
		try {
			System.out.println(s.length());
		}catch(NullPointerException ne) {
			ne.printStackTrace();
			
		}
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
		System.out.println("main method started");
	}

}
