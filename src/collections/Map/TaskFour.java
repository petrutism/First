package collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskFour {
    Map<Integer, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaskFour taskFour = new TaskFour();
        taskFour.selectAction(sc);
    }

    private void printMenu() {
        String info = """
                                
                1 - Input student
                2 - Get student by number
                3 - END
                """;
        System.out.println(info);
    }

    private void selectAction(Scanner sc) {

        while (true) {
            printMenu();
            String action = sc.nextLine();
            switch (action) {
                case "1" -> inputStudent(sc);
                case "2" -> {
                    Student result = getStudentBYNumber(sc);
                    if (result != null) {
                        System.out.println(result);
                    } else System.out.println("There is no such student");
                }
                case "3" -> {
                    System.out.println("FINISHING...");
                    return;
                }
                default -> System.out.println("There is no such action...");
            }
        }
    }

    private void inputStudent(Scanner sc) {
        String name;
        System.out.print("Input students name: ");
        name = sc.nextLine();

        String surname;
        System.out.print("Input students surname: ");
        surname = sc.nextLine();

        int number;
        System.out.print("Input students number: ");
        number = Integer.parseInt(sc.nextLine());

        String colledge;
        System.out.print("Input colledge: ");
        colledge = sc.nextLine();

        students.put(number, new Student(name, surname, colledge));

        System.out.println("Student added successfully...\n");
    }

    private Student getStudentBYNumber(Scanner sc) {
        int number;
        System.out.print("Input students number: ");
        number = Integer.parseInt(sc.nextLine());
        if (students.containsKey(number)) {
            return (students.get(number));
        }
        return null;
    }
}
