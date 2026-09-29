package exceptionhandling.com;



import java.io.File;
import java.io.FileReader;

public class Testio3 {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\harit\\OneDrive\\Desktop\\B75UI\\code.txt");

        try (FileReader fr = new FileReader(f)) {

            int i = fr.read();

            while (i != -1) {
                System.out.println((char) i);
                i = fr.read();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



