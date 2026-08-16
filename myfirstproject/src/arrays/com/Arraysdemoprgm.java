package arrays.com;

public class Arraysdemoprgm {

	public static void main(String[] args) {
		System.out.println("main method started");
		//step1:declaration
		int []ages;
		//step2:creation
		ages=new int[5];
		//step3:initialization
		ages[0]=20;
		ages[1]=30;
		ages[2]=45;
		ages[3]=27;
		ages[4]=20;
		//step4:representation
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>=30) {
			System.out.println(ages[i]);
		}

	}

}
}
