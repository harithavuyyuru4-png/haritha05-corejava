package exceptionhandling.com;

public class Testdemoex7 {

	public static void main(String[] args) {
		try {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 10;
		}catch(Exception e) {
			System.out.println("in catch");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("main method ended");
	}

}
