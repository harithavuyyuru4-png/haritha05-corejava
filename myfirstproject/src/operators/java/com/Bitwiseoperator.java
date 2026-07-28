package operators.java.com;

public class Bitwiseoperator {

	public static void main(String[] args) {
		System.out.println("main method started");
		//and operator
		System.out.println(true&true);
		System.out.println(true&false);
		System.out.println(false&true);
		System.out.println(false&false);
		//or operator
		System.out.println(true|true);
		System.out.println(true|false);
		System.out.println(false|true);
		System.out.println(false|false);
		//x-or operator
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
		System.out.println(1&1);
		System.out.println(1&0);
		System.out.println(0&0);
		System.out.println(67&55);
		System.out.println(86&39);
		System.out.println(88&66);
	}

}
