package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream("object.txt"))) {
     Person person = (Person) oi.readObject();
            System.out.println(person);
        } catch (Exception e) {
            System.out.println("Cannot read file..." + e.getMessage());
        }
    }
}
