package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskThree taskThree = new TaskThree();

        System.out.println("Masyvo elementu suma yra lygi " + taskThree.sumOfArray(taskThree.array(scanner)));
    }

    private int[] array(Scanner scanner) {
        System.out.println("Kiek masyve bus elementu? ");
        int count ;

        for (;;){
            try {
                count = scanner.nextInt();
                break;
            } catch (InputMismatchException err) {
                System.out.println("Iveskite SKAICIU: ");
                scanner.nextLine();
            }
        }

        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private int sumOfArray(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
