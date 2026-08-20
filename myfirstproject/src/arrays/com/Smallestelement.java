package arrays.com;

public class Smallestelement {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		int[] array = { 13, 57, 23, 78, 89 };
		int smallest = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];

			}
		}
		System.out.println("smallest number is:" + smallest);

	}

}
