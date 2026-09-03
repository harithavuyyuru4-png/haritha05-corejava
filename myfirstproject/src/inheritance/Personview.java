package inheritance;

class person{
	int age;
	String name;
	
}
class student extends person{
	String collegename;
	student(int age,String name,String collegename){
		
	
	this.collegename=collegename;
	}
}
public class Personview {

	public static void main(String[] args) {
		
		student s=new student(23,"haritha","vcube");
 System.out.println("name:"+s.age);
 System.out.println("age:"+s.name);
 System.out.println("collegename:"+s.collegename);
	}

}
