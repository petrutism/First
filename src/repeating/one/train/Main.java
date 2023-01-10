package repeating.one.train;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main program = new Main();
        Scanner sc = new Scanner(System.in);
        Train train = new Train(2);
        program.selectAction(sc, train);
    }

    private void menu() {
        String menu = """
                1 - ilaipinti keleivius
                2 - pradeti vaziuoti
                3 - sustoti
                4 - islaipinti keleivius
                5 - spausdinti keleiviu sarasa
                6 - Pabaiga
                                
                """;
        System.out.println(menu);
    }

    private void selectAction(Scanner sc, Train train) {
        while (true) {
            menu();
            String userAction = sc.nextLine();
            switch (userAction) {
                case "1" -> addPassenger(sc, train);
                case "2" -> train.startMoving();
                case "3" -> train.stopMoving();
                case "4" -> System.out.println("islaipinti keleivius");
                case "5" -> train.printPassengers();
                case "6" -> {
                    System.out.println("FINISHING...");
                    return;
                }
                default -> System.out.println("Nera tokio pasirinkimo");
            }
        }
    }

    private void addPassenger(Scanner sc, Train train) {
        System.out.print("How many passengers will you add? ");
        int numberOfPassengers = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= numberOfPassengers; i++) {
            System.out.println("Enter passenger " + i + " name: ");
            String name = sc.nextLine();
            System.out.println("Enter passenger " + i + " surname: ");
            String surname = sc.nextLine();
            System.out.println("Enter passenger " + i + " destination: ");
            String destination = sc.nextLine();
            try {
                train.addPassenger(new Passenger(name, surname, destination));
            } catch (TrainExeption t){
                System.out.println(t.getMessage());
                break;
            }

        }
    }
}

