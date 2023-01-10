package files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {

        try(ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream("object.txt"))){
            ob.writeObject(new Person ("Mindaugas", "Petrutis"));
        }catch (IOException e){
            System.out.println("Cannot write to file..." + e.getMessage());
        }

    }
}
