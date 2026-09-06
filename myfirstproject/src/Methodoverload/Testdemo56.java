package Methodoverload;

public class Testdemo56 {

	 void main(String[] args) {
		System.out.println("main method started");
		add(10,20);
		add(10,20,30);	
		add(10,20,30,40);	
		add(10,20,30,40,50);	
		}
	 void add(int...a) {
		 int sum=0;
		 for(int a1:a) {
			 sum=sum+a1;			 
			 
		 }
		 System.out.println("sum:"+sum);
	 }
}