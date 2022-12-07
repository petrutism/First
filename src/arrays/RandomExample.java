package arrays;

import java.util.Random;

public class RandomExample {
    int[] randNumber = new int[3];

    public static void main(String[] args) {
        RandomExample randomExample = new RandomExample();
        Random rn = new Random();
        for (int j = 1; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                randomExample.randNumber[i] = rn.nextInt(100) + 1;
                System.out.println(randomExample.randNumber[i]);
            }

            int max = randomExample.randNumber[0];

            for (int i = 0; i < randomExample.randNumber.length; i++) {
                if (max < randomExample.randNumber[i]) {
                    max = randomExample.randNumber[i];
                }
            }
            System.out.println("Didziausias skaicius yra: " + max);
        }
    }
}
