package random;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        TaskTwo taskTwo = new TaskTwo();

        int number1 = taskTwo.generateNumber(rand);
        int number2 = taskTwo.generateNumber(rand);

        int input = taskTwo.choice();

        taskTwo.printResults(number1, number2, input);

    }

    private int choice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Spekite dvieju ridenimu suma: ");
        return sc.nextInt();
    }

    private int generateNumber(Random random) {

        return random.nextInt(1, 6) + 1;
    }

    private void printResults (int number1, int number2, int input){
        String text;
        int sum = number1 + number2;

        if (sum > input){
            text = ". Reikejo speti " + (sum-input) + " didesni skaiciu";
        } else if (sum < input) {
            text = ". Reikejo speti " + (input-sum) + " mazesni skaiciu";
        } else {
            text = ". Atspejote";
        }
        System.out.println("Pirmasis isrideno - " + number1);
        System.out.println("Antrasis isrideno - " + number2);
        System.out.print("Spejimas - " + input);
        System.out.print(text);

    }
}
