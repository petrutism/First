package inheritance.abstractClass.taskCars;

import java.time.LocalDate;

public class RunMeCarsTask {
    public static void main(String[] args) {
        Car bmw = new Car(LocalDate.of(2000, 10, 10), 100d, "red");
        Truck opel = new Truck(LocalDate.of(2001, 11, 12), 200d, "blue");
        opel.go();
        opel.getMaxLoad();
        opel.printRegistrationDate();
        opel.getColor();
        System.out.println("------------------");
        bmw.go();
        bmw.getCapacity();
        bmw.printRegistrationDate();
        bmw.getColor();
    }
}
