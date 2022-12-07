package arrays;

import java.util.Random;
import java.util.Scanner;

//Sukurti masyvą, kurio dydis turi priklausyti nuovartotojo įvedamo skaičiaus
//Jei skaičiusdidesnis nei 7, programa Sukuria masyvą, kurio ilgis yra yra atsitiktinai sugeneruojamas bet maksimum 8.
//Pirmasis ir paskutinis elementai yra tokie patys skaičiai, kaip ir masyvo ilgis.

public class TaskOne {

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        Random random = new Random();

        int[] arr = new int[taskOne.arrLenght(random)];

        arr[0] = arr.length;
        arr[arr.length - 1] = arr.length;

        for (int i = 1; i < (arr.length - 2); i++) {
            arr[i] = random.nextInt(10) + 1;
        }
        for (int j : arr) {
            System.out.println(j);
        }

    }

    private int arrLenght(Random random) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu. Tai bus masyvo ilgis: ");
        int count = scanner.nextInt();
        if (count > 7) {
            return random.nextInt(8) + 1;
        }
         return count;
    }
}
