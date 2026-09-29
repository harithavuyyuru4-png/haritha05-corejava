package exceptionhandling.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Testio5 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		FileWriter fw=new FileWriter("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\java123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("java is simple");
		bw.write("java is robust");
		bw.write("java is secure");
       bw.close();
	}

}
