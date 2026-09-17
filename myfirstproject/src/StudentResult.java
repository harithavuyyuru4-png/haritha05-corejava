import java.util.Scanner;
public class StudentResult {
     void displayStudent(String name) {
    	 System.out.println("student name:"+name);
     }
     void calculateTotal(int m1, int m2, int m3) {
    	 int calculateTotal= m1+m2+m3;
    	 System.out.println("Studentmarks:"+m1);
    	 System.out.println("Studentmarks:"+m2);
    	 System.out.println("Studentmarks:"+m3);
     }
     void calculateAverage(int m1, int m2, int m3) {
    	 double Average=(m1+m2+m3)/3.0;
    	 System.out.println("calculateAverage:"+Average);
     }
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 StudentResult s1=new StudentResult();
    	 System.out.println("enter student name:");
    	 String name=sc.nextLine();
    	 System.out.println("enter student m1 marks:");
    	 int m1=sc.nextInt();
    	 System.out.println("enter student m2 marks:");
    	 int m2=sc.nextInt();
    	 System.out.println("enter student m3 marks:");
    	 int m3=sc.nextInt();
    	 System.out.println("enter average marks:");
    	 double average=sc.nextDouble();
    	 //calling methods
    	 s1.displayStudent(name);
    	 s1.calculateTotal(m1,m2,m3);
    	 s1.calculateAverage(m1,m2,m3);
    	 
    	 
    	 
     }
}


