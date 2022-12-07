package arrays;

import java.util.Scanner;

public class ArraysExample {
    int[] mas;
    int count = 0;

    public static void main(String[] args) {

        //objetas reikalingas prieiti prie ne statiniu metodu
        ArraysExample arraysExample = new ArraysExample();
        arraysExample.readData();
        arraysExample.maxNumber();
        arraysExample.average();
        arraysExample.sumOfpow();
    }

    private void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu ivedinesite? ");
        count = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Iveskite " + (i + 1) + " skaiciu: ");
            arr[i] = sc.nextInt();
        }
        mas = arr;
    }

    private void maxNumber() {
        int max = mas[0];
        for (int i = 1; i < count; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println("Didziausias ivestas skaicius yra: " + max);
    }

    private void average() {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + mas[i];
        }
        System.out.println("Ivestu skaiciu vidurkis yra: " + sum / count);
    }

    private void sumOfpow() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + mas[i] * mas[i];
        }
        System.out.println("Ivestu skaiciu kvadratu suma: " + sum);
    }
}
