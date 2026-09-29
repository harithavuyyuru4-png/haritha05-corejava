package exceptionhandling.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Testio7 {

	public static void main(String[] args) throws IOException {
System.out.println("main method strated");
FileReader fr=new FileReader("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\java123.txt");
BufferedReader br=new BufferedReader(fr);
String s=br.readLine();
while(s!=null) {
	System.out.println(s);
	s=br.readLine();
}


	}

}
