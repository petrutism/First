//Uzduotis reikalauja, kad duomenu ivedimas ir KMI skaiciavimas butu atliekami
//skirtinguose metoduose. Atskiro metodo nekuriame, nes main ir readData
//yra atskiri metodai. Suskaiciuosime metode main, nuskaitysime readData

package studies;

import java.util.Scanner;

public class FirstWeekendOne {
    public static void main(String[] args) {
        System.out.println("INFORMACIJA: jei reikia, dedame ne tašką, o kablelį, pvz.: 12,74");
        System.out.print("Ivesk kiek sveri, kilogramais: ");
        double weight = readData();

        if (weight <= 0) {
            System.out.println("Eik pavalgyk, perdaug lengvas");
            return;
        }

        System.out.print("Dabar ivesk savo ugi, metrais: ");
        double height = readData();

        if (height <= 0) {
            System.out.println("Kazkoks tu per zemas, eik pamiegoti ir nieko neskaiciuokime");
            return;
        }

        System.out.println("Tavo KMI yra:" + weight / Math.pow(height, 2));
    }

    public static double readData() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
