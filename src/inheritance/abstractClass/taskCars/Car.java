package inheritance.abstractClass.taskCars;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Car extends Transport {

    private final double capacity;



    public Car(LocalDate registrationDate, double capacity, String color) {
        super(registrationDate, color);

        this.capacity = capacity;

    }


       public double getCapacity() {
        return capacity;
    }


    @Override
    public void go() {
        System.out.println("Car is going...");
    }
}
