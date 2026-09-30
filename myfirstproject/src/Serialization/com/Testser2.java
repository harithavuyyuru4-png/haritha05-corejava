package Serialization.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Testser2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		System.out.println("main method started");
		File f=new File("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\bharu.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee obj=(Employee)ois.readObject();
		System.out.println(obj.username);
        System.out.println(obj.password);
	}

}
