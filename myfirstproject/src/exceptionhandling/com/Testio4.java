package exceptionhandling.com;
//file writer
import java.io.FileWriter;
import java.io.IOException;

public class Testio4 {

	public static void main(String[] args) throws IOException {
System.out.println("main method started");
FileWriter fw=new FileWriter("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\haritha.txt");
fw.write(65);
fw.write('\n');
fw.write('A');
fw.write('\n');
fw.write('S');
fw.close();
	}

}
