package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskFive {
    List<String> words = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TaskFive tt = new TaskFive();
        String action;

        do {
            tt.menu();
            action = sc.nextLine();
            switch (action) {
                case "1" -> tt.inputWord(sc);
                case "2" -> tt.findWord(sc);
                case "3" -> tt.deleteWord(sc);
                case "4" -> {
                    System.out.println(tt.words);
                    tt.words.clear();
                    System.out.println(tt.words);
                }
                case "5" -> {
                    System.out.println("FINISHING");
                    return;
                }
                default -> System.out.println("Action is not available");
            }
        } while (true);

    }

    private void menu() {
        String text = """
                1 - ivesti zodi
                2 - rasti zodi
                3 - trinti zodi
                4 - isvalyti sarasa
                5 - baigti darba
                """;
        System.out.println(text);
    }

    private void inputWord(Scanner sc) {
        System.out.print("Input word to add: ");
        String line = sc.nextLine();

        words.add(line);
    }

    private void findWord(Scanner sc) {
        System.out.print("Input word to find: ");
        String line = sc.nextLine();
        if (words.contains(line)) {
            System.out.println("This word is number " + (words.indexOf(line) + 1) + " in our list");
        }
    }

    private void deleteWord(Scanner sc) {
        System.out.print("Input word to delete: ");
        String line = sc.nextLine();
        if (words.remove(line)) {
            System.out.println("Word is removed");
            System.out.println(words);
        } else {
            System.out.println("There is nothing to delete");
        }
    }

}