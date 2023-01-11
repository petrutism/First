package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class TaskOne {
    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        String line = "Mindaugas Petrutis";

        taskOne.writeFile(line, "taskone.txt");

        StringBuilder sb = taskOne.readFile("taskone.txt");
        System.out.println(sb);
        sb.reverse();
        taskOne.writeFile(sb.toString(), "taskone_copy.txt");

    }

    void writeFile(String line, String file) {
        try (FileOutputStream outputStream = new FileOutputStream(file)) {
            for (int i = 0; i < line.length(); i++) {
                outputStream.write(line.charAt(i));
            }
        } catch (IOException e) {
            System.out.println("Cannot write to file..." + e.getMessage());
        }
    }

    StringBuilder readFile (String file){
        StringBuilder sb = new StringBuilder();
        try (InputStream inputStream = new FileInputStream(file)) {

            int letter;
            while ((letter = inputStream.read()) > 0) {
                sb.append((char)letter);
            }

        } catch (IOException e) {
            System.out.println("Problemos su failu..." + e.getMessage());
        }

        return sb;
    }
}
