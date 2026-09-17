package arrays.com;

public class Twodimensionalarray {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		int [][]numbers=new int[3][4];
		System.out.println(numbers.length);
		System.out.println(numbers[0].length);
	    System.out.println(numbers[1].length);
	    System.out.println(numbers[2].length);
	    numbers[0][0]=10;
	    numbers[0][1]=20;
	    numbers[0][2]=30;
	    numbers[0][3]=40;
	    
	    numbers[1][0]=50;
	    numbers[1][1]=60;
	    numbers[1][2]=70;
	    numbers[1][3]=80;
	    for(int []n1:numbers) {
	    	for(int n:n1) {
	    		System.out.println(n+"");
	    	}
	    	System.out.println();
	    }
	}

}
