package exceptionhandling.com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Testio6 {

	public static void main(String[] args) throws FileNotFoundException {
  System.out.println("main method started");
  PrintWriter pw=new PrintWriter("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\cricket.txt");
  pw.println(123);
  pw.println("haritha");
  pw.println('A');
  pw.println(123.5);
  pw.close();
	}

}
