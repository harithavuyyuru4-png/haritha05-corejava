package arrays.com;

public class Bubblesort {

	public static void main(String[] args) {
		System.out.println("main method started!!!");
		int[]arr= {6,5,3,1,2,4};
		int temp=0;
		System.out.println("before sorting");
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
				count1++;
			}
			System.out.println("count:"+count);
		}
			System.out.println("after sorting");
			for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
		
	}

}

