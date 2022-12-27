package inheritance.abstractClass.taskCars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Truck extends Transport {

    private final double maxLoad;


    public Truck(LocalDate registrationDate, double maxLoad, String color) {
        super(registrationDate, color);

        this.maxLoad = maxLoad;

    }




    public double getMaxLoad() {
        return maxLoad;
    }


    @Override
    public void go() {
        System.out.println("Truck is going");
    }
}
