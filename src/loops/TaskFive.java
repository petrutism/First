package loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskFive taskFive = new TaskFive();

        int[] arrOne = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        taskFive.printArray(arrOne);

        int numberToRemove = taskFive.numberToRemove(scanner);

        while(numberToRemove > arrOne.length){
            System.out.println("Masyve nera tiek elementu.");
            numberToRemove = taskFive.numberToRemove(scanner);
        }

        int[] arrTwo = taskFive.removeElement(arrOne, numberToRemove);

        taskFive.printArray(arrTwo);

    }

    private void printArray (int [] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private int numberToRemove(Scanner scanner) {
        System.out.printf("%nKuri elementa is auksciau isvardintu salinsime (nurodykite eiles numeri) ? ");
        for (; ; ) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException err) {
                System.out.println("Iveskite SKAICIU: ");
                scanner.nextLine();
            }
        }
    }

    private int[] removeElement(int[] arr, int number) {
        if (number == arr.length) {
            int[] array = new int[arr.length - 1];
            System.arraycopy(arr, 0, array, 0, array.length);
            return array;
        } else {
            for (int i = number - 1; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            return arr;
        }

    }
}
