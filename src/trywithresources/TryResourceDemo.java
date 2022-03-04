package trywithresources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryResourceDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileStream=new FileOutputStream("input.txt");
        try(fileStream){
            String greeting = "Welcome to java and this is Try with Resource new Feature.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
