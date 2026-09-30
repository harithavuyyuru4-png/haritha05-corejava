package Serialization.com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
String username="haritha";
String password="hari123";

	}

public class Testser1 {

	public static void main(String[] args) throws IOException {
System.out.println("main method started");
Employee emp=new Employee();
File f=new File("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\bharu.txt");
FileOutputStream fos=new FileOutputStream(f);
ObjectOutputStream oos =new ObjectOutputStream(fos);
oos.writeObject(emp);


}
}