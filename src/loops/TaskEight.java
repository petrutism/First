package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        TaskEight taskEight = new TaskEight();
        Scanner scanner = new Scanner(System.in);

        int count = taskEight.inputCount(scanner);

        int[] array = taskEight.fillArray(count);

        System.out.printf("%nPirma karta uzpildytas masyvas, pildome nuo galo: ");
        taskEight.printArray(array);

        array = taskEight.fillArrayTwo(array);

        System.out.printf("%nAntra karta uzpildytas masyvas: ");
        taskEight.printArray(array);

        System.out.printf("%nMasyvo iteracijos zingsnis 2, spausdiname nuo galo po du elementus: ");
        taskEight.printReverse(array);
    }

    private int inputCount(Scanner scanner) {
        System.out.printf("%nKiek masyve bus elementu ? ");
        for (; ; ) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Iveskite SKAICIU: ");
                scanner.nextLine();
            }
        }
    }

    private int[] fillArray(int count) {
        int[] arr = new int[count];
        for (int i = arr.length - 1; i > 0; i--) {
            if (i % 2 == 0) {
                arr[i] = i;
            } else {
                arr[i] = - i;
            }
        }
        return arr;
    }

    private int[] fillArrayTwo(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    private void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private void printReverse(int[] arr) {
        if (arr.length % 2 == 0) {
            for (int i = arr.length - 1; i > 0; i = i - 2) {
                System.out.print(arr[i] + " " + arr[i - 1] + " ");
            }
        } else {
            for (int i = arr.length - 1; i > 0; i = i - 2) {
                System.out.print(arr[i] + " " + arr[i - 1] + " ");
            }
            System.out.print(arr[0]);
        }
    }

}
