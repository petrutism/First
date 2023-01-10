package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite ka rasysime i faila...:");
        String line = sc.nextLine();

// create file
//        File file = new File("pum.txt");
//        if(!file.exists()){
//            try{
//                file.createNewFile();
//            }catch (IOException e){
//                System.out.println("Cannot create file..." + e.getMessage());
//            }
//        }

        try (FileOutputStream outputStream = new FileOutputStream("test.txt")) {
            for (int i = 0; i < line.length(); i++) {
                outputStream.write(line.charAt(i));
            }
        } catch (IOException e) {
            System.out.println("Cannot write ro file..." + e.getMessage());
        }
    }
}
