package arrays;

import java.util.Scanner;

public class WhileExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Iveskite neigima skaiciu: ");
        do {
            a = sc.nextInt();
        } while (a > 0);
    }
}
