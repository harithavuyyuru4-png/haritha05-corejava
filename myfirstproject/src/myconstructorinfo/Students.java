package myconstructorinfo;

public class Students {
	int id;
	String name;
	
//prametrerised
	Students(int age,String name){
		System.out.println("parameterised constructor called**");
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		System.out.println("main method started***");
		Students s1=new Students(23,"kohli");
		s1.show();
		
		Students s2=new Students(27,"virat");
		
		s2.show();
		
		Students s3=new Students(29,"anusha");
		s3.show();
		System.out.println("main method ended***");
		
	}
	void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println("show method called");
		


	

	}

}
