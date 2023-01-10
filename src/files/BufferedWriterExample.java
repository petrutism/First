package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite eilute, kuria rasysime i faila:");
        String line = sc.nextLine();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("pum.txt", true))) {
            bw.write(line);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Cannot write to file..." + e.getMessage());
        }
    }
}
