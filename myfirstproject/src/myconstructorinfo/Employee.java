package myconstructorinfo;

public class Employee {
	int eid;
	String empname;
	double empsal;
public  Employee() {
	System.out.println("no arg argument");	
	eid=100;
	empname="anusha";
	empsal=50000.00;
}
	public static void main(String[] args) {
System.out.println("main method started");
Employee e1=new Employee();
e1.empInfo();
System.out.println("main method ended");
	}
	void empInfo() {
		System.out.println(eid);
		System.out.println(empname);
		System.out.println(empsal);
		
	}

}
