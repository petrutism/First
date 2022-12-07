package arrays;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite zodi belekokiomis raidemis: ");
        String word = sc.nextLine();

        char[] arr = new char[word.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(word.charAt(i));
            System.out.print(arr[i]);
        }
    }
}
