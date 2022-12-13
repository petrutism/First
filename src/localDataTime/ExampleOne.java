package localDataTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        Scanner sc = new Scanner(System.in);
        String inputTime = sc.nextLine();

        LocalTime time = LocalTime.parse(inputTime, f);
        LocalTime t = LocalTime.now();

        System.out.println("Ivestas laikas: " + time);
        System.out.println("Ivestas laikas + 2val 15 min: " + time.plusHours(2).plusMinutes(15));
        if(time.isBefore(t)) {
            System.out.println("Ivestas laikas yra anksciau uz dabarties laika");
        } else {
            System.out.println("Ivestas laikas yra veliau");
        }
    }
}