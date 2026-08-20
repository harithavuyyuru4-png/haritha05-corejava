package arrays.com;

public class Largestelement {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		int []array= {13,57,23,78,89};
		int largest=array[0];
		for(int i=0;i<array.length;i++) {
		  if(array[i]>largest) {
			largest=array[i];
			
		}
	}
		System.out.println("largest number is:"+largest);

}
}