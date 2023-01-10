package repeating.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();

        List<Integer> numbers = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Iveskite a: ");
        int a = sc.nextInt();

        System.out.print("Iveskite b: ");
        int b = sc.nextInt();


        for (int i = a; i <= b; i++) {
            if (primeNumbers.prime(i)) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
    private boolean prime(int i) {
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }


}
