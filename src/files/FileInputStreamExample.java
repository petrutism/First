package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("test.txt")){

            int letter;
            while ((letter = inputStream.read()) > 0) {
                System.out.print((char) letter);
            }

        } catch (IOException e) {
            System.out.println("Problemos su failu..." + e.getMessage());
        }

    }
}
