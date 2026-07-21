package myconstructorinfo;

public class Student {
	int id;
	String name;
	int age;
	String city;
	//no arg constructor
	Student(){
		System.out.println("no arg constructor called**");
	}

	public static void main(String[] args) {
		System.out.println("main method started***");
		Student s1=new Student();
		s1.show();
		
		Student s2=new Student();
		s2.id=45;
		s2.name="virat";
		s2.show();
	}
	void show() {
		System.out.println(id);
		System.out.println(name);

		
	}

}
