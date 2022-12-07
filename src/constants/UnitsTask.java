package constants;

import java.util.Scanner;

public class UnitsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite metrus ");
        double value = scanner.nextDouble();

        System.out.println(value*MeasurementUnits.METER.getUnitValue() + MeasurementUnits.METER.getUnitName());
        //System.out.print("%sm converted to %s %s", value, value * MeasurementUnits.KILOMETER.getUnitValue(), MeasurementUnits.KILOMETER.getUnitName());
    }
}
