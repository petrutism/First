package exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int value = sc.nextInt();
            System.out.println(value);
        } catch (InputMismatchException e){
            System.out.println("Bloga ivestis...");
        }

    }
    private void testExeption () throws Exception {
        throw new Exception();
    }
}
