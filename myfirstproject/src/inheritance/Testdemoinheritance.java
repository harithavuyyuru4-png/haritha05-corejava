package inheritance;

class vechicle {
	void start() {
		System.out.println("********main method started***********");
		System.out.println("vechicle is in start");
	}
}

class car extends vechicle {
	void drive() {
		System.out.println("car is driving on the road");
		System.out.println("*********main method ended*********");
	}
}

public class Testdemoinheritance {

	public static void main(String[] args) {
		car c = new car();
		c.start();
		c.drive();
	}

}
