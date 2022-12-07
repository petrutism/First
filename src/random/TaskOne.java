package random;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskOne taskOne = new TaskOne();

        System.out.print("Input starting number of random: ");
        int start = taskOne.inputNumber(sc);
        System.out.print("Input ending number of random: ");
        int end = taskOne.inputNumber(sc);

        int rand = taskOne.generateRandom(start, end);
        System.out.println("Generated random number is " + rand);

    }
    private int inputNumber (Scanner scanner){
        return scanner.nextInt();
    }
    private int generateRandom (int start, int end){
        Random rand = new Random();
        return rand.nextInt(start, end) + 1;
    }
}
