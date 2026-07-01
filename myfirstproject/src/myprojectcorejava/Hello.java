package myprojectcorejava;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main method started!");
		// Bootstrap loader is loading below classes
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
        //application loader is loading below classes
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended!");
	}

}
