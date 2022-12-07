package loops;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        TaskTwo taskTwo = new TaskTwo();

        int[] ticket = taskTwo.getTicket();

        if (taskTwo.isValid(ticket) && taskTwo.isWin(ticket)) {
            System.out.println("Bilietas laimingas!");
        } else {
            System.out.println("Nieko nelaimejote.");
        }
    }

    private int[] getTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite sesiazekli bilieto numeri: ");
        String ticketNumber = sc.nextLine();

        int[] ticket = new int[ticketNumber.length()];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = Character.getNumericValue(ticketNumber.charAt(i));
        }
        return ticket;
    }

    private boolean isValid(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isWin(int[] arr) {

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < (arr.length / 2); i++) {
            sumLeft = sumLeft + arr[i];
            sumRight = sumRight + arr[arr.length - 1 - i];
        }
        return sumLeft == sumRight;
    }
}



