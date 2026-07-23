package myconstructorinfo;
import java.util.Scanner;

class student{
	int id;
	String name;
	String course;
	public student(){
		System.out.println("student constructor called");
	}
	public student(int id){
		this();
		this.id=id;
		System.out.println("student intid constructor called");
	}
	
	public student(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("student intid,strname constructor called");
		}
	
	public student(int id,String name,String course) {
		this(id,name);
		this.course=course;
		System.out.println("******student details********");
		System.out.println("studentid:"+id);
		System.out.println("studentname:"+name);
		System.out.println("studentcourse:"+course);
		
	}
}

public class Studentadmission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENTID");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("ENTER THE STUDENTNAME");
		String name=sc.nextLine();
		System.out.println("ENTER THE STUDENTCOURSE");
		String course=sc.nextLine();
		student s=new student( id,name,course);
		
		
	}

}
