//Duomenis nuskaitysime metode readData
//Vidurkis bus skaiciuojamas metode average

package studies;

import java.util.Scanner;

import static java.lang.Math.abs;

public class FirstWeekendTwo {
    public static void main(String[] args) {

        System.out.print("Ivesk kiek kilometru nuvaziuota: ");
        String firstLine = readData();

        while (!isNumeric(firstLine)) {
            System.out.print("Nevedinek nesamoniu, ivesk kilometrus skaiciais: ");
            firstLine = readData();
        }
        double distance = Double.parseDouble(firstLine);

        System.out.print("Dabar ivesk, kiek tam atstumui sunaudota degalu: ");

        String secondLine = readData();

        while (!isNumeric(secondLine)) {
            System.out.print("Nevedinek nesamoniu, ivesk kuro sanaudas skaiciais: ");
            secondLine = readData();
        }
        double fuel = Double.parseDouble(secondLine);

        //--------jei atstumas 0---------

        if (distance == 0) {
            if (fuel == 0) {
                System.out.println("Nei vaziavai nei ka, sanaudos 0...");
                return;
            }
            if (fuel < 0) {
                System.out.println("Niekur nevaziuota, kuras papildytas " + abs(fuel) + " l");
                return;
            }
            System.out.println("Isdeginai kura stovedamas vietoje " + fuel + " l ir tiek...");
            return;
        }

        //---------jei vaziavome atbuline eiga---------
        if (distance < 0) {
            if (fuel == 0) {
                System.out.println("Stumti atbulomis neuzsivedus kuro nereikia. Sanaudos 0.");
                return;
            }
            if (fuel < 0) {
                System.out.println("Stumta atbulomis, kazkas dar papilde baka " + abs(fuel) + " l");
                return;
            }
            System.out.println("Isdeginai kura vaziuodamas atbulom vidutiniskai " + average(fuel, abs(distance)) + " l 100 km ir tiek...");
            return;
        }

        //------jei vaziavome i prieki------
        if (fuel == 0) {
            System.out.println("Automobilis varomas minties jega. Sanaudos 0.");
            return;
        }
        if (fuel < 0) {
            System.out.println("Vaziuojant kazkas dar papilde baka " + abs(fuel) + " l");
            return;
        }

        System.out.println("Vidutines kuro sanaudos yra " + average(fuel, distance) + " l 100 km");

    }

    public static String readData() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static double average(double a, double b) {
        return a * 100 / b;
    }

    //apsauga nuo durniu
    public static boolean isNumeric(String line) {
        if (line == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(line);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
